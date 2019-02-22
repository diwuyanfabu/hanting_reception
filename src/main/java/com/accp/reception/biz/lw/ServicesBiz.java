package com.accp.reception.biz.lw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.reception.dao.lw.ServicesDao;
import com.accp.reception.pojo.LanguageType;
import com.accp.reception.pojo.MajorType;
import com.accp.reception.pojo.ServiceType;
import com.accp.reception.pojo.Services;
import com.accp.reception.pojo.ShArea;
import com.accp.reception.pojo.User;
import com.accp.reception.vo.lw.ServicesVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ServicesBiz {
	
	@Autowired
	private ServicesDao dao;
	
	/**
	 * 
	* @title: addservices 
	* @description: 商家发布服务
	* @param service
	* @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addservices(Services service) {
		Integer count = dao.addservies(service);
		return count;
	}
	/**
	 * 
	* @title: queryServiceType 
	* @description: 查询服务类别
	* @param stpid
	* @param selectNum
	* @return
	 */
	public List<ServiceType> queryServiceType(Integer stpid,Integer selectNum){
		return dao.queryServiceType(stpid, selectNum);
	}
	/**
	 * 
	* @title: queryLanguagetype 
	* @description: 查询服务语言
	* @return
	 */
	public List<LanguageType> queryLanguagetype(){
		return dao.queryLanguagetype();
	}
	
	/**
	 * 
	* @title: queryMajortype 
	* @description: 查询擅长专业
	* @return
	 */
	public List<MajorType> queryMajortype(){
		return dao.queryMajortype();
	}
	
	/**
	 * 
	* @title: querySharea 
	* @description: 查询中韩行政地区地址信息
	* @param pid
	* @param flag
	* @return
	 */
	public List<ShArea> querySharea(Integer pid,boolean flag){
		return dao.querySharea(pid,flag);
	}
	
	/**
	 * 
	* @title: queryBond 
	* @description: 查询商家入驻需缴纳保证金金额
	* @return
	 */
	public float queryBond() {
		return dao.queryBond();
	}
	
	/**
	 * 
	* @title: UserID 
	* @description: 模拟登录
	* @param userID
	* @return
	 */
	public User UserID(Integer userID) {
		return dao.queryUser(userID);
		
	}
	
	/**
	 * 
	* @title: merchantMove 
	* @description: 商家入驻
	* @param user
	* @param bond
	* @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int merchantMove(User user,float bond) {
		return dao.merchantMove(user,bond);
	}
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
	public int saveGoldNotes(Integer userID,Integer acquisitionMode,String recordDescribe,float recordInAndOut,Integer auditStatus) {
		return dao.saveGoldNotes(userID, acquisitionMode, recordDescribe, recordInAndOut, auditStatus);
	}
	/**
	 * 
	* @title: saveXtxx 
	* @description: 新增系统消息
	* @param userID
	* @param content
	* @return
	 */
	public boolean saveXtxx(Integer userID,String content) {
		return dao.saveXtxx(userID, content)>0;
	}
	/**
	 * 
	* @title: queryServices 
	* @description: 查询我发布的服务
	* @param pageNum
	* @param pageSize
	* @param userid
	* @return
	 */
	public PageInfo<ServicesVo> queryServices(Integer pageNum,Integer pageSize,Integer userid){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<ServicesVo>(dao.queryServiceByTitle(null,userid));
	}
}
