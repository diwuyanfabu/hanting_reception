package com.accp.reception.pojo;

import java.util.Date;

//Trusteeship托管申请表
public class Trusteeship {
		private Integer truID;//主键，自增
		private Integer userID;//外键，用户编号
		private Date applicationTime;//申请时间
		private Integer trusteeshipMonth;//	托管月数
		private Integer auditTime;//审核时间
		private Integer auditStatus;//审核状态(1待审核2审核通过3拒绝)
		public Integer getTruID() {
			return truID;
		}
		public void setTruID(Integer truID) {
			this.truID = truID;
		}
		public Integer getUserID() {
			return userID;
		}
		public void setUserID(Integer userID) {
			this.userID = userID;
		}
		public Date getApplicationTime() {
			return applicationTime;
		}
		public void setApplicationTime(Date applicationTime) {
			this.applicationTime = applicationTime;
		}
		public Integer getTrusteeshipMonth() {
			return trusteeshipMonth;
		}
		public void setTrusteeshipMonth(Integer trusteeshipMonth) {
			this.trusteeshipMonth = trusteeshipMonth;
		}
		public Integer getAuditTime() {
			return auditTime;
		}
		public void setAuditTime(Integer auditTime) {
			this.auditTime = auditTime;
		}
		public Integer getAuditStatus() {
			return auditStatus;
		}
		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}
		public Trusteeship(Integer truID, Integer userID, Date applicationTime, Integer trusteeshipMonth,
				Integer auditTime, Integer auditStatus) {
			super();
			this.truID = truID;
			this.userID = userID;
			this.applicationTime = applicationTime;
			this.trusteeshipMonth = trusteeshipMonth;
			this.auditTime = auditTime;
			this.auditStatus = auditStatus;
		}
		public Trusteeship() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
