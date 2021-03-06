package com.accp.reception.pojo;
//ForumManagement论坛板块管理(帖子类别)
public class ForumManagement {
		private Integer fmID;//	主键，自增
		private Integer pid;//	pid递归编号
		private Integer sort;//	排序
		private Integer fmName;//栏目名称
		private Boolean auditStatus;//	审核(true需要审核false不需要审核)
		private Boolean giftIntegral;//	赠送积分(true赠送false不赠送)
		private Integer adminID;//版主
		private Integer serviceCopies;//	服务份数，用作韩语翻译
		//自驾游：服务价格*天数*人数，微整形：服务价格*人数，留学中介：服务价格*人数，韩语翻译：份数*服务价格，学习资源：服务价格
		public Integer getFmID() {
			return fmID;
		}
		public void setFmID(Integer fmID) {
			this.fmID = fmID;
		}
		public Integer getPid() {
			return pid;
		}
		public void setPid(Integer pid) {
			this.pid = pid;
		}
		public Integer getSort() {
			return sort;
		}
		public void setSort(Integer sort) {
			this.sort = sort;
		}
		public Integer getFmName() {
			return fmName;
		}
		public void setFmName(Integer fmName) {
			this.fmName = fmName;
		}
		public Boolean getAuditStatus() {
			return auditStatus;
		}
		public void setAuditStatus(Boolean auditStatus) {
			this.auditStatus = auditStatus;
		}
		public Boolean getGiftIntegral() {
			return giftIntegral;
		}
		public void setGiftIntegral(Boolean giftIntegral) {
			this.giftIntegral = giftIntegral;
		}
		public Integer getAdminID() {
			return adminID;
		}
		public void setAdminID(Integer adminID) {
			this.adminID = adminID;
		}
		public Integer getServiceCopies() {
			return serviceCopies;
		}
		public void setServiceCopies(Integer serviceCopies) {
			this.serviceCopies = serviceCopies;
		}
		public ForumManagement(Integer fmID, Integer pid, Integer sort, Integer fmName, Boolean auditStatus,
				Boolean giftIntegral, Integer adminID, Integer serviceCopies) {
			super();
			this.fmID = fmID;
			this.pid = pid;
			this.sort = sort;
			this.fmName = fmName;
			this.auditStatus = auditStatus;
			this.giftIntegral = giftIntegral;
			this.adminID = adminID;
			this.serviceCopies = serviceCopies;
		}
		public ForumManagement() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
