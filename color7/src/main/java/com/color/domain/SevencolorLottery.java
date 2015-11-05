package com.color.domain;

// Generated 2015-11-2 0:52:26 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * 七星彩开奖号码实体
 */
public class SevencolorLottery implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5361032469962648041L;
	private Integer lotteryId;
	private String ballOne;
	private String ballTwo;
	private String ballThree;
	private String ballFour;
	private String ballFive;
	private String ballSix;
	private String ballSeven;
	private String lotteryNumber;
	private Date lotteryTime;
	private String issueNumber;

	public SevencolorLottery() {
	}

	public SevencolorLottery(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public SevencolorLottery(Integer lotteryId, String ballOne, String ballTwo,
			String ballThree, String ballFour, String ballFive, String ballSix,
			String ballSeven, String lotteryNumber, Date lotteryTime,
			String issueNumber) {
		this.lotteryId = lotteryId;
		this.ballOne = ballOne;
		this.ballTwo = ballTwo;
		this.ballThree = ballThree;
		this.ballFour = ballFour;
		this.ballFive = ballFive;
		this.ballSix = ballSix;
		this.ballSeven = ballSeven;
		this.lotteryNumber = lotteryNumber;
		this.lotteryTime = lotteryTime;
		this.issueNumber = issueNumber;
	}

	public Integer getLotteryId() {
		return this.lotteryId;
	}

	public void setLotteryId(Integer lotteryId) {
		this.lotteryId = lotteryId;
	}

	public String getBallOne() {
		return this.ballOne;
	}

	public void setBallOne(String ballOne) {
		this.ballOne = ballOne;
	}

	public String getBallTwo() {
		return this.ballTwo;
	}

	public void setBallTwo(String ballTwo) {
		this.ballTwo = ballTwo;
	}

	public String getBallThree() {
		return this.ballThree;
	}

	public void setBallThree(String ballThree) {
		this.ballThree = ballThree;
	}

	public String getBallFour() {
		return this.ballFour;
	}

	public void setBallFour(String ballFour) {
		this.ballFour = ballFour;
	}

	public String getBallFive() {
		return this.ballFive;
	}

	public void setBallFive(String ballFive) {
		this.ballFive = ballFive;
	}

	public String getBallSix() {
		return this.ballSix;
	}

	public void setBallSix(String ballSix) {
		this.ballSix = ballSix;
	}

	public String getBallSeven() {
		return this.ballSeven;
	}

	public void setBallSeven(String ballSeven) {
		this.ballSeven = ballSeven;
	}

	public String getLotteryNumber() {
		return this.lotteryNumber;
	}

	public void setLotteryNumber(String lotteryNumber) {
		this.lotteryNumber = lotteryNumber;
	}

	public Date getLotteryTime() {
		return this.lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public String getIssueNumber() {
		return this.issueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

}
