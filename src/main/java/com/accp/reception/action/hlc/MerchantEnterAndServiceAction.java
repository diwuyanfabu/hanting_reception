package com.accp.reception.action.hlc;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;


import com.accp.reception.biz.hlc.MerchantEnterAndServiceBiz;
import com.accp.reception.pojo.ComplaintType;
import com.accp.reception.pojo.LanguageType;
import com.accp.reception.pojo.MajorType;
import com.accp.reception.pojo.Post;
import com.accp.reception.pojo.Resouroe;
import com.accp.reception.pojo.ServiceType;
import com.accp.reception.pojo.Servicelevel;
import com.accp.reception.pojo.Services;
import com.accp.reception.pojo.ShArea;
import com.accp.reception.pojo.User;
import com.accp.reception.util.file.Upload;
import com.accp.reception.vo.hlc.AdvertisementVO;
import com.accp.reception.vo.hlc.Artificiaiintelligence;
import com.accp.reception.vo.hlc.EsLevelVO;
import com.accp.reception.vo.hlc.HomePostVO;
import com.accp.reception.vo.hlc.SameServiceVO;
import com.accp.reception.vo.hlc.SerRecommendVO;
import com.accp.reception.vo.hlc.SerReserveVO;
import com.accp.reception.vo.hlc.ServiceDetailInfo;
import com.accp.reception.vo.hlc.ServiceMerchantInfo;
import com.accp.reception.vo.hlc.ServiceSelect;


@Controller
@RequestMapping("/c/lsm")
public class MerchantEnterAndServiceAction {
	
	@Autowired
	private MerchantEnterAndServiceBiz biz;
	/*@Autowired
	private UserBiz szyUserBiz;*/
	
	
	/**
	 * 获取当前用户session
	 * @param session
	 * @return
	 *
	 **/
	@RequestMapping(value="/user/queryAUser")
	@ResponseBody
	public User queryAUser(HttpSession session) {
		
		/*User user = new User();
		user.setUserID(23);
		user.setUserName("何林聪");
		user.setUserRealName("hlinc");
		*/
		
		
		/*if(session.getAttribute("USER")==null) {
			return null;
		}else {
			User user=((User)session.getAttribute("USER"));
		}*/
		User u=biz.queryUser(24);
		if(u==null) {
			return null;
		}else {
		//System.err.println(u.toString());
		session.setAttribute("USER", u);
		return u;
		}
	}
	
	
	
	
	@GetMapping("merchantEnterUrlCheck")
	public String merchantEnterUrlCheck(HttpSession session) {
		User user = (User)session.getAttribute("USER");	//登录用户对象
		if(user!=null) {
			Integer auditstatus = user.getAuditStatus();
			if(auditstatus==1) {
				return "redirect:/sjrz-shzl.html";
			}else if(auditstatus==2) {
				return "redirect:/sjrz-yktsj.html";
			}else {
				return "redirect:/sjrz-xz.html";
			}
		}else {
			return "redirect:/fw-loginHint.html";
		}
	}
	
	

	/**
	 * 查询订单列表
	 * 
	 * @param page
	 *            页数
	 * @param orderid
	 *            模糊订单号
	 * @param status
	 *            订单类型
	 * @param model
	 * @return
	 *//*
	@RequestMapping("/order/query/list")
	public String queryOrderList(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "") String orderid, @RequestParam(defaultValue = "") Integer status,
			@RequestParam(required = false) Integer commentstatus, Model model, HttpSession session) {
		Integer userId = ((User) session.getAttribute("USER")).getUserID()();
		Orders order = new Orders();
		order.setUserID(userId);
		order.setOrderID(orderid);
		order.setOrderStatus(status);
		order.setCommentstatus(commentstatus);
		PageInfo<Orders> pageInfo = orderBiz.queryOrderList(order, page, 10);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("orderInfo", orderBiz.queryOrderInfo(userId));
		return "grzx-order";
	}
	*/
	
	
	
	/**
	 * 商家入驻填写资料地址
	 * @param model
	 * @param session
	 * @return
	 */
	@GetMapping("merchantEnterUrl")
	public String merchantEnterUrl(Model model,HttpSession session) {
		User user = (User)session.getAttribute("USER");	//登录用户对象
		Float userMoney = user.getUserMoney();	//用户金币
		List<ServiceType> servicetypeList = biz.queryServiceType(null, null);	//获取服务类别
		List<LanguageType> languagetypeList = biz.queryLanguagetype();	//获取服务语言
		List<MajorType> majortypeList = biz.queryMajortype();	//获取擅长专业
		List<ShArea> shareaList = biz.querySharea(null,false);	//获取国家
		List<ShArea> liveCityList = biz.querySharea(2,false);	//获取韩国城市集合
		model.addAttribute("servicetypeList", servicetypeList);	//将服务类别集合存入request
		model.addAttribute("languagetypeList", languagetypeList); //将服务语言集合存入request
		model.addAttribute("majortypeList", majortypeList); //将擅长专业集合存入request
		model.addAttribute("shareaList",shareaList);	//将国家集合存入request
		model.addAttribute("liveCityList",liveCityList);	//将韩国城市集合存入request
		model.addAttribute("bond",biz.queryBond());	//将商家入驻需缴纳保证金额大小存入request
		model.addAttribute("userMoney",userMoney);	//将用户金额存入request
		return "sjrz-txzl";
	}
	/**
	 * 商家入驻
	 * @return
	 */
	/*@PostMapping("merchantEnter")
	public String merchantMove(HttpSession session,User user,String serviceID,MultipartFile shopimgData,MultipartFile identitypositiveimgData,MultipartFile identitynegativeimgData,MultipartFile identityhandimgData) {
		User loginUser = (User)session.getAttribute("USER");	//登录用户
		float bond = biz.queryBond();	//入驻缴纳保证金金额要求
		if(loginUser.getUsermoney()>=bond) {	//如果当前登录用户的金额足够缴纳保证金
			if(serviceID.split(",").length==2) {	//如果用户选择的服务类别为两个
				user.setFirstserviceid(Integer.parseInt(serviceID.split(",")[0]));
				user.setSecondserviceid(Integer.parseInt(serviceID.split(",")[1]));	
			}else {
				user.setFirstserviceid(Integer.parseInt(serviceID));
			}
			try {
				String shopimgDataFName = Upload.uploadFile(shopimgData);
				String identitypositiveimgDataFName = Upload.uploadFile(identitypositiveimgData);
				String identitynegativeimgDataFName = Upload.uploadFile(identitynegativeimgData);
				String identityhandimgDataFName = Upload.uploadFile(identityhandimgData);
				user.setShopimg(shopimgDataFName);	//设置数据库存储图片路径
				user.setIdentitypositiveimg(identitypositiveimgDataFName);
				user.setIdentitynegativeimg(identitynegativeimgDataFName);
				user.setIdentityhandimg(identityhandimgDataFName);
				user.setUserid(loginUser.getUserid());//当前登录用户编号赋给修改对象
			} catch (IllegalStateException | IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			if(biz.merchantMove(user,bond)>0) {//商家入驻受影响行数
				biz.saveGoldNotes(loginUser.getUserid(), 4, "商家入驻缴纳保证金",-bond , 2);	//添加金币流向记录
				szyUserBiz.saveXtxx(loginUser.getUserid(), "您好，您已成功提交商家入驻的申请，请等待管理员审核。");
				return "redirect:/sjrz-shzl.html";
			}else {
				return "redirect:/Public/error/500.html";
			}
		}else {
			return "redirect:/Public/error/500.html";
		}
	}*/
	/**
	 * 查询地址api
	 * @param pid
	 * @return
	 */
	@GetMapping("api/querySharea")
	@ResponseBody
	public List<ShArea> querySharea(Integer pid){
		return biz.querySharea(pid,false);
	}
	/**
	 * 点击服务详情跳转对应详情MVC地址
	 * @param htmlUrl
	 * @param sid
	 * @param uid
	 * @return
	 */
	@GetMapping("serviceDetailUrl")
	public String serviceDetailUrl(Model model,String htmlUrl,Integer sid,Integer uid,HttpSession session) {
		System.err.println(htmlUrl+","+sid+","+uid);
		//查询发布服务的商家信息
		ServiceMerchantInfo serMerchantObj = biz.queryServiceMerchantInfo(uid,sid);
	//	System.err.println(uid+","+sid);
		//查询服务信息
		ServiceDetailInfo serDetailObj = biz.queryServiceDetailInfo(sid);
		serDetailObj.setSerDesList(biz.queryServiceDes(sid));//Servicedes 服务信息
		//服务评价星级人数查询
		EsLevelVO esLObj = biz.queryEsLevelVO(sid);
		//System.err.println(esLObj);
		//同城服务查询
		List<SameServiceVO> sameserList = biz.querySameServiceVO(sid);
		//举报原因查询
		List<ComplaintType> complainttypeList = biz.queryComplainttype();//Complainttype 举报原因
		//更新浏览数
		biz.updateServiceBrowseNumber(sid);
		//广告查询：未完成
		model.addAttribute("serMerchantObj",serMerchantObj);//ServiceMerchantInfo  查询发布服务的商家信息
		model.addAttribute("serDetailObj",serDetailObj);//ServiceDetailInfo 服务信息
		model.addAttribute("esLObj",esLObj);		//服务评价星级人数查询
		model.addAttribute("sameserList",sameserList);//同城服务查询
	//	System.out.println(sameserList.size());
		for (SameServiceVO temp : sameserList) {
			//System.out.println(temp);
		}
		model.addAttribute("complainttypeList",complainttypeList);//Complainttype 举报原因
		
		User user = (User)session.getAttribute("USER");
		if(user!=null) {
			
		}
		return htmlUrl;
	}
	/**
	 * 点击服务跳转对应MVC地址
	 * @param htmlUrl 跳转的网页名称
	 * @param stid	服务类别编号
	 * @return
	 */
	@GetMapping("serviceUrl")
	public String serviceUrl(String htmlUrl,Integer stid,Model model) {
		//查询国家
		List<ShArea> countryList = biz.querySharea(null, false);	
		//根据一级服务类别获取子类别
		List<ServiceType> serTypeList = biz.queryServiceType(stid, 1);
		//根据一级服务类别获取级别
		List<Servicelevel> serLevelList = biz.queryServicelevel(stid);
		model.addAttribute("countryList",countryList);	//将国家存入request
		model.addAttribute("serTypeList",serTypeList);	//将当前一级服务类别的子类别存入request
		model.addAttribute("serLevelList",serLevelList);//将当前一级服务类别的级别存入request
		
		/*User user = (User)session.getAttribute("USER");
		
		System.err.println(user);
		if(user!=null) {
			List<Services> ar = biz.selectAI(user.getUserID(), stid);
			model.addAttribute("selectAI",ar);
			System.err.println(ar.size());
		}else {
			model.addAttribute("selectAI",biz.selectAI(0, stid));
		}*/
		for (Servicelevel shArea : serLevelList) {
			//System.err.println(shArea);
		}
		return htmlUrl;
	}
	
	/**
	 * 人工智能 查询
	 * @return
	 */
	@GetMapping("api/selectAI")
	@ResponseBody
	public List<Services> selectAI(Integer stid,HttpSession session){
		User user = (User)session.getAttribute("USER");
		if(user!=null) {
			List<Services> ai = biz.selectAI(user.getUserID(), stid);
			System.err.println(ai.size());
			return ai;
		}else {
			return biz.selectAI(0, stid);
		}
	}
	
	
	/**
	 * 
	 * @title: insertAI
	 * @description: 人工智能 添加
	 * @param session
	 * @param sid
	 * @return
	 * 下午9:21:04
	 */
	@GetMapping("api/insertAI")
	@ResponseBody
	public Map<String,String> insertAI(HttpSession session,String ai){
		Map<String,String> message = new HashMap<String,String>();
		User user = (User)session.getAttribute("USER");
		if(user!=null) {
			Artificiaiintelligence ail =  JSON.parseObject(ai,Artificiaiintelligence.class);
			System.out.println(ail);
			ail.setUserId(user.getUserID());
			biz.insertAI(ail);
		}
		return message;
	}
	
	
	/**
	 * 根据服务列表条件查询服务
	 * @return
	 */
	@GetMapping("api/queryServices")
	@ResponseBody
	public PageInfo<SerReserveVO> queryServices(String objJSON,int num,int size){
		ServiceSelect obj = JSON.parseObject(objJSON,ServiceSelect.class);
		//开始时间
		String startDate= obj.getStartDate();
		startDate = startDate!=null&&startDate!=""?startDate+" 00:00:00":null;
		//结束时间
		String endDate= obj.getEndDate();
		endDate = endDate!=null&&endDate!=""?endDate+" 00:00:00":null;
		obj.setStartDate(startDate);
		obj.setEndDate(endDate);
		System.err.println(obj);
		return biz.queryServices(obj, num, size);
	}
	/**
	 * 查询对应服务类别下的子类别
	 * @param stpid
	 * @return
	 */
	@GetMapping("api/queryServiceTypeChild")
	@ResponseBody
	public List<ServiceType> queryServiceTypeChild(Integer stpid){
		List<ServiceType> list = biz.queryServiceType(stpid, 1);
		
		/*for (ServiceType temp : list) {
			System.err.println(temp);
		}*/
		return list;
	}
	/**
	 * 查询城市
	 * @param areaid
	 * @return
	 */
	@GetMapping("api/queryCity")
	@ResponseBody
	public List<ShArea> queryCity(Integer areaid){
		return biz.querySharea(areaid, true);
	}
	/**
	 * 评价查询
	 * @param num
	 * @param size
	 * @param sid
	 * @return
	 */
	@GetMapping("api/queryEvaluationserviceVO")
	@ResponseBody
	public PageInfo queryEvaluationserviceVO(Integer num,Integer size,Integer sid) {
		//评价查询
		return biz.queryEvaluationserviceVO(num,size,sid);
	}
	
	/**
	 * 
	 * @title: saveServiceReport
	 * @description: 举报 商家
	 * @param session 
	 * @param businessID //商家编号
	 * @param serviceID //服务编号
	 * @param ctID  //举报类别ID
	 * @return
	 * 上午10:06:12
	 */
	@PostMapping("api/report")
	@ResponseBody
	public Map<String,String> saveServiceReport(HttpSession session,Integer businessID,Integer serviceID,Integer ctID) {
		Map<String,String> message = new HashMap<String,String>();
		User loginUser = (User)session.getAttribute("USER");	//登录对象：举报人
		Integer loginUserID = loginUser.getUserID();	//当前举报人用户编号
		loginUserID =biz.queryUser(24).getUserID();
	//	System.out.println(businessID+","+serviceID+","+ctID);
		if(biz.saveServiceReport(businessID, serviceID, loginUserID, ctID)>0) {
			message.put("code", "200");
			message.put("msg", "举报完成，请等待管理员审核");
		}else {
			message.put("code", "500");
			message.put("msg", "由于未知原因，举报失败！");
		}
		return message;
	}
	/**
	 * MVC：预约服务地址
	 * @param srVOobj
	 * @param model
	 * @return
	 */
	@PostMapping("serReserveUrl")
	public String serReserveUrl(SerReserveVO srVOobj,Model model) {
		Integer sid = srVOobj.getServiceID();	//服务编号
		ServiceDetailInfo serDetailObj = biz.queryServiceDetailInfo(sid);	//服务详情对象
		List<Resouroe> resouroeList = biz.queryResouroe();
	//	System.out.println(JSON.toJSONString(srVOobj));
		model.addAttribute("srVOobj",srVOobj);	
		model.addAttribute("serDetailObj",serDetailObj);
		model.addAttribute("resouroeList",resouroeList);
		return "fw-ydfw";
	}
	/**
	 * MVC:提交预定
	 * @return
	 */
	@PostMapping("serReserve")
	public String submitReserve(HttpSession session,SerReserveVO obj,MultipartFile hyFile) {
		User loginUser = (User)session.getAttribute("USER");
		Integer loginUserID = loginUser.getUserID();	//当前登录用户编号
		//时间戳
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		//订单号
		String orderID = sdf.format(new Date());
		Integer rd =  (int)(Math.random()*899+100);
		orderID = orderID+rd;	//三位随机数添加到订单号后面
		if(obj.getServiceTypeID()==4) {
			try {
				String fileName = Upload.uploadFile(hyFile);
				obj.setUploadPath(fileName);
			} catch (IllegalStateException | IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		obj.setOrderID(orderID);
		obj.setUserID(loginUserID);
		int ret = biz.submitReserve(obj);
		System.err.println("服务是否成功:"+ret);
		return "redirect:/c/lhy/order/query/list";
	}
	/**
	 * 收藏服务
	 * @param session
	 * @param sid
	 * @return
	 */
	@GetMapping("api/serviceCollection")
	@ResponseBody
	public Map<String,String> serviceCollection(HttpSession session,Integer sid){
		Map<String,String> message = new HashMap<String,String>();
		User loginUser = (User)session.getAttribute("USER");
		Integer uid = loginUser.getUserID();
		if(biz.queryUserSerCollectionCheck(uid, sid)==null) {
			biz.saveSerCollection(uid, sid);
			message.put("code", "200");
			message.put("msg", "已收藏");
		}else {
			biz.deleteSerCollection(uid, sid);
			message.put("code", "200");
			message.put("msg", "取消收藏");
		}
		return message;
	}
	/**
	 * MVC:首页地址
	 * @param model
	 * @return
	 */
	@GetMapping("homeUrl")
	public String homeUrl(Model model) {
		//首页社区服务轮播图广告位查询
		List<AdvertisementVO> homeSlideshowList = biz.queryHomeAdvertising(1);
		//首页社区服务中间广告位查询
		List<AdvertisementVO> homeMidAdvertingList = biz.queryHomeAdvertising(2);
		//首页社区上方左右广告位查询
		List<AdvertisementVO> homeTopAdvertingList = biz.queryHomeAdvertising(3);
		//首页社区下方广告位查询
		List<AdvertisementVO> homeBottomAdvertingList = biz.queryHomeAdvertising(4);
		//五大星级服务商家查询
		List<SerRecommendVO> recommendStidByOneList = biz.querySerRecommendVO(1);	//自驾游
		List<SerRecommendVO> recommendStidByTwoList = biz.querySerRecommendVO(2);	//微整形
		List<SerRecommendVO> recommendStidByThreeList = biz.querySerRecommendVO(3);	//留学中介
		List<SerRecommendVO> recommendStidByFourList = biz.querySerRecommendVO(4);	//韩语翻译
		List<SerRecommendVO> recommendStidByFiveList = biz.querySerRecommendVO(5);	//学习资源
		//韩汀社区论坛热门贴查询
		List<HomePostVO> homePostVOList = biz.queryHomePostVO();	//最新帖子
		List<Post> homePostMakeUpList = biz.queryHomePostByMakeup();	//美妆版块帖子
		model.addAttribute("homeSlideshowList",homeSlideshowList);
		model.addAttribute("homeMidAdvertingList",homeMidAdvertingList);
		model.addAttribute("recommendStidByOneList",recommendStidByOneList);
		model.addAttribute("recommendStidByTwoList",recommendStidByTwoList);
		model.addAttribute("recommendStidByThreeList",recommendStidByThreeList);
		model.addAttribute("recommendStidByFourList",recommendStidByFourList);
		model.addAttribute("recommendStidByFiveList",recommendStidByFiveList);
		model.addAttribute("homePostVOList",homePostVOList);
		model.addAttribute("homePostMakeUpList",homePostMakeUpList);
		model.addAttribute("homeTopAdvertingList",homeTopAdvertingList);
		model.addAttribute("homeBottomAdvertingList",homeBottomAdvertingList);
		return "fw-sy";
	}
}
