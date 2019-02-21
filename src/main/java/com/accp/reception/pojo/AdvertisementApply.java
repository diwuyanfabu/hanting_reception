package com.accp.reception.pojo;

import java.util.Date;

public class AdvertisementApply {
	private Integer aaID;//主键，自增
	private Integer userID;//	外键，用户编号
	private Integer aid;//	外键，广告编号
	private String aimgPath;//	图片
	private String apcUrl;//	PC端链接路径
	private String aappUrl;//	手机端链接路径
	private Float price;//	付款金额
	private Integer rentAMonth;//租的月数
	private Date startTime;//开始时间
	private Date endTime;//	结束时间
	private Date applyTime;//	申请时间
	private Date auditTime;//	审核时间
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
	public Integer getAaID() {
		return aaID;
	}
	public void setAaID(Integer aaID) {
		this.aaID = aaID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAimgPath() {
		return aimgPath;
	}
	public void setAimgPath(String aimgPath) {
		this.aimgPath = aimgPath;
	}
	public String getApcUrl() {
		return apcUrl;
	}
	public void setApcUrl(String apcUrl) {
		this.apcUrl = apcUrl;
	}
	public String getAappUrl() {
		return aappUrl;
	}
	public void setAappUrl(String aappUrl) {
		this.aappUrl = aappUrl;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getRentAMonth() {
		return rentAMonth;
	}
	public void setRentAMonth(Integer rentAMonth) {
		this.rentAMonth = rentAMonth;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public AdvertisementApply(Integer aaID, Integer userID, Integer aid, String aimgPath, String apcUrl, String aappUrl,
			Float price, Integer rentAMonth, Date startTime, Date endTime, Date applyTime, Date auditTime,
			Integer auditStatus) {
		super();
		this.aaID = aaID;
		this.userID = userID;
		this.aid = aid;
		this.aimgPath = aimgPath;
		this.apcUrl = apcUrl;
		this.aappUrl = aappUrl;
		this.price = price;
		this.rentAMonth = rentAMonth;
		this.startTime = startTime;
		this.endTime = endTime;
		this.applyTime = applyTime;
		this.auditTime = auditTime;
		this.auditStatus = auditStatus;
	}
	public AdvertisementApply() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
