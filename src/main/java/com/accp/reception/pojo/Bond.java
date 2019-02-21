package com.accp.reception.pojo;

import java.util.Date;

public class Bond {
	private Integer bID;//主键，自增
	private Integer userID;//用户ID
	private Integer bondType;//获取方式(1充值2线下充值)
	private Float goldCoin;//操作(-100|+100)
	private String reviewNotes;//审核备注
	private Date submitTime;//提交申请时间
	private Date completeTime;//完成审核时间
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
	public Integer getbID() {
		return bID;
	}
	public void setbID(Integer bID) {
		this.bID = bID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getBondType() {
		return bondType;
	}
	public void setBondType(Integer bondType) {
		this.bondType = bondType;
	}
	public Float getGoldCoin() {
		return goldCoin;
	}
	public void setGoldCoin(Float goldCoin) {
		this.goldCoin = goldCoin;
	}
	public String getReviewNotes() {
		return reviewNotes;
	}
	public void setReviewNotes(String reviewNotes) {
		this.reviewNotes = reviewNotes;
	}
	public Date getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
	public Date getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public Bond(Integer bID, Integer userID, Integer bondType, Float goldCoin, String reviewNotes, Date submitTime,
			Date completeTime, Integer auditStatus) {
		super();
		this.bID = bID;
		this.userID = userID;
		this.bondType = bondType;
		this.goldCoin = goldCoin;
		this.reviewNotes = reviewNotes;
		this.submitTime = submitTime;
		this.completeTime = completeTime;
		this.auditStatus = auditStatus;
	}
	public Bond() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
