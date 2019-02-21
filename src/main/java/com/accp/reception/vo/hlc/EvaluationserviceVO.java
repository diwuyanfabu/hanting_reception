package com.accp.reception.vo.hlc;

import java.util.Date;

public class EvaluationserviceVO {
	private Integer serviceAppraiseID;	//评价编号
	private Integer userID;	//用户编号
	private String userImgPath;	//头像路径
	private String userName;	//昵称
	private Integer serviceAppraiseLevel;	//星级
	private String serviceAppraiseContent;	//内容
	private Date serviceAppraiseDate;	//时间
	private EvaluationserviceVO obj; //回复	
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserImgPath() {
		return userImgPath;
	}
	public void setUserImgPath(String userImgPath) {
		this.userImgPath = userImgPath;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getServiceAppraiseLevel() {
		return serviceAppraiseLevel;
	}
	public void setServiceAppraiseLevel(Integer serviceAppraiseLevel) {
		this.serviceAppraiseLevel = serviceAppraiseLevel;
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
	public EvaluationserviceVO getObj() {
		return obj;
	}
	public void setObj(EvaluationserviceVO obj) {
		this.obj = obj;
	}
	public Integer getServiceAppraiseID() {
		return serviceAppraiseID;
	}
	public void setServiceAppraiseID(Integer serviceAppraiseID) {
		this.serviceAppraiseID = serviceAppraiseID;
	}
	public EvaluationserviceVO(Integer serviceAppraiseID, Integer userID, String userImgPath, String userName,
			Integer serviceAppraiseLevel, String serviceAppraiseContent, Date serviceAppraiseDate,
			EvaluationserviceVO obj) {
		super();
		this.serviceAppraiseID = serviceAppraiseID;
		this.userID = userID;
		this.userImgPath = userImgPath;
		this.userName = userName;
		this.serviceAppraiseLevel = serviceAppraiseLevel;
		this.serviceAppraiseContent = serviceAppraiseContent;
		this.serviceAppraiseDate = serviceAppraiseDate;
		this.obj = obj;
	}
	public EvaluationserviceVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
