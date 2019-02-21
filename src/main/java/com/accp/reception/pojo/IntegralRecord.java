package com.accp.reception.pojo;

import java.util.Date;

//integralRecord积分流向操作记录表
public class IntegralRecord {
	private Integer IRID;//记录编号，主键，自增
	private Integer userID;//外键，用户编号
	private Date IRDate;//记录日期
	private String IRDescribe;//记录描述
	private Integer recordInAndOut;//记录积分(-|+)
	private Integer integralID;//外键，积分规格表
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
	public Integer getIRID() {
		return IRID;
	}
	public void setIRID(Integer iRID) {
		IRID = iRID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Date getIRDate() {
		return IRDate;
	}
	public void setIRDate(Date iRDate) {
		IRDate = iRDate;
	}
	public String getIRDescribe() {
		return IRDescribe;
	}
	public void setIRDescribe(String iRDescribe) {
		IRDescribe = iRDescribe;
	}
	public Integer getRecordInAndOut() {
		return recordInAndOut;
	}
	public void setRecordInAndOut(Integer recordInAndOut) {
		this.recordInAndOut = recordInAndOut;
	}
	public Integer getIntegralID() {
		return integralID;
	}
	public void setIntegralID(Integer integralID) {
		this.integralID = integralID;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public IntegralRecord(Integer iRID, Integer userID, Date iRDate, String iRDescribe, Integer recordInAndOut,
			Integer integralID, Integer auditStatus) {
		super();
		IRID = iRID;
		this.userID = userID;
		IRDate = iRDate;
		IRDescribe = iRDescribe;
		this.recordInAndOut = recordInAndOut;
		this.integralID = integralID;
		this.auditStatus = auditStatus;
	}
	public IntegralRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
