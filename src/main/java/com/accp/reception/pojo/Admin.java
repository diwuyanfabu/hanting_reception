package com.accp.reception.pojo;

import java.util.Date;
//admin管理员表
public class Admin {
		private Integer adminID;	//自增，主键
		private Integer adminType;	//管理员类别(1超级管理员2普通管理员)
		private String  name;		//管理员账号
		private String password;	//管理员密码
		private Date creationTime;	//创建时间
		private Integer roleID;		//外键，角色编号
		private String creationIP;	//创建IP
		private Integer founder;	//创建人编号
		private Date recentEntry;	//用户最后登入时间
		private String IP;//最后登入IP地址
		public Integer getAdminID() {
			return adminID;
		}
		public void setAdminID(Integer adminID) {
			this.adminID = adminID;
		}
		public Integer getAdminType() {
			return adminType;
		}
		public void setAdminType(Integer adminType) {
			this.adminType = adminType;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Date getCreationTime() {
			return creationTime;
		}
		public void setCreationTime(Date creationTime) {
			this.creationTime = creationTime;
		}
		public Integer getRoleID() {
			return roleID;
		}
		public void setRoleID(Integer roleID) {
			this.roleID = roleID;
		}
		public String getCreationIP() {
			return creationIP;
		}
		public void setCreationIP(String creationIP) {
			this.creationIP = creationIP;
		}
		public Integer getFounder() {
			return founder;
		}
		public void setFounder(Integer founder) {
			this.founder = founder;
		}
		public Date getRecentEntry() {
			return recentEntry;
		}
		public void setRecentEntry(Date recentEntry) {
			this.recentEntry = recentEntry;
		}
		public String getIP() {
			return IP;
		}
		public void setIP(String iP) {
			IP = iP;
		}
		public Admin(Integer adminID, Integer adminType, String name, String password, Date creationTime,
				Integer roleID, String creationIP, Integer founder, Date recentEntry, String iP) {
			super();
			this.adminID = adminID;
			this.adminType = adminType;
			this.name = name;
			this.password = password;
			this.creationTime = creationTime;
			this.roleID = roleID;
			this.creationIP = creationIP;
			this.founder = founder;
			this.recentEntry = recentEntry;
			IP = iP;
		}
		public Admin() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
