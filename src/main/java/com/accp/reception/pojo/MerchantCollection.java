package com.accp.reception.pojo;

import java.util.Date;

public class MerchantCollection {
	private Integer collectID;//收藏编号，主键，自增
	private Integer userID;//用户编号，外键，引用用户表
	private Integer merchantOrServiceByID;//商家编号
	private Integer collectType;//收藏类别
	private Date collectionTime;//收藏时间
	public Integer getCollectID() {
		return collectID;
	}
	public void setCollectID(Integer collectID) {
		this.collectID = collectID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getMerchantOrServiceByID() {
		return merchantOrServiceByID;
	}
	public void setMerchantOrServiceByID(Integer merchantOrServiceByID) {
		this.merchantOrServiceByID = merchantOrServiceByID;
	}
	public Integer getCollectType() {
		return collectType;
	}
	public void setCollectType(Integer collectType) {
		this.collectType = collectType;
	}
	public Date getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(Date collectionTime) {
		this.collectionTime = collectionTime;
	}
	public MerchantCollection(Integer collectID, Integer userID, Integer merchantOrServiceByID, Integer collectType,
			Date collectionTime) {
		super();
		this.collectID = collectID;
		this.userID = userID;
		this.merchantOrServiceByID = merchantOrServiceByID;
		this.collectType = collectType;
		this.collectionTime = collectionTime;
	}
	public MerchantCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
