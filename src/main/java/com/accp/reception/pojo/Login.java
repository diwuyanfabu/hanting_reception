package com.accp.reception.pojo;
//login登入方式
public class Login {
		private Integer loginID;//主键，自增
		private Integer userID;//外键，用户编号
		private String opentId;//第三方登入成功后返回的一个ID
		private Integer loginType;//登入方式，第三方登入类别(1.邮箱/2.QQ/3.VX/4.微博/5.F啥的)
		private String userEmail;//用户邮箱账号(邮箱登入时用到，默认null)
		private String userPwd;//用户密码(邮箱登入时用到，默认null)
		public Integer getLoginID() {
			return loginID;
		}
		public void setLoginID(Integer loginID) {
			this.loginID = loginID;
		}
		public Integer getUserID() {
			return userID;
		}
		public void setUserID(Integer userID) {
			this.userID = userID;
		}
		public String getOpentId() {
			return opentId;
		}
		public void setOpentId(String opentId) {
			this.opentId = opentId;
		}
		public Integer getLoginType() {
			return loginType;
		}
		public void setLoginType(Integer loginType) {
			this.loginType = loginType;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public String getUserPwd() {
			return userPwd;
		}
		public void setUserPwd(String userPwd) {
			this.userPwd = userPwd;
		}
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Login(Integer loginID, Integer userID, String opentId, Integer loginType, String userEmail,
				String userPwd) {
			super();
			this.loginID = loginID;
			this.userID = userID;
			this.opentId = opentId;
			this.loginType = loginType;
			this.userEmail = userEmail;
			this.userPwd = userPwd;
		}
		
		
		
		
}
