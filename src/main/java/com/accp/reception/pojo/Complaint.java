package com.accp.reception.pojo;

import java.util.Date;

public class Complaint {
	private Integer cid;//主键，自增
	private Integer posting;//外键，发帖人编号
	private Integer pcID;//	外键，外键，帖子编号
	private Integer userID;//	外键，投诉人编号
	private Integer ctID;//	外键，投诉类型编号
	private Date TimeOfComplaint;//	举报时间
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getPosting() {
		return posting;
	}
	public void setPosting(Integer posting) {
		this.posting = posting;
	}
	public Integer getPcID() {
		return pcID;
	}
	public void setPcID(Integer pcID) {
		this.pcID = pcID;
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
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public Complaint(Integer cid, Integer posting, Integer pcID, Integer userID, Integer ctID, Date timeOfComplaint,
			Integer auditStatus) {
		super();
		this.cid = cid;
		this.posting = posting;
		this.pcID = pcID;
		this.userID = userID;
		this.ctID = ctID;
		TimeOfComplaint = timeOfComplaint;
		this.auditStatus = auditStatus;
	}
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
