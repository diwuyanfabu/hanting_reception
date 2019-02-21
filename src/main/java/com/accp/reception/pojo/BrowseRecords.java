package com.accp.reception.pojo;

import java.util.Date;

public class BrowseRecords {
	private Integer brID;//	主键，自增
	private Integer brType;//浏览类别(1服务浏览2帖子浏览)
	private Integer userID;//	外键，用户编号
	private Integer postID;//	外键，帖子编号
	private Integer serviceID;//	外键，服务编号
	private Date browseTime;//	浏览时间
	public Integer getBrID() {
		return brID;
	}
	public void setBrID(Integer brID) {
		this.brID = brID;
	}
	public Integer getBrType() {
		return brType;
	}
	public void setBrType(Integer brType) {
		this.brType = brType;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getPostID() {
		return postID;
	}
	public void setPostID(Integer postID) {
		this.postID = postID;
	}
	public Integer getServiceID() {
		return serviceID;
	}
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}
	public Date getBrowseTime() {
		return browseTime;
	}
	public void setBrowseTime(Date browseTime) {
		this.browseTime = browseTime;
	}
	public BrowseRecords(Integer brID, Integer brType, Integer userID, Integer postID, Integer serviceID,
			Date browseTime) {
		super();
		this.brID = brID;
		this.brType = brType;
		this.userID = userID;
		this.postID = postID;
		this.serviceID = serviceID;
		this.browseTime = browseTime;
	}
	public BrowseRecords() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
