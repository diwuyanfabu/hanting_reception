package com.accp.reception.pojo;

import java.util.Date;

//MessageFeedback留言反馈表
public class MessageFeedback {
		private Integer mfID;//	主键，序号，自增列
		private String mfName;//姓名
		private String mfPhone;//电话
		private String mfEmail;//邮箱	
		private String mfContent;//	内容，具体需求
		private String mfJoinTheWay;//加盟方式
		private Date mfIDmfDate;//留言时间
		public Integer getMfID() {
			return mfID;
		}
		public void setMfID(Integer mfID) {
			this.mfID = mfID;
		}
		public String getMfName() {
			return mfName;
		}
		public void setMfName(String mfName) {
			this.mfName = mfName;
		}
		public String getMfPhone() {
			return mfPhone;
		}
		public void setMfPhone(String mfPhone) {
			this.mfPhone = mfPhone;
		}
		public String getMfEmail() {
			return mfEmail;
		}
		public void setMfEmail(String mfEmail) {
			this.mfEmail = mfEmail;
		}
		public String getMfContent() {
			return mfContent;
		}
		public void setMfContent(String mfContent) {
			this.mfContent = mfContent;
		}
		public String getMfJoinTheWay() {
			return mfJoinTheWay;
		}
		public void setMfJoinTheWay(String mfJoinTheWay) {
			this.mfJoinTheWay = mfJoinTheWay;
		}
		public Date getMfIDmfDate() {
			return mfIDmfDate;
		}
		public void setMfIDmfDate(Date mfIDmfDate) {
			this.mfIDmfDate = mfIDmfDate;
		}
		public MessageFeedback(Integer mfID, String mfName, String mfPhone, String mfEmail, String mfContent,
				String mfJoinTheWay, Date mfIDmfDate) {
			super();
			this.mfID = mfID;
			this.mfName = mfName;
			this.mfPhone = mfPhone;
			this.mfEmail = mfEmail;
			this.mfContent = mfContent;
			this.mfJoinTheWay = mfJoinTheWay;
			this.mfIDmfDate = mfIDmfDate;
		}
		public MessageFeedback() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
