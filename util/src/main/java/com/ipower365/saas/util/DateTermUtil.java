package com.ipower365.saas.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;


/**
 * 日期周期结算
 * @author anker
 *
 */
public class DateTermUtil {
    
    //private static final Logger LOG = LoggerFactory.getLogger(DateTermUtil.class);

    public static List<EachTerm> splitRentTerm(Date start, Date end, int fq) {
        List<Date> starts = new ArrayList<Date>();
        List<Date> ends = new ArrayList<Date>();
        if (start.getTime() > end.getTime()) {
            return Collections.emptyList();
        }
        start = DateUtils.truncate(start, Calendar.DATE);
        end = DateUtils.truncate(end, Calendar.DATE);

        Calendar startTime = Calendar.getInstance();
        startTime.setTime(start);

        Calendar endTime = Calendar.getInstance();
        endTime.setTime(end);

        starts.add(start);
        int maxCount = 1000;
        int month = startTime.get(Calendar.MONTH);
        int day = startTime.get(Calendar.DATE);
        int year = startTime.get(Calendar.YEAR);
        boolean pieces = false; // 是否有零碎的区间
        while (true) {
            Date cDate = startTime.getTime();
            month += fq;
            if (month > 11) {
                int y = month / 12;
                int m = month % 12;
                // month = (month - 12);
                month = m;
                year += y;
            }
            startTime.set(Calendar.MONTH, month);
            startTime.set(Calendar.DATE, day);
            startTime.set(Calendar.YEAR, year);
            int cday = startTime.get(Calendar.DATE);
            Date nextEnd = null;
            Date nextStart = null;
            // 日期数不相同的情况（3.31号~2.31号），开始时间取上月的最后一天
            if (cday != day) {
                nextStart = DateUtils.addMonths(cDate, fq);
            } else {
                nextStart = startTime.getTime();
            }
            nextEnd = DateUtils.addDays(nextStart, -1);

            if (nextEnd.getTime() <= endTime.getTime().getTime()) {
                ends.add(nextEnd);
            }
            if (nextStart.getTime() > endTime.getTime().getTime()) {
                break;
            }
            starts.add(nextStart);
            if (--maxCount < 0) {
                // 防止死循环
                break;
            }
        }
        Date lastE = null;
        if (ends.size() > 0) {
            lastE = ends.get(ends.size() - 1);
        }
        // 最后一个区间的结束时间小于输入的结束时间，把输入的结束时间作为最后区间的结束时间
        if (lastE == null || lastE.getTime() < endTime.getTime().getTime()) {
            ends.add(endTime.getTime());
            pieces = true;
        }
        List<EachTerm> terms = new ArrayList<EachTerm>();
        for (int i = 0; i < starts.size(); i++) {
            String e = null;
            if (i < ends.size()) {
                e = DateUtil.formatNormal(ends.get(i));
            }
            String s = DateUtil.formatNormal(starts.get(i));
            if (StringUtils.isNotBlank(s) && StringUtils.isNotBlank(e)) {
                // 结束时间格式化为59:59
                EachTerm term = new EachTerm();
                Date startDate = DateUtils.truncate(starts.get(i), Calendar.DATE);
                Date endDate = DateUtils.truncate(ends.get(i), Calendar.DATE);
                term.setStartTime(startDate);
                term.setEndTime(DateUtils.addSeconds(DateUtils.addDays(endDate, 1), -1));
                terms.add(term);
            }
        }
        if (CommonUtil.isNotEmpty(terms)) {
            terms.get(terms.size() - 1).setPieces(pieces);
        }
        /*for (EachTerm e : terms) {
            LOG.debug(e.toString());
        }*/
        return terms;
    }

    public static class EachTerm {

        private Date startTime;
        private Date endTime;
        private boolean pieces;


        public Date getStartTime() {
            return startTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Date getEndTime() {
            return endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }

        public boolean isPieces() {
            return pieces;
        }

        public void setPieces(boolean pieces) {
            this.pieces = pieces;
        }

        @Override
        public String toString() {
            return "EachTerm [startTime=" + startTime + ", endTime=" + endTime + ", pieces=" + pieces + "]";
        }
    }

}
