package com.accp.reception.action.lw;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.reception.biz.lw.ServicesBiz;
import com.accp.reception.pojo.LanguageType;
import com.accp.reception.pojo.MajorType;
import com.accp.reception.pojo.ServiceType;
import com.accp.reception.pojo.Services;
import com.accp.reception.pojo.ShArea;
import com.accp.reception.pojo.User;
import com.accp.reception.util.file.Upload;
import com.accp.reception.vo.lw.ServicesVo;
import com.github.pagehelper.PageInfo;



@Controller
@RequestMapping("/c/lw")
public class ServicesAcion {
	
	@Autowired
	private ServicesBiz biz;
	
	
	/**
	 * 
	* @title: addServices 
	* @description: 商家发布服务
	* @param session
	* @param model
	* @param stid
	* @param resourceID
	* @param servicetitle
	* @param servicefutitle
	* @param downloadtitle
	* @param serviceprice
	* @param serviceCoverImg
	* @param serviceImgUrlOne
	* @param serviceImgUrlTwo
	* @param serviceImgUrlThree
	* @param serviceImgUrlFour
	* @param serviceintro
	* @param areaids
	* @param countryid
	* @param servicecostinclude
	* @param servicecosttypeid
	* @param uploaddataurl
	* @return
	 */
	@PostMapping("addServices")
	public String  addServices(HttpSession session,Model model,int stid,int resourceID,String servicetitle,String servicefutitle,String downloadtitle,int serviceprice, MultipartFile serviceCoverImg,MultipartFile serviceImgUrlOne,MultipartFile serviceImgUrlTwo,MultipartFile serviceImgUrlThree,MultipartFile serviceImgUrlFour,String serviceintro,String[] areaids, int countryid,String[] servicecostinclude,String servicecosttypeid,String uploaddataurl) {
				
		
				Services service=new Services();
				try {
					if(!serviceCoverImg.isEmpty()) {
						String	fmturl=Upload.uploadFile(serviceCoverImg);
						service.setServiceCoverImg(fmturl);
					}
					if(!serviceImgUrlOne.isEmpty()) {
						String	xjturl1=Upload.uploadFile(serviceImgUrlOne);
						service.setServiceImgUrlOne(xjturl1);
					}
					if(!serviceImgUrlTwo.isEmpty()) {
						
						String	xjturl2=Upload.uploadFile(serviceImgUrlTwo);
						service.setServiceImgUrlTwo(xjturl2);
					}
					if(!serviceImgUrlThree.isEmpty()) {
						String	xjturl3=Upload.uploadFile(serviceImgUrlThree);
						service.setServiceImgUrlThree(xjturl3);
					}
					
					if(!serviceImgUrlFour.isEmpty()) {
						String	xjturl4=Upload.uploadFile(serviceImgUrlFour);
						service.setServiceImgUrlFour(xjturl4);
					}
				} catch (IllegalStateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String cs="";
				for(String i:areaids) {
					cs+=i+",";
				}
				String baohao="";
				for(String val:servicecostinclude) {
					baohao+=val+",";
				}
//				System.out.println(stid);
				service.setStid(stid);
				service.setUserID(1001);
				service.setResourceID(resourceID);
				service.setServiceTitle(servicetitle);
				service.setServiceFuTitle(servicefutitle);
				service.setServiceCity(cs);
				service.setServiceCostInclude(baohao);
				service.setDownloadTitle(downloadtitle);
				service.setServicePrice(serviceprice);
				service.setServiceCostTypeID(servicecosttypeid);
				service.setServiceIntro(serviceintro);
				service.setCountry(countryid);
				service.setUploadDataUrl(uploaddataurl);
				System.out.println(service);
				biz.addservices(service);
				return "redirect:/c/lw/getServices?pageNum=1&pageSize=3";
	}
	/**
	 * 
	* @title: merchantEnterUrl 
	* @description: 商家入驻填写资料地址
	* @param model
	* @param session
	* @return
	 */
	@GetMapping("merchantEnterUrl")
	public String merchantEnterUrl(Model model,HttpSession session) {
//		User user = (User)session.getAttribute("USER");	//登录用户对象
		User user = biz.UserID(25);//模拟登录
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
	 * 
	* @title: querySharea 
	* @description: 查询地址api
	* @param pid
	* @return
	 */
	@GetMapping("api/querySharea")
	@ResponseBody
	public List<ShArea> querySharea(Integer pid){
		return biz.querySharea(pid,false);
	}
	
	/**
	 * 
	* @title: merchantMove 
	* @description: 商家入驻
	* @param session
	* @param user
	* @param serviceID
	* @param shopimgData
	* @param identitypositiveimgData
	* @param identitynegativeimgData
	* @param identityhandimgData
	* @return
	 */
	@PostMapping("merchantEnter")
	public String merchantMove(HttpSession session,User user,String serviceID,MultipartFile shopimgData,MultipartFile identitypositiveimgData,MultipartFile identitynegativeimgData,MultipartFile identityhandimgData) {
//		User loginUser = (User)session.getAttribute("USER");	//登录用户
		User loginUser = biz.UserID(25);
		float bond = biz.queryBond();	//入驻缴纳保证金金额要求
		if(loginUser.getUserMoney()>=bond) {	//如果当前登录用户的金额足够缴纳保证金
			if(serviceID.split(",").length==2) {	//如果用户选择的服务类别为两个
				user.setFirstServiceID(Integer.parseInt(serviceID.split(",")[0]));
				user.setSecondServiceID(Integer.parseInt(serviceID.split(",")[1]));	
			}else {
				user.setFirstServiceID(Integer.parseInt(serviceID));
			}
			try {
				String shopimgDataFName = Upload.uploadFile(shopimgData);
				String identitypositiveimgDataFName = Upload.uploadFile(identitypositiveimgData);
				String identitynegativeimgDataFName = Upload.uploadFile(identitynegativeimgData);
				String identityhandimgDataFName = Upload.uploadFile(identityhandimgData);
				user.setShopImg(shopimgDataFName);	//设置数据库存储图片路径
				user.setIdentityPositiveImg(identitypositiveimgDataFName);
				user.setIdentityNegativeImg(identitynegativeimgDataFName);
				user.setIdentityHandImg(identityhandimgDataFName);
				user.setUserID(loginUser.getUserID());//当前登录用户编号赋给修改对象
			} catch (IllegalStateException | IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(user+"---呼哈---"+bond);
			System.out.println(loginUser.getUserID());
			if(biz.merchantMove(user,bond)>0) {//商家入驻受影响行数
				biz.saveGoldNotes(loginUser.getUserID(), 4, "商家入驻缴纳保证金",-bond , 2);	//添加金币流向记录
				biz.saveXtxx(loginUser.getUserID(), "您好，您已成功提交商家入驻的申请，请等待管理员审核。");
				return "redirect:/sjrz-shzl.html";
			}else {
				return "redirect:/Public/error/500.html";
			}
		}else {
			return "redirect:/Public/error/500.html";
		}
	}
	/**
	 * 
	* @title: queryService 
	* @description: 查询我发布的服务
	* @param session
	* @param model
	* @param pageNum
	* @param pageSize
	* @return
	 */
	@GetMapping("getServices")
	public String  queryService(HttpSession session,Model model,Integer pageNum,Integer pageSize) {
		User loginUser = biz.UserID(25);
		PageInfo<ServicesVo> pageInfo=biz.queryServices(pageNum, pageSize,loginUser.getUserID());
		model.addAttribute("PAGE_INFO", pageInfo);
		return "sjzx-services";
	}
	
}
