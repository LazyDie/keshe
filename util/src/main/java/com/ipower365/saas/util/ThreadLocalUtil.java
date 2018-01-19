package com.ipower365.saas.util;

import net.sf.json.JSONObject;

public class ThreadLocalUtil {
	private static final ThreadLocal<JSONObject> loginInfo = new ThreadLocal<JSONObject>();

	public static void setLoginInfo(JSONObject o) {
		loginInfo.set(o);
	}

	public static JSONObject getLoginInfo() {
		return loginInfo.get();
	}

	public static void removeLoginInfo() {
		loginInfo.remove();
	}

	public static Integer getPersonId() {
		JSONObject jo = loginInfo.get();
		if (null != jo)
			try {
				return Integer.parseInt(jo.getString("key"));
			} catch (NumberFormatException e) {
//				e.printStackTrace();
			}
		return null;
	}

	public static Integer getStaffId() {
		JSONObject jo = loginInfo.get();
		if (null != jo)
			try {
				return jo.getInt("staffId");
			} catch (Exception e) {
//				e.printStackTrace();
			}
		return null;
	}

	public static String getPersonName() {
		JSONObject jo = loginInfo.get();
		if (null != jo)
			try {
				return jo.getString("customerName");
			} catch (Exception e) {
//				e.printStackTrace();
			}
		return null;
	}
	
	public static Integer getOrgId() {
        JSONObject jo = loginInfo.get();
        if (null != jo)
            try {
                return jo.getInt("orgId");
            } catch (Exception e) {
//              e.printStackTrace();
            }
        return null;
    }
}
