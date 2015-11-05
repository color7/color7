package com.color.action;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String jsonResult;

	public String ajax() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Zohar");
		jsonResult = jsonObject.toJSONString();
		return SUCCESS;
	}

	public String simple() {
		return "simple";
	}

	public String getJsonResult() {
		return jsonResult;
	}

	public void setJsonResult(String jsonResult) {
		this.jsonResult = jsonResult;
	}

}
