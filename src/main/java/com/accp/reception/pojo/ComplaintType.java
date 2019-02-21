package com.accp.reception.pojo;
//ComplaintType投诉类型表
public class ComplaintType {
		private Integer ctID;//主键，自增
		private String ctName;//投诉类型名称
		public Integer getCtID() {
			return ctID;
		}
		public void setCtID(Integer ctID) {
			this.ctID = ctID;
		}
		public String getCtName() {
			return ctName;
		}
		public void setCtName(String ctName) {
			this.ctName = ctName;
		}
		public ComplaintType(Integer ctID, String ctName) {
			super();
			this.ctID = ctID;
			this.ctName = ctName;
		}
		public ComplaintType() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
