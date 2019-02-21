package com.accp.reception.pojo;
//ServiceIntegral服务积分表
public class ServiceIntegral {
		private Integer serIntID;//	主键，自增
		private Integer userID;//	外键，用户编号
		private Integer stid;//	外键，服务类别
		private Integer Integral;//	积分
		public Integer getSerIntID() {
			return serIntID;
		}
		public void setSerIntID(Integer serIntID) {
			this.serIntID = serIntID;
		}
		public Integer getUserID() {
			return userID;
		}
		public void setUserID(Integer userID) {
			this.userID = userID;
		}
		public Integer getStid() {
			return stid;
		}
		public void setStid(Integer stid) {
			this.stid = stid;
		}
		public Integer getIntegral() {
			return Integral;
		}
		public void setIntegral(Integer integral) {
			Integral = integral;
		}
		public ServiceIntegral(Integer serIntID, Integer userID, Integer stid, Integer integral) {
			super();
			this.serIntID = serIntID;
			this.userID = userID;
			this.stid = stid;
			Integral = integral;
		}
		public ServiceIntegral() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
