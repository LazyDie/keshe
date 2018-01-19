package com.ipower365.saas.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public final class PayUtils {
	private PayUtils() {
	}

//	private static Map<String, AtomicInteger> atoMap = new ConcurrentHashMap<>();
//	private static Map<String, AtomicInteger> yeeAtoMap = new ConcurrentHashMap<>();
//
//	public static String getPaymentSerial(PaymentChannel channel) {
//		String no = DateUtil.format("yyyyMMddHHmmssSSS", new Date());
//		String yeeNo = DateUtil.format("yyyyMMddHHmmss", new Date());
//
//		if (PaymentChannel.yee == channel) {
//			AtomicInteger atomicInteger = yeeAtoMap.get(yeeNo);
//			if (null == atomicInteger) {
//				atomicInteger = new AtomicInteger(1);
//				yeeAtoMap.clear();
//				yeeAtoMap.put(yeeNo, atomicInteger);
//			}
//			return yeeNo + atomicInteger.getAndIncrement();
//		} else {
//			AtomicInteger atomicInteger = atoMap.get(no);
//			if (null == atomicInteger) {
//				atomicInteger = new AtomicInteger(1);
//				yeeAtoMap.clear();
//				yeeAtoMap.put(yeeNo, atomicInteger);
//			}
//			return no + StringUtil.prefix0(atomicInteger.getAndIncrement(), 3);
//		}
//	}

	/**
	 * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
	 * 
	 * @param params
	 *            需要排序并参与字符拼接的参数组
	 * @return 拼接后字符串
	 */
	public static String createLinkString(Map<String, String> params, String enc) {

		List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);

		String prestr = "";

		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			String value = params.get(key);
			String v = "";
			if (CommonUtil.isEmpty(enc)) {
				v = value;
			} else {
				try {
					v = URLEncoder.encode(value, enc);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}

			if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
				prestr = prestr + key + "=" + v;
			} else {
				prestr = prestr + key + "=" + v + "&";
			}
		}

		return prestr;
	}

	@SuppressWarnings("rawtypes")
	public static Map<String, String> parsePram(HttpServletRequest req) {
		Map<String, String> map = new HashMap<String, String>();
		Map requestParams = req.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			map.put(name, valueStr);
		}
		return map;
	}
	
//	public static void main(String...strings ){
//		System.out.println(PayUtils.getPaymentSerial(PaymentChannel.ali));
//		System.out.println(PayUtils.getPaymentSerial(PaymentChannel.wechat));
//		System.out.println(PayUtils.getPaymentSerial(PaymentChannel.yee));
//	}
}
