package com.accp.reception.pojo;

import java.util.Date;

//Advertisement广告位表
public class Advertisement {
		private Integer aid;//	主键，自增(前台模块放ID，匹配后台广告)
		private Integer atid;//	外键，广告位模块编号
		private String atitle;//标题
		private Integer aorder;//排序
		private String aimgPath;//图片路径
		private String apcUrl;//PC端链接路径
		private String aappUrl;//手机端链接路径
		private Boolean state;//广告位状态(已租/未租)
		private Date startTime;//	开始时间
		private Integer rentAMonth;//租的月数
		private Float price;//价格(单价/月)
		private String adescribe;//	描述
		public Integer getAid() {
			return aid;
		}
		public void setAid(Integer aid) {
			this.aid = aid;
		}
		public Integer getAtid() {
			return atid;
		}
		public void setAtid(Integer atid) {
			this.atid = atid;
		}
		public String getAtitle() {
			return atitle;
		}
		public void setAtitle(String atitle) {
			this.atitle = atitle;
		}
		public Integer getAorder() {
			return aorder;
		}
		public void setAorder(Integer aorder) {
			this.aorder = aorder;
		}
		public String getAimgPath() {
			return aimgPath;
		}
		public void setAimgPath(String aimgPath) {
			this.aimgPath = aimgPath;
		}
		public String getApcUrl() {
			return apcUrl;
		}
		public void setApcUrl(String apcUrl) {
			this.apcUrl = apcUrl;
		}
		public String getAappUrl() {
			return aappUrl;
		}
		public void setAappUrl(String aappUrl) {
			this.aappUrl = aappUrl;
		}
		public Boolean getState() {
			return state;
		}
		public void setState(Boolean state) {
			this.state = state;
		}
		public Date getStartTime() {
			return startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public Integer getRentAMonth() {
			return rentAMonth;
		}
		public void setRentAMonth(Integer rentAMonth) {
			this.rentAMonth = rentAMonth;
		}
		public Float getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
		}
		public String getAdescribe() {
			return adescribe;
		}
		public void setAdescribe(String adescribe) {
			this.adescribe = adescribe;
		}
		public Advertisement(Integer aid, Integer atid, String atitle, Integer aorder, String aimgPath, String apcUrl,
				String aappUrl, Boolean state, Date startTime, Integer rentAMonth, Float price, String adescribe) {
			super();
			this.aid = aid;
			this.atid = atid;
			this.atitle = atitle;
			this.aorder = aorder;
			this.aimgPath = aimgPath;
			this.apcUrl = apcUrl;
			this.aappUrl = aappUrl;
			this.state = state;
			this.startTime = startTime;
			this.rentAMonth = rentAMonth;
			this.price = price;
			this.adescribe = adescribe;
		}
		public Advertisement() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
