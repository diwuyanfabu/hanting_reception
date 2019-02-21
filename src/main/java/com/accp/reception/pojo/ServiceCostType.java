package com.accp.reception.pojo;
//serviceCostType服务费用类型表
public class ServiceCostType {
		private Integer serviceCostTypeID;//服务费用类型编号，主键，自增
		private String serviceCostTypeName;//	服务费用类型名称
		private Integer stid;//	服务类别编号，外键
		public Integer getServiceCostTypeID() {
			return serviceCostTypeID;
		}
		public void setServiceCostTypeID(Integer serviceCostTypeID) {
			this.serviceCostTypeID = serviceCostTypeID;
		}
		public String getServiceCostTypeName() {
			return serviceCostTypeName;
		}
		public void setServiceCostTypeName(String serviceCostTypeName) {
			this.serviceCostTypeName = serviceCostTypeName;
		}
		public Integer getStid() {
			return stid;
		}
		public void setStid(Integer stid) {
			this.stid = stid;
		}
		public ServiceCostType(Integer serviceCostTypeID, String serviceCostTypeName, Integer stid) {
			super();
			this.serviceCostTypeID = serviceCostTypeID;
			this.serviceCostTypeName = serviceCostTypeName;
			this.stid = stid;
		}
		public ServiceCostType() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
