package com.accp.reception.dao.lw;



import com.accp.reception.pojo.Services;
import org.apache.ibatis.annotations.Param;


public interface ServicesDao {
	
	/**
	 * 
	* @title: addservies 
	* @description: 商家发布服务
	* @param service
	* @return
	 */
	public int addservies(@Param("services")Services services);
}
