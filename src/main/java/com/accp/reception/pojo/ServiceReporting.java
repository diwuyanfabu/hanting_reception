package com.accp.reception.pojo;

import java.util.Date;

//ServiceReporting商家举报表
public class ServiceReporting {
	private Integer srID;//主键，自增
	private Integer businessID;//外键，商家编号
	private Integer serviceID;//外键，商家发布服务编号
	private Integer userID;//外键，举报人编号
	private Integer ctID;//外键，举报类别编号
	private Date TimeOfComplaint;//举报时间
	private Date auditTime;//	审核时间
	private Date auditStatus;//	审核状态(1待审核2审批通过3审批未通过)
	public Integer getSrID() {
		return srID;
	}
	public void setSrID(Integer srID) {
		this.srID = srID;
	}
	public Integer getBusinessID() {
		return businessID;
	}
	public void setBusinessID(Integer businessID) {
		this.businessID = businessID;
	}
	public Integer getServiceID() {
		return serviceID;
	}
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getCtID() {
		return ctID;
	}
	public void setCtID(Integer ctID) {
		this.ctID = ctID;
	}
	public Date getTimeOfComplaint() {
		return TimeOfComplaint;
	}
	public void setTimeOfComplaint(Date timeOfComplaint) {
		TimeOfComplaint = timeOfComplaint;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public Date getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Date auditStatus) {
		this.auditStatus = auditStatus;
	}
	public ServiceReporting(Integer srID, Integer businessID, Integer serviceID, Integer userID, Integer ctID,
			Date timeOfComplaint, Date auditTime, Date auditStatus) {
		super();
		this.srID = srID;
		this.businessID = businessID;
		this.serviceID = serviceID;
		this.userID = userID;
		this.ctID = ctID;
		TimeOfComplaint = timeOfComplaint;
		this.auditTime = auditTime;
		this.auditStatus = auditStatus;
	}
	public ServiceReporting() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
