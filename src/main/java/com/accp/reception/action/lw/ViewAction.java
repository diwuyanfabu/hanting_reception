package com.accp.reception.action.lw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewAction {
	
	@GetMapping("fbfw")
	public String goToLogin() {
		return "sjzx-fbfw";//模板文件名
	}

}
