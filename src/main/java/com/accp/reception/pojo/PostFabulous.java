package com.accp.reception.pojo;

import java.util.Date;

public class PostFabulous {
	private Integer postFab;//	主键，自增
	private Integer userID;//	外键，用户编号
	private Integer postID;//	外键，帖子编号
	private Date fabulousTime;//点赞时间
	public Integer getPostFab() {
		return postFab;
	}
	public void setPostFab(Integer postFab) {
		this.postFab = postFab;
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
	public Date getFabulousTime() {
		return fabulousTime;
	}
	public void setFabulousTime(Date fabulousTime) {
		this.fabulousTime = fabulousTime;
	}
	public PostFabulous(Integer postFab, Integer userID, Integer postID, Date fabulousTime) {
		super();
		this.postFab = postFab;
		this.userID = userID;
		this.postID = postID;
		this.fabulousTime = fabulousTime;
	}
	public PostFabulous() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
