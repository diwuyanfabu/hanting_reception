package com.accp.reception.action.lw;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.accp.reception.biz.lw.ServicesBiz;
import com.accp.reception.pojo.Services;
import com.accp.reception.util.file.Upload;



@Controller
@RequestMapping("/c/lw")
public class ServicesAcion {
	
	@Autowired
	private ServicesBiz biz;
	
	
	
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
				return "redirect:/zg/c/getServices?pageNum=1&pageSize=3";
	}
}
