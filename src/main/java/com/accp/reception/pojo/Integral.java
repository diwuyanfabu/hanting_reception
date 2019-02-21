package com.accp.reception.pojo;
//integral积分规格表(干什么事，加多少积分)
public class Integral {
		private Integer integralID;//	主键，自增
		private Integer viceID;//	递归，父编号
		private String integralName;//		规格名称
		private Integer require;//	要求达到此次数,才可以加积分
		private Integer integral;//		积分
		public Integer getIntegralID() {
			return integralID;
		}
		public void setIntegralID(Integer integralID) {
			this.integralID = integralID;
		}
		public Integer getViceID() {
			return viceID;
		}
		public void setViceID(Integer viceID) {
			this.viceID = viceID;
		}
		public String getIntegralName() {
			return integralName;
		}
		public void setIntegralName(String integralName) {
			this.integralName = integralName;
		}
		public Integer getRequire() {
			return require;
		}
		public void setRequire(Integer require) {
			this.require = require;
		}
		public Integer getIntegral() {
			return integral;
		}
		public void setIntegral(Integer integral) {
			this.integral = integral;
		}
		public Integral(Integer integralID, Integer viceID, String integralName, Integer require, Integer integral) {
			super();
			this.integralID = integralID;
			this.viceID = viceID;
			this.integralName = integralName;
			this.require = require;
			this.integral = integral;
		}
		public Integral() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
