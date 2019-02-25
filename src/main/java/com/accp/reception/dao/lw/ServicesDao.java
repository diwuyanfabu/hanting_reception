package com.accp.reception.dao.lw;


import com.accp.reception.pojo.LanguageType;
import com.accp.reception.pojo.MajorType;
import com.accp.reception.pojo.ServiceType;
import com.accp.reception.pojo.Services;
import com.accp.reception.pojo.ShArea;
import com.accp.reception.pojo.User;
import com.accp.reception.vo.lw.ServicesVo;

import java.util.List;

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
	
	/**
	 * 
	* @title: queryServiceType 
	* @description: 服务类别父级编号，为空则代表查询最高级服务类别
	* @param stpid
	* @param selectNum
	* @return
	 */
	public List<ServiceType> queryServiceType(@Param("stpid")Integer stpid,@Param("selectNum")Integer selectNum);
	
	
	/**
	 * 
	* @title: queryLanguagetype 
	* @description: 查询服务语言
	* @return
	 */
	public List<LanguageType> queryLanguagetype();
	
	/**
	 * 
	* @title: queryMajortype 
	* @description: 查询擅长专业
	* @return
	 */
	public List<MajorType> queryMajortype();
	
	/**
	 * 
	* @title: querySharea 
	* @description: 查询中韩行政地区地址信息
	* @param pid
	* @param flag
	* @return
	 */
	public List<ShArea> querySharea(@Param("pid")Integer pid,@Param("flag")boolean flag);
	
	/**
	 * 
	* @title: queryBond 
	* @description: 查询商家入驻需缴纳保证金金额
	* @return
	 */
	public float queryBond();
	
	/**
	 * 
	* @title: queryUser 
	* @description: 模拟登录
	* @param userID
	* @return
	 */
	public User queryUser(@Param("userID") Integer userID);
	
	/**
	 * 
	* @title: merchantMove 
	* @description: 商家入驻
	* @param user
	* @param bond
	* @return
	 */
	public int merchantMove(@Param("obj")User user,@Param("bond")float bond);
	
	/**
	 * 
	* @title: saveGoldNotes 
	* @description: 新增金币流向记录
	* @param userID
	* @param acquisitionMode
	* @param recordDescribe
	* @param recordInAndOut
	* @param auditStatus
	* @return
	 */
	public int saveGoldNotes(@Param("userID")Integer userID,@Param("acquisitionMode")Integer acquisitionMode,@Param("recordDescribe")String recordDescribe,@Param("recordInAndOut")float recordInAndOut,@Param("auditStatus")Integer auditStatus);
	
	/**
	 * 
	* @title: saveXtxx 
	* @description: 新增系统信息
	* @param userID
	* @param content
	* @return
	 */
	public int saveXtxx(@Param("userid")Integer userID,@Param("content")String content);
	
	/**
	 * 
	* @title: queryServiceByTitle 
	* @description: 查询我的发布服务
	* @param serviceTitle
	* @param userid
	* @return
	 */
	public List<ServicesVo> queryServiceByTitle(@Param("serviceTitle") String serviceTitle,@Param("userid")Integer userid);
}
