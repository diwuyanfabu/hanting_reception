package com.accp.reception.pojo;

import java.util.Date;

public class EvaluationService {
	private Integer serviceAppraiseID;//服务评价编号，主键，自增
	private Integer serviceID;//服务编号，外键，引用服务表
	private Integer userID;//	用户编号，外键，引用用户表
	private String serviceAppraiseContent;//	内容
	private Date serviceAppraiseDate;//评价时间
	private Integer serviceAppraiseLevel;//星级
	private Integer serviceAppraisePID;//上级编号，0：表示评价，其他：回复评价
	public Integer getServiceAppraiseID() {
		return serviceAppraiseID;
	}
	public void setServiceAppraiseID(Integer serviceAppraiseID) {
		this.serviceAppraiseID = serviceAppraiseID;
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
	public String getServiceAppraiseContent() {
		return serviceAppraiseContent;
	}
	public void setServiceAppraiseContent(String serviceAppraiseContent) {
		this.serviceAppraiseContent = serviceAppraiseContent;
	}
	public Date getServiceAppraiseDate() {
		return serviceAppraiseDate;
	}
	public void setServiceAppraiseDate(Date serviceAppraiseDate) {
		this.serviceAppraiseDate = serviceAppraiseDate;
	}
	public Integer getServiceAppraiseLevel() {
		return serviceAppraiseLevel;
	}
	public void setServiceAppraiseLevel(Integer serviceAppraiseLevel) {
		this.serviceAppraiseLevel = serviceAppraiseLevel;
	}
	public Integer getServiceAppraisePID() {
		return serviceAppraisePID;
	}
	public void setServiceAppraisePID(Integer serviceAppraisePID) {
		this.serviceAppraisePID = serviceAppraisePID;
	}
	public EvaluationService(Integer serviceAppraiseID, Integer serviceID, Integer userID,
			String serviceAppraiseContent, Date serviceAppraiseDate, Integer serviceAppraiseLevel,
			Integer serviceAppraisePID) {
		super();
		this.serviceAppraiseID = serviceAppraiseID;
		this.serviceID = serviceID;
		this.userID = userID;
		this.serviceAppraiseContent = serviceAppraiseContent;
		this.serviceAppraiseDate = serviceAppraiseDate;
		this.serviceAppraiseLevel = serviceAppraiseLevel;
		this.serviceAppraisePID = serviceAppraisePID;
	}
	public EvaluationService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
