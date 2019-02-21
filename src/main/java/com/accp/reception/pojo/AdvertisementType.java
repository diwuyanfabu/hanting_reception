package com.accp.reception.pojo;
//AdvertisementType广告位模块表
public class AdvertisementType {
		private Integer atid;//主键，自增
		private String atname;//模块名称
		private String atpx;//图片要求尺寸
		public Integer getAtid() {
			return atid;
		}
		public void setAtid(Integer atid) {
			this.atid = atid;
		}
		public String getAtname() {
			return atname;
		}
		public void setAtname(String atname) {
			this.atname = atname;
		}
		public String getAtpx() {
			return atpx;
		}
		public void setAtpx(String atpx) {
			this.atpx = atpx;
		}
		public AdvertisementType(Integer atid, String atname, String atpx) {
			super();
			this.atid = atid;
			this.atname = atname;
			this.atpx = atpx;
		}
		public AdvertisementType() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
