package com.accp.reception.pojo;
//function权限表
public class Function {
	private Integer fID;//主键，自增
	private Integer pid;//父编号，0默认
	private String fName;//权限名称
	private String url;//连接路径
	public Integer getfID() {
		return fID;
	}
	public void setfID(Integer fID) {
		this.fID = fID;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Function(Integer fID, Integer pid, String fName, String url) {
		super();
		this.fID = fID;
		this.pid = pid;
		this.fName = fName;
		this.url = url;
	}
	public Function() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
