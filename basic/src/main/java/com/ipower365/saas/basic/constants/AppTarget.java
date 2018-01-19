package com.ipower365.saas.basic.constants;

import java.util.HashSet;
import java.util.Set;

public enum AppTarget {
    // AptGuest:公寓客人, AptSvr:公寓服务人员, AptOwner:公寓管家, AptMgr:公寓经理, 
	//ThirdSys:第三方系统, AptDeliver:公寓实施人员, OpenApi:对外API 联寓抄表员,Saas20 后台系统
    Deliver, Provider, Ipower, Hotel, HotelGuest, Apartment, AptGuest, AptSvr, AptOwner, System, AptMgr,
    ThirdSys, AptDeliver, OpenApi, AssetMeterReader, Saas20;

    private static final AppTarget[] guestApps = {HotelGuest, AptGuest};
    private static final AppTarget[] employApps = {AptMgr, AptSvr, AptOwner, AptDeliver, AssetMeterReader};
    // web端
    private static final AppTarget[] webApps = {Hotel, Apartment, Ipower};

    /**
     * 客人使用的app
     * @return
     */
    public static Set<AppTarget> getGuestApps() {
        Set<AppTarget> results = new HashSet<AppTarget>(5);
        for (AppTarget app : guestApps) {
            results.add(app);
        }
        return results;
    }

    /**
     * 客户内部使用的app
     * @return
     */
    public static Set<AppTarget> getEmployAppsApps() {
        Set<AppTarget> results = new HashSet<AppTarget>(5);
        for (AppTarget app : employApps) {
            results.add(app);
        }
        return results;
    }

    /**
     * web端app
     * @return
     */
    public static Set<AppTarget> getWebApps() {
        Set<AppTarget> results = new HashSet<AppTarget>(5);
        for (AppTarget app : webApps) {
            results.add(app);
        }
        return results;
    }

    public static AppTarget get(String app) {
        AppTarget[] targets = AppTarget.values();
        for (AppTarget t : targets) {
            if (t.toString().equals(app)) {
                return t;
            }
        }
        return null;
    }

    /**
     * 是否为员工使用app，先只返回web端的类型
     * @param target
     * @return
     */
    public static boolean isStaffApp(AppTarget target) {
        for (AppTarget app : webApps) {
            if (app == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * 是否为移动端APP
     * @param target
     * @return
     */
    public static boolean isMobileApp(AppTarget target) {
        for (AppTarget app : guestApps) {
            if (app == target) {
                return true;
            }
        }
        for (AppTarget app : employApps) {
            if (app == target) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 是否为web端
     * @param target
     * @return
     */
    public static boolean isWebApp(AppTarget target) {
        for (AppTarget app : webApps) {
            if (app == target) {
                return true;
            }
        }
        return false;
    }
}
