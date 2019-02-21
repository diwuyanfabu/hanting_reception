package com.accp.reception.pojo;
//Resouroe资源类别表(用于-发布服务-资源类别)
public class Resouroe {
		private Integer resouroeID;//主键，自增
		private String resouroeName;//类别名称
		public Integer getResouroeID() {
			return resouroeID;
		}
		public void setResouroeID(Integer resouroeID) {
			this.resouroeID = resouroeID;
		}
		public String getResouroeName() {
			return resouroeName;
		}
		public void setResouroeName(String resouroeName) {
			this.resouroeName = resouroeName;
		}
		public Resouroe(Integer resouroeID, String resouroeName) {
			super();
			this.resouroeID = resouroeID;
			this.resouroeName = resouroeName;
		}
		public Resouroe() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
