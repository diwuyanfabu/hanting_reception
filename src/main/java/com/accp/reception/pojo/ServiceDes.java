package com.accp.reception.pojo;
//serviceDes服务描述表
public class ServiceDes {
		private Integer serviceDesID;//	服务描述编号，主键，自增
		private String serviceDesTitle;//	服务描述标题
		private String serviceDesContentIOUrl;//服务描述内容文件路径
		private Integer serviceID;//服务编号，外键，引用服务表
		public Integer getServiceDesID() {
			return serviceDesID;
		}
		public void setServiceDesID(Integer serviceDesID) {
			this.serviceDesID = serviceDesID;
		}
		public String getServiceDesTitle() {
			return serviceDesTitle;
		}
		public void setServiceDesTitle(String serviceDesTitle) {
			this.serviceDesTitle = serviceDesTitle;
		}
		public String getServiceDesContentIOUrl() {
			return serviceDesContentIOUrl;
		}
		public void setServiceDesContentIOUrl(String serviceDesContentIOUrl) {
			this.serviceDesContentIOUrl = serviceDesContentIOUrl;
		}
		public Integer getServiceID() {
			return serviceID;
		}
		public void setServiceID(Integer serviceID) {
			this.serviceID = serviceID;
		}
		public ServiceDes(Integer serviceDesID, String serviceDesTitle, String serviceDesContentIOUrl,
				Integer serviceID) {
			super();
			this.serviceDesID = serviceDesID;
			this.serviceDesTitle = serviceDesTitle;
			this.serviceDesContentIOUrl = serviceDesContentIOUrl;
			this.serviceID = serviceID;
		}
		public ServiceDes() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
