package com.accp.reception.pojo;
//system系统配置表
public class System {
		private Integer sysID;//主键，自增
		private Integer exchangeRate;//金币汇率
		private Integer charge;//	收费比例
		private Integer signIn;//签到获得积分
		private Integer postIntegral;//	发帖获得积分
		private Integer track;//跟帖获得积分
		private Integer releaseBeauty;//发布美妆获得积分
		private Integer logisticMin;//普通会员物流重量
		private Integer logisticMinSeller;//商家会员物流重量
		private Integer logisticWeight;//上门取货物流重量
		private Integer logisticPrice;//	单价/kg
		private Float bond;//保证金
		private Integer videoSize;//视频大小/MB
		private Integer closeorderdays;//订单下单未付款，n天后自动关闭，0为不自动关闭
		private Integer receivedays;//订单完成后，n天后自动确认服务，0为不自动确认服务
		private Integer refunddays;//	订单完成后，用户在n天内可以发起退款申请，设置0天不允许完成订单退款
		private Integer refundconfirmdays;//用户发起退款申请后，订单退款申请几天后自动确认
		private Boolean shopFreeStatus;//是否开启店铺免费体验模式
		private Integer freeTime;//	店铺免费体验月数
		public Integer getSysID() {
			return sysID;
		}
		public void setSysID(Integer sysID) {
			this.sysID = sysID;
		}
		public Integer getExchangeRate() {
			return exchangeRate;
		}
		public void setExchangeRate(Integer exchangeRate) {
			this.exchangeRate = exchangeRate;
		}
		public Integer getCharge() {
			return charge;
		}
		public void setCharge(Integer charge) {
			this.charge = charge;
		}
		public Integer getSignIn() {
			return signIn;
		}
		public void setSignIn(Integer signIn) {
			this.signIn = signIn;
		}
		public Integer getPostIntegral() {
			return postIntegral;
		}
		public void setPostIntegral(Integer postIntegral) {
			this.postIntegral = postIntegral;
		}
		public Integer getTrack() {
			return track;
		}
		public void setTrack(Integer track) {
			this.track = track;
		}
		public Integer getReleaseBeauty() {
			return releaseBeauty;
		}
		public void setReleaseBeauty(Integer releaseBeauty) {
			this.releaseBeauty = releaseBeauty;
		}
		public Integer getLogisticMin() {
			return logisticMin;
		}
		public void setLogisticMin(Integer logisticMin) {
			this.logisticMin = logisticMin;
		}
		public Integer getLogisticMinSeller() {
			return logisticMinSeller;
		}
		public void setLogisticMinSeller(Integer logisticMinSeller) {
			this.logisticMinSeller = logisticMinSeller;
		}
		public Integer getLogisticWeight() {
			return logisticWeight;
		}
		public void setLogisticWeight(Integer logisticWeight) {
			this.logisticWeight = logisticWeight;
		}
		public Integer getLogisticPrice() {
			return logisticPrice;
		}
		public void setLogisticPrice(Integer logisticPrice) {
			this.logisticPrice = logisticPrice;
		}
		public Float getBond() {
			return bond;
		}
		public void setBond(Float bond) {
			this.bond = bond;
		}
		public Integer getVideoSize() {
			return videoSize;
		}
		public void setVideoSize(Integer videoSize) {
			this.videoSize = videoSize;
		}
		public Integer getCloseorderdays() {
			return closeorderdays;
		}
		public void setCloseorderdays(Integer closeorderdays) {
			this.closeorderdays = closeorderdays;
		}
		public Integer getReceivedays() {
			return receivedays;
		}
		public void setReceivedays(Integer receivedays) {
			this.receivedays = receivedays;
		}
		public Integer getRefunddays() {
			return refunddays;
		}
		public void setRefunddays(Integer refunddays) {
			this.refunddays = refunddays;
		}
		public Integer getRefundconfirmdays() {
			return refundconfirmdays;
		}
		public void setRefundconfirmdays(Integer refundconfirmdays) {
			this.refundconfirmdays = refundconfirmdays;
		}
		public Boolean getShopFreeStatus() {
			return shopFreeStatus;
		}
		public void setShopFreeStatus(Boolean shopFreeStatus) {
			this.shopFreeStatus = shopFreeStatus;
		}
		public Integer getFreeTime() {
			return freeTime;
		}
		public void setFreeTime(Integer freeTime) {
			this.freeTime = freeTime;
		}
		public System(Integer sysID, Integer exchangeRate, Integer charge, Integer signIn, Integer postIntegral,
				Integer track, Integer releaseBeauty, Integer logisticMin, Integer logisticMinSeller,
				Integer logisticWeight, Integer logisticPrice, Float bond, Integer videoSize, Integer closeorderdays,
				Integer receivedays, Integer refunddays, Integer refundconfirmdays, Boolean shopFreeStatus,
				Integer freeTime) {
			super();
			this.sysID = sysID;
			this.exchangeRate = exchangeRate;
			this.charge = charge;
			this.signIn = signIn;
			this.postIntegral = postIntegral;
			this.track = track;
			this.releaseBeauty = releaseBeauty;
			this.logisticMin = logisticMin;
			this.logisticMinSeller = logisticMinSeller;
			this.logisticWeight = logisticWeight;
			this.logisticPrice = logisticPrice;
			this.bond = bond;
			this.videoSize = videoSize;
			this.closeorderdays = closeorderdays;
			this.receivedays = receivedays;
			this.refunddays = refunddays;
			this.refundconfirmdays = refundconfirmdays;
			this.shopFreeStatus = shopFreeStatus;
			this.freeTime = freeTime;
		}
		public System() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
