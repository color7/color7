package com.color.util;

/**
 * @author Zohar
 * 
 */
public class StringUtil {

	/**
	 * 是否不是空指针 是：false，不是：true
	 * 
	 * @param args
	 * @return
	 */
	public static boolean isNotNull(String args) {
		if (args == null) {
			return false;
		}
		return true;
	}

	/**
	 * 是否不是空值或空指针 是：false，不是：true
	 * 
	 * @param args
	 * @return
	 */
	public static boolean isNotEmpty(String args) {
		if (args == null || args.equals("")) {
			return false;
		}
		return true;
	}

	/**
	 * 空指针转成空值
	 * 
	 * @param nullObject
	 * @return
	 */
	public static <T> String nullToString(T nullObject) {
		if (nullObject != null) {
			return nullObject.toString();
		}
		return "";
	}

}
