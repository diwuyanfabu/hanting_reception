package com.accp.reception.pojo;

import java.util.Date;

public class PostCollection {
	private Integer CollectionID;//主键，自增
	private Integer pcID;//外键，帖子编号
	private Integer userID;//外键，用户编号
	private Date collectionTime;//	收藏时间
	public Integer getCollectionID() {
		return CollectionID;
	}
	public void setCollectionID(Integer collectionID) {
		CollectionID = collectionID;
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
	public Date getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(Date collectionTime) {
		this.collectionTime = collectionTime;
	}
	public PostCollection(Integer collectionID, Integer pcID, Integer userID, Date collectionTime) {
		super();
		CollectionID = collectionID;
		this.pcID = pcID;
		this.userID = userID;
		this.collectionTime = collectionTime;
	}
	public PostCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
