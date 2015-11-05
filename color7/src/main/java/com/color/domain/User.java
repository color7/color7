package com.color.domain;

// Generated 2015-11-2 0:52:26 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 用户实体
 * 
 */
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3031848295913066566L;
	private Integer userId;
	private Integer uid;
	private String codeName;
	private String userAccount;
	private Short accountType;
	private String userPassword;
	private Date createTime;
	private Short userStatus;
	private String userMobile;
	private Short isFirstLogin;
	private BigDecimal percentMax;
	private Integer parentUserId;
	private String userLevel;

	public User() {
	}

	public User(Integer userId, Integer uid, String codeName,
			String userAccount, Short accountType, String userPassword,
			Date createTime, Short userStatus, String userMobile,
			Short isFirstLogin, BigDecimal percentMax, Integer parentUserId,
			String userLevel) {
		this.userId = userId;
		this.uid = uid;
		this.codeName = codeName;
		this.userAccount = userAccount;
		this.accountType = accountType;
		this.userPassword = userPassword;
		this.createTime = createTime;
		this.userStatus = userStatus;
		this.userMobile = userMobile;
		this.isFirstLogin = isFirstLogin;
		this.percentMax = percentMax;
		this.parentUserId = parentUserId;
		this.userLevel = userLevel;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public Short getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Short accountType) {
		this.accountType = accountType;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Short getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(Short userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public Short getIsFirstLogin() {
		return this.isFirstLogin;
	}

	public void setIsFirstLogin(Short isFirstLogin) {
		this.isFirstLogin = isFirstLogin;
	}

	public BigDecimal getPercentMax() {
		return this.percentMax;
	}

	public void setPercentMax(BigDecimal percentMax) {
		this.percentMax = percentMax;
	}

	public Integer getParentUserId() {
		return this.parentUserId;
	}

	public void setParentUserId(Integer parentUserId) {
		this.parentUserId = parentUserId;
	}

	public String getUserLevel() {
		return this.userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

}
