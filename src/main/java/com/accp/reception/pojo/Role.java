package com.accp.reception.pojo;
//role角色表
public class Role {
		private Integer roleID;	//主键，自增
		private Integer roleName;	//角色名称
		public Integer getRoleID() {
			return roleID;
		}
		public void setRoleID(Integer roleID) {
			this.roleID = roleID;
		}
		public Integer getRoleName() {
			return roleName;
		}
		public void setRoleName(Integer roleName) {
			this.roleName = roleName;
		}
		public Role(Integer roleID, Integer roleName) {
			super();
			this.roleID = roleID;
			this.roleName = roleName;
		}
		public Role() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
