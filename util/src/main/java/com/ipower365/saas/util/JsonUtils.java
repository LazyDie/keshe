package com.ipower365.saas.util;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipower365.saas.basic.constants.Constants;

/**
 * json与object互转工具
 * 
 * @author kevin
 *
 */
public final class JsonUtils {
	private final static ObjectMapper mapper = new ObjectMapper();
	static {
		SimpleDateFormat df = new SimpleDateFormat(Constants.DEFULT_DATE_FORMATTER);
		mapper.setDateFormat(df);
	}

	private JsonUtils() {
	}

	private static JavaType getCollectionType(Class<?> collectionClass, ObjectMapper om, Class<?>... elementClasses) {
		if (null != om)
			return om.getTypeFactory().constructParametrizedType(collectionClass, collectionClass, elementClasses);
		return mapper.getTypeFactory().constructParametrizedType(collectionClass, collectionClass, elementClasses);
	}

	/**
	 * json数组转ArrayList
	 * 
	 * @param jsonArray
	 * @param Class
	 *            <?> c
	 * @return
	 */
	public static <T> List<T> fromJsonArray(String jsonArray, Class<T> c) {
		try {
			JavaType javaType = getCollectionType(ArrayList.class, null, c);
			return mapper.readValue(jsonArray, javaType);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static <T> Map<String, T> fromJsonMap(String jsonMap, Class<T> c) {
		try {
			JavaType javaType = getCollectionType(HashMap.class, null, String.class, c);
			return mapper.readValue(jsonMap, javaType);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json转object
	 * 
	 * @param json
	 * @param Class
	 *            <?> c
	 * @return
	 */
	public static <T> T fromJson(String json, Class<T> c, DateFormat dateFormat) {
		try {
			if (null != dateFormat) {
				ObjectMapper mapper = new ObjectMapper();
				mapper.setDateFormat(dateFormat);
				return (T) mapper.readValue(json, c);
			}
			return fromJson(json, c);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * object转json
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj, DateFormat dateFormat) {
		try {
			if (null != dateFormat) {
				ObjectMapper mapper = new ObjectMapper();
				mapper.setDateFormat(dateFormat);
				return mapper.writeValueAsString(obj);
			}
			return toJson(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json数组转ArrayList
	 * 
	 * @param jsonArray
	 * @param Class
	 *            <?> c
	 * @return
	 */
	public static <T> List<T> fromJsonArray(String jsonArray, Class<T> c, DateFormat dateFormat) {
		try {
			if (null != dateFormat) {
				ObjectMapper mapper = new ObjectMapper();
				mapper.setDateFormat(dateFormat);
				JavaType javaType = getCollectionType(ArrayList.class, mapper, c);
				return mapper.readValue(jsonArray, javaType);
			}
			return fromJsonArray(jsonArray, c);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static <T> Map<String, T> fromJsonMap(String jsonMap, Class<T> c, DateFormat dateFormat) {
		try {
			if (null != dateFormat) {
				ObjectMapper mapper = new ObjectMapper();
				mapper.setDateFormat(dateFormat);
				JavaType javaType = getCollectionType(HashMap.class, mapper, String.class, c);
				return mapper.readValue(jsonMap, javaType);
			}
			return fromJsonMap(jsonMap, c);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json转object
	 * 
	 * @param json
	 * @param Class
	 *            <?> c
	 * @return
	 */
	public static <T> T fromJson(String json, Class<T> c) {
		try {
			return (T) mapper.readValue(json, c);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * object转json
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
