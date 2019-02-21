package com.accp.reception.pojo;

import java.util.Date;

//news消息表
public class News {
		private Integer newsID;//	消息编号、主键，自增
		private Integer theSender;//外键，发件人编号
		private Integer addRessee;//外键，收件人编号
		private Integer content;//	内容
		private Date sendingTime;//	发送时间
		private Boolean readState;//是否已读
		private Integer newsType;//	消息类型，1：系统消息，2：站内信
		private Integer messageGroup;//	消息组编号
		public Integer getNewsID() {
			return newsID;
		}
		public void setNewsID(Integer newsID) {
			this.newsID = newsID;
		}
		public Integer getTheSender() {
			return theSender;
		}
		public void setTheSender(Integer theSender) {
			this.theSender = theSender;
		}
		public Integer getAddRessee() {
			return addRessee;
		}
		public void setAddRessee(Integer addRessee) {
			this.addRessee = addRessee;
		}
		public Integer getContent() {
			return content;
		}
		public void setContent(Integer content) {
			this.content = content;
		}
		public Date getSendingTime() {
			return sendingTime;
		}
		public void setSendingTime(Date sendingTime) {
			this.sendingTime = sendingTime;
		}
		public Boolean getReadState() {
			return readState;
		}
		public void setReadState(Boolean readState) {
			this.readState = readState;
		}
		public Integer getNewsType() {
			return newsType;
		}
		public void setNewsType(Integer newsType) {
			this.newsType = newsType;
		}
		public Integer getMessageGroup() {
			return messageGroup;
		}
		public void setMessageGroup(Integer messageGroup) {
			this.messageGroup = messageGroup;
		}
		public News(Integer newsID, Integer theSender, Integer addRessee, Integer content, Date sendingTime,
				Boolean readState, Integer newsType, Integer messageGroup) {
			super();
			this.newsID = newsID;
			this.theSender = theSender;
			this.addRessee = addRessee;
			this.content = content;
			this.sendingTime = sendingTime;
			this.readState = readState;
			this.newsType = newsType;
			this.messageGroup = messageGroup;
		}
		public News() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
}
