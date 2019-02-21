package com.accp.reception.pojo;

import java.util.Date;

//Administratorlog管理员日志表
public class Administratorlog {
		private Integer adminlogID;	//主键自增
		private Integer adminID;	//外键，管理员编号
		private String  remarks;	//备注(以“修改了会员，ID：113”的方式记录)
		private Date remarksTime;	//记录时间
		private String remarksIP;	//做出操作的IP地址
		public Integer getAdminlogID() {
			return adminlogID;
		}
		public void setAdminlogID(Integer adminlogID) {
			this.adminlogID = adminlogID;
		}
		public Integer getAdminID() {
			return adminID;
		}
		public void setAdminID(Integer adminID) {
			this.adminID = adminID;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public Date getRemarksTime() {
			return remarksTime;
		}
		public void setRemarksTime(Date remarksTime) {
			this.remarksTime = remarksTime;
		}
		public String getRemarksIP() {
			return remarksIP;
		}
		public void setRemarksIP(String remarksIP) {
			this.remarksIP = remarksIP;
		}
		public Administratorlog(Integer adminlogID, Integer adminID, String remarks, Date remarksTime,
				String remarksIP) {
			super();
			this.adminlogID = adminlogID;
			this.adminID = adminID;
			this.remarks = remarks;
			this.remarksTime = remarksTime;
			this.remarksIP = remarksIP;
		}
		public Administratorlog() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
