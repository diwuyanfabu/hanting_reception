package com.accp.reception.pojo;

import java.util.Date;

//DownloadRecord下载记录表(用于-论坛资源下载记录)
public class DownloadRecord {
		private Integer drID;//	主键，自增
		private Integer userID;//外键，用户编号
		private Integer postID;//	外键，帖子编号
		private Date downloadTime;//	下载时间
		public Integer getDrID() {
			return drID;
		}
		public void setDrID(Integer drID) {
			this.drID = drID;
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
		public Date getDownloadTime() {
			return downloadTime;
		}
		public void setDownloadTime(Date downloadTime) {
			this.downloadTime = downloadTime;
		}
		public DownloadRecord(Integer drID, Integer userID, Integer postID, Date downloadTime) {
			super();
			this.drID = drID;
			this.userID = userID;
			this.postID = postID;
			this.downloadTime = downloadTime;
		}
		public DownloadRecord() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
