package com.accp.reception.pojo;

import java.util.Date;

//ServiceCollection服务收藏(商品收藏)
public class ServiceCollection {
		private Integer serColleID;//	主键，自增
		private Integer serviceID;//外键，服务编号(商品表)
		private Integer userID;//	外键，用户编号
		private Date collectionTime;//收藏时间
		public Integer getSerColleID() {
			return serColleID;
		}
		public void setSerColleID(Integer serColleID) {
			this.serColleID = serColleID;
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
		public Date getCollectionTime() {
			return collectionTime;
		}
		public void setCollectionTime(Date collectionTime) {
			this.collectionTime = collectionTime;
		}
		public ServiceCollection(Integer serColleID, Integer serviceID, Integer userID, Date collectionTime) {
			super();
			this.serColleID = serColleID;
			this.serviceID = serviceID;
			this.userID = userID;
			this.collectionTime = collectionTime;
		}
		public ServiceCollection() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
