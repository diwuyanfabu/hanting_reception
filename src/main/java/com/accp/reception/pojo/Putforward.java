package com.accp.reception.pojo;

import java.util.Date;

//Putforward提现表
public class Putforward {
		private Integer pfID;//主键，自增
		private Integer userID;//外键，用户IDc
		private String putName;//	提现人姓名
		private Integer bankID;//银行类别
		private String bankAccount;//银行账号
		private String openBankName;//	开户行
		private Date submitTime;//提交申请时间
		private Date auditTime;//主键，自增
		private Float money;//提现金额
		private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
		public Integer getPfID() {
			return pfID;
		}
		public void setPfID(Integer pfID) {
			this.pfID = pfID;
		}
		public Integer getUserID() {
			return userID;
		}
		public void setUserID(Integer userID) {
			this.userID = userID;
		}
		public String getPutName() {
			return putName;
		}
		public void setPutName(String putName) {
			this.putName = putName;
		}
		public Integer getBankID() {
			return bankID;
		}
		public void setBankID(Integer bankID) {
			this.bankID = bankID;
		}
		public String getBankAccount() {
			return bankAccount;
		}
		public void setBankAccount(String bankAccount) {
			this.bankAccount = bankAccount;
		}
		public String getOpenBankName() {
			return openBankName;
		}
		public void setOpenBankName(String openBankName) {
			this.openBankName = openBankName;
		}
		public Date getSubmitTime() {
			return submitTime;
		}
		public void setSubmitTime(Date submitTime) {
			this.submitTime = submitTime;
		}
		public Date getAuditTime() {
			return auditTime;
		}
		public void setAuditTime(Date auditTime) {
			this.auditTime = auditTime;
		}
		public Float getMoney() {
			return money;
		}
		public void setMoney(Float money) {
			this.money = money;
		}
		public Integer getAuditStatus() {
			return auditStatus;
		}
		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}
		public Putforward(Integer pfID, Integer userID, String putName, Integer bankID, String bankAccount,
				String openBankName, Date submitTime, Date auditTime, Float money, Integer auditStatus) {
			super();
			this.pfID = pfID;
			this.userID = userID;
			this.putName = putName;
			this.bankID = bankID;
			this.bankAccount = bankAccount;
			this.openBankName = openBankName;
			this.submitTime = submitTime;
			this.auditTime = auditTime;
			this.money = money;
			this.auditStatus = auditStatus;
		}
		public Putforward() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
