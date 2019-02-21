package com.accp.reception.pojo;
//rolefunction角色权限绑定表
public class Rolefunction {
		private Integer rfID;//	主键，自增
		private Integer roleID;//外键，角色编号
		private Integer fID;	//外键，权限表
		public Integer getRfID() {
			return rfID;
		}
		public void setRfID(Integer rfID) {
			this.rfID = rfID;
		}
		public Integer getRoleID() {
			return roleID;
		}
		public void setRoleID(Integer roleID) {
			this.roleID = roleID;
		}
		public Integer getfID() {
			return fID;
		}
		public void setfID(Integer fID) {
			this.fID = fID;
		}
		public Rolefunction(Integer rfID, Integer roleID, Integer fID) {
			super();
			this.rfID = rfID;
			this.roleID = roleID;
			this.fID = fID;
		}
		public Rolefunction() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
