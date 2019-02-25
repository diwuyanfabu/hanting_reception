package com.accp.reception.pojo;
//Servicelevel(服务级别表)
public class Servicelevel {
		private Integer serlevelID;//主键，自增
		private String serlevelName;//级别名称(交易额度达到了要求可以更换称号)
		private Integer stid;//	外键，服务类别(一级服务)
		private Integer serviceIntegralMin;//	最低积分
		private Integer serviceIntegralMax;//	最大积分
		public Integer getSerlevelID() {
			return serlevelID;
		}
		public void setSerlevelID(Integer serlevelID) {
			this.serlevelID = serlevelID;
		}
		public String getSerlevelName() {
			return serlevelName;
		}
		public void setSerlevelName(String serlevelName) {
			this.serlevelName = serlevelName;
		}
		public Integer getStid() {
			return stid;
		}
		public void setStid(Integer stid) {
			this.stid = stid;
		}
		public Integer getServiceIntegralMin() {
			return serviceIntegralMin;
		}
		public void setServiceIntegralMin(Integer serviceIntegralMin) {
			this.serviceIntegralMin = serviceIntegralMin;
		}
		public Integer getServiceIntegralMax() {
			return serviceIntegralMax;
		}
		public void setServiceIntegralMax(Integer serviceIntegralMax) {
			this.serviceIntegralMax = serviceIntegralMax;
		}
		public Servicelevel(Integer serlevelID, String serlevelName, Integer stid, Integer serviceIntegralMin,
				Integer serviceIntegralMax) {
			super();
			this.serlevelID = serlevelID;
			this.serlevelName = serlevelName;
			this.stid = stid;
			this.serviceIntegralMin = serviceIntegralMin;
			this.serviceIntegralMax = serviceIntegralMax;
		}
		public Servicelevel() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Servicelevel [serlevelID=" + serlevelID + ", serlevelName=" + serlevelName + ", stid=" + stid
					+ ", serviceIntegralMin=" + serviceIntegralMin + ", serviceIntegralMax=" + serviceIntegralMax + "]";
		}
		
		
}
