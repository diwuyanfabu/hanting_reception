$(".top_right").html("");
	$.getJSON("/c/lsm/user/queryAUser",function(data){
		if(data==null){
			alert();
			$(".top_right").append($('<a href="/szy-login.html">登录</a><span class="ht_line"></span><a href="/szy-zuce.html">注册</a>'));
		}else{
			$(".top_right").append($('<a href="/c/lhy/center/home">'+data.userName+'</a> <span class="ht_line"></span><a href="/c/szy/user/close">退出</a><span class="ht_line"></span><a href="/xx-xtxx.html"><img src="/Public/images/e_i.png" alt=""></a>'));
		}
	})
