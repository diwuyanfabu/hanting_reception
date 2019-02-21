package com.accp.reception.pojo;
//BankType银行类别表
public class BankType {
		private Integer bankID;//主键，自增
		private String bankName;//银行名称
		private Boolean show;//	是否显示
		private Integer sort;//排序
		public Integer getBankID() {
			return bankID;
		}
		public void setBankID(Integer bankID) {
			this.bankID = bankID;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public Boolean getShow() {
			return show;
		}
		public void setShow(Boolean show) {
			this.show = show;
		}
		public Integer getSort() {
			return sort;
		}
		public void setSort(Integer sort) {
			this.sort = sort;
		}
		public BankType(Integer bankID, String bankName, Boolean show, Integer sort) {
			super();
			this.bankID = bankID;
			this.bankName = bankName;
			this.show = show;
			this.sort = sort;
		}
		public BankType() {
			super();
			// TODO Auto-generated constructor stub
		}
}
