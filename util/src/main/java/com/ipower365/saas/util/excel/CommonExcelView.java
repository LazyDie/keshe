package com.ipower365.saas.util.excel;

import java.io.*;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Author yan
 * date 2017-8-15 17:48
 * 通用导出csv工具类
 */
@SuppressWarnings({"unchecked"})
public class CommonExcelView {

    /**
     * @param list     查询的数据集
     * @param file     写入的文件
     * @param titleCN  导出的第一行数据
     * @param titleMap 存放表头与数据字段的对应关系
     * @param flog     是否打印头 true 打印 false 不打印
     * @throws Exception
     */
    public void buildCsvDocument(File file, List list, String[] titleCN, Map<String, String> titleMap, boolean flog) throws Exception {
        BufferedWriter out = null;
        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "gbk"));
        if (flog) {
            for (int i = 0; i < titleCN.length; i++) {                             //遍历titleCN,表的第一行写入titleCN
                if (i == titleCN.length - 1) {
                    out.write(titleCN[i] + "\n");
                } else {
                    out.write(titleCN[i] + ",");
                }
            }
        }
        for (Object object : list) {                                         //遍历list里的数据
            readClassAttr(object, out, titleCN, titleMap);
        }
        out.flush();
        out.close();
    }


    /**
     * @param o       list集全里面的对象
     * @param out     把结果放到缓冲区
     * @param titleCN 导出的第一行数据
     * @param map     存放表头与数据字段的对应关系
     * @throws Exception
     */
    private void readClassAttr(Object o, BufferedWriter out, String[] titleCN, Map<String, String> map) throws Exception {
        if (o instanceof Map) {
            Map<String, Object> entity = (Map<String, Object>) o;
            Set<String> keySet = entity.keySet();
            for (int n = 0; n < titleCN.length; n++) {
                String str = map.get(titleCN[n]);
                if (!entity.containsKey(str)) {
                    entity.put(str, null);
                }
                for (String key : keySet) {
                    Object value = entity.get(key);
                    if (key != null && key.equals(str)) {
                        if (value != null && !"".equals(value.toString())) {
                            String simpleClass = value.getClass().getSimpleName();
                            if (simpleClass.equals("Date")) {
                                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                if (n == titleCN.length - 1) {
                                    out.write(df.format(value) + "\t" + "\n");
                                } else {
                                    out.write(df.format(value)  + "\t" + ",");
                                }
                            } else if (simpleClass.equals("Integer")) {
                                if (n == titleCN.length - 1) {
                                    out.write(value.toString() + "\t" + "\n");
                                } else {
                                    out.write(value.toString() + "\t" + ",");
                                }

                            } else if (simpleClass.equals("Double")) {
                                if (n == titleCN.length - 1) {
                                    out.write(value.toString() + "\t" + "\n");
                                } else {
                                    out.write(value.toString() + "\t" + ",");
                                }
                            } else {
                                String temp = value.toString().trim();
                                temp = temp.replaceAll(",", "，");
                                if (n == titleCN.length - 1) {
                                    out.write(temp + "\t" + "\n");
                                } else {
                                    out.write(temp + "\t" + ",");
                                }
                            }
                        } else {                                                                 //如果字段没有值，做处理
                            if (n == titleCN.length - 1) {
                                out.write("" + "\t" + "\n");
                            } else {
                                out.write("" + "\t" + ",");
                            }
                        }
                        break;
                    }
                }
            }
        } else {
            Field[] fields = o.getClass().getDeclaredFields();
            for (int n = 0; n < titleCN.length; n++) {
                String str = map.get(titleCN[n]);
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (field.getName().equals(str)) {
                        if (field.get(o) != null && !"".equals(field.get(o).toString())) {
                            String simpleClass = field.get(o).getClass().getSimpleName();
                            if (simpleClass.equals("Date")) {
                                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                if (n == titleCN.length - 1) {
                                    out.write(df.format(field.get(o)) + "\t" + "\n");
                                } else {
                                    out.write(df.format(field.get(o)) + "\t" + ",");
                                }
                            } else if (simpleClass.equals("Integer")) {
                                if (n == titleCN.length - 1) {
                                    out.write(field.get(o).toString() + "\t" + "\n");
                                } else {
                                    out.write(field.get(o).toString() + "\t" + ",");
                                }

                            } else if (simpleClass.equals("Double")) {
                                if (n == titleCN.length - 1) {
                                    out.write(field.get(o).toString() + "\t" + "\n");
                                } else {
                                    out.write(field.get(o).toString() + "\t" + ",");
                                }
                            } else {
                                String temp = field.get(o).toString().trim();
                                temp = temp.replaceAll(",", "，");
                                if (n == titleCN.length - 1) {
                                    out.write(temp + "\t" + "\n");
                                } else {
                                    out.write(temp + "\t" + ",");
                                }
                            }
                        } else {//如果字段没有值，做处理
                            if (n == titleCN.length - 1) {
                                out.write("" + "\t" + "\n");
                            } else {
                                out.write("" + "\t" + ",");
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
}