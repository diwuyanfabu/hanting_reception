package com.accp.reception.pojo;

import java.util.Date;

public class Post {
	private Integer postID;//主键，自增
	private Integer userID;//用户ID
	private Integer browseNumber;//	浏览数
	private Integer commentNumber;//	评论数
	private Integer fabulousNumber;//	点赞数
	private Integer collectionNumber;//	收藏数
	private Integer fmID;//	外键，论坛板块管理表(里边有帖子类别，也相当于板块类别，填最低层级编号)
	private String title;//	标题
	private String content;//内容
	private Date releaseTime;//发布时间
	private Integer operatingState;//	操作状态(1未删除2已删除)
	private String adminOpinion;//管理员意见
	private Boolean essence;//	加精
	private Boolean solid;//加固
	private Integer majorID;//	外键，专业类别
	private String resourcesPath;//	资源地址
	private String serviceCostTypeID;//	逻辑外键，费用说明
	private Integer integral;//	所需积分
	private Integer goldCoin;//	所需金币
	private String videoPath;//上传视频
	private String coverPath;//视频封面
	private String time;//视频时长(0分0秒)
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
	public Integer getPostID() {
		return postID;
	}
	public void setPostID(Integer postID) {
		this.postID = postID;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getBrowseNumber() {
		return browseNumber;
	}
	public void setBrowseNumber(Integer browseNumber) {
		this.browseNumber = browseNumber;
	}
	public Integer getCommentNumber() {
		return commentNumber;
	}
	public void setCommentNumber(Integer commentNumber) {
		this.commentNumber = commentNumber;
	}
	public Integer getFabulousNumber() {
		return fabulousNumber;
	}
	public void setFabulousNumber(Integer fabulousNumber) {
		this.fabulousNumber = fabulousNumber;
	}
	public Integer getCollectionNumber() {
		return collectionNumber;
	}
	public void setCollectionNumber(Integer collectionNumber) {
		this.collectionNumber = collectionNumber;
	}
	public Integer getFmID() {
		return fmID;
	}
	public void setFmID(Integer fmID) {
		this.fmID = fmID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public Integer getOperatingState() {
		return operatingState;
	}
	public void setOperatingState(Integer operatingState) {
		this.operatingState = operatingState;
	}
	public String getAdminOpinion() {
		return adminOpinion;
	}
	public void setAdminOpinion(String adminOpinion) {
		this.adminOpinion = adminOpinion;
	}
	public Boolean getEssence() {
		return essence;
	}
	public void setEssence(Boolean essence) {
		this.essence = essence;
	}
	public Boolean getSolid() {
		return solid;
	}
	public void setSolid(Boolean solid) {
		this.solid = solid;
	}
	public Integer getMajorID() {
		return majorID;
	}
	public void setMajorID(Integer majorID) {
		this.majorID = majorID;
	}
	public String getResourcesPath() {
		return resourcesPath;
	}
	public void setResourcesPath(String resourcesPath) {
		this.resourcesPath = resourcesPath;
	}
	public String getServiceCostTypeID() {
		return serviceCostTypeID;
	}
	public void setServiceCostTypeID(String serviceCostTypeID) {
		this.serviceCostTypeID = serviceCostTypeID;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public Integer getGoldCoin() {
		return goldCoin;
	}
	public void setGoldCoin(Integer goldCoin) {
		this.goldCoin = goldCoin;
	}
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
	public String getCoverPath() {
		return coverPath;
	}
	public void setCoverPath(String coverPath) {
		this.coverPath = coverPath;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public Post(Integer postID, Integer userID, Integer browseNumber, Integer commentNumber, Integer fabulousNumber,
			Integer collectionNumber, Integer fmID, String title, String content, Date releaseTime,
			Integer operatingState, String adminOpinion, Boolean essence, Boolean solid, Integer majorID,
			String resourcesPath, String serviceCostTypeID, Integer integral, Integer goldCoin, String videoPath,
			String coverPath, String time, Integer auditStatus) {
		super();
		this.postID = postID;
		this.userID = userID;
		this.browseNumber = browseNumber;
		this.commentNumber = commentNumber;
		this.fabulousNumber = fabulousNumber;
		this.collectionNumber = collectionNumber;
		this.fmID = fmID;
		this.title = title;
		this.content = content;
		this.releaseTime = releaseTime;
		this.operatingState = operatingState;
		this.adminOpinion = adminOpinion;
		this.essence = essence;
		this.solid = solid;
		this.majorID = majorID;
		this.resourcesPath = resourcesPath;
		this.serviceCostTypeID = serviceCostTypeID;
		this.integral = integral;
		this.goldCoin = goldCoin;
		this.videoPath = videoPath;
		this.coverPath = coverPath;
		this.time = time;
		this.auditStatus = auditStatus;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
