package com.accp.reception.pojo;
//BreachOfContract(违约规格)
public class BreachOfContract {
		private Integer bcID;//	主键，自增
		private Integer stid;//外键，服务类别(一级服务)
		private Integer operationTime;//未确认时间(单位/天)
		private Integer confirmationTime;//	自动确认时间(单位/小时)
		private Integer BreachOfContractTime;//违约时间(单位/天)
		private Integer confirmationMoney;//	违约金(百分比)
		public Integer getBcID() {
			return bcID;
		}
		public void setBcID(Integer bcID) {
			this.bcID = bcID;
		}
		public Integer getStid() {
			return stid;
		}
		public void setStid(Integer stid) {
			this.stid = stid;
		}
		public Integer getOperationTime() {
			return operationTime;
		}
		public void setOperationTime(Integer operationTime) {
			this.operationTime = operationTime;
		}
		public Integer getConfirmationTime() {
			return confirmationTime;
		}
		public void setConfirmationTime(Integer confirmationTime) {
			this.confirmationTime = confirmationTime;
		}
		public Integer getBreachOfContractTime() {
			return BreachOfContractTime;
		}
		public void setBreachOfContractTime(Integer breachOfContractTime) {
			BreachOfContractTime = breachOfContractTime;
		}
		public Integer getConfirmationMoney() {
			return confirmationMoney;
		}
		public void setConfirmationMoney(Integer confirmationMoney) {
			this.confirmationMoney = confirmationMoney;
		}
		public BreachOfContract(Integer bcID, Integer stid, Integer operationTime, Integer confirmationTime,
				Integer breachOfContractTime, Integer confirmationMoney) {
			super();
			this.bcID = bcID;
			this.stid = stid;
			this.operationTime = operationTime;
			this.confirmationTime = confirmationTime;
			BreachOfContractTime = breachOfContractTime;
			this.confirmationMoney = confirmationMoney;
		}
		public BreachOfContract() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
