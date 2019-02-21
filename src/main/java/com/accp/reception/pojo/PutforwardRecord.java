package com.accp.reception.pojo;

import java.util.Date;

//PutforwardRecord提现记录表
public class PutforwardRecord {
		private Integer pfrID;//主键，自增
		private Integer userID;//	外键，用户ID
		private String bankAccount;//	银行账号
		private Integer bankID;//	外键，银行类别
		private Date submitTime;//	提交申请时间
		private Date completeTime;//完成审核时间
		private Float money;//提现金额
		private String adminOpinion;//审批备注
		public Integer getPfrID() {
			return pfrID;
		}
		public void setPfrID(Integer pfrID) {
			this.pfrID = pfrID;
		}
		public Integer getUserID() {
			return userID;
		}
		public void setUserID(Integer userID) {
			this.userID = userID;
		}
		public String getBankAccount() {
			return bankAccount;
		}
		public void setBankAccount(String bankAccount) {
			this.bankAccount = bankAccount;
		}
		public Integer getBankID() {
			return bankID;
		}
		public void setBankID(Integer bankID) {
			this.bankID = bankID;
		}
		public Date getSubmitTime() {
			return submitTime;
		}
		public void setSubmitTime(Date submitTime) {
			this.submitTime = submitTime;
		}
		public Date getCompleteTime() {
			return completeTime;
		}
		public void setCompleteTime(Date completeTime) {
			this.completeTime = completeTime;
		}
		public Float getMoney() {
			return money;
		}
		public void setMoney(Float money) {
			this.money = money;
		}
		public String getAdminOpinion() {
			return adminOpinion;
		}
		public void setAdminOpinion(String adminOpinion) {
			this.adminOpinion = adminOpinion;
		}
		public PutforwardRecord(Integer pfrID, Integer userID, String bankAccount, Integer bankID, Date submitTime,
				Date completeTime, Float money, String adminOpinion) {
			super();
			this.pfrID = pfrID;
			this.userID = userID;
			this.bankAccount = bankAccount;
			this.bankID = bankID;
			this.submitTime = submitTime;
			this.completeTime = completeTime;
			this.money = money;
			this.adminOpinion = adminOpinion;
		}
		public PutforwardRecord() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
