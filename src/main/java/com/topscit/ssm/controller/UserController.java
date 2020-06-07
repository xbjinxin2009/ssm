package com.topscit.ssm.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.topscit.ssm.bean.User;

@RequestMapping("/user")
@Controller
public class UserController {

	
	//json格式字符串->java对象
	//如果用springmvc，会自动获取参数并且自动转换为我们需要的对象
	@RequestMapping("/checkUserName")
	@ResponseBody
	public HashMap<Object,Object> checkUserName(@RequestBody User user )
	{
		String uname = user.getUname();
		System.out.println(uname);
		
		//假设用户名已存在，接下来返回数据给（用户已存在的信息）发请求的地方
		// html发请求->controller转发或跳到安全目录以内->jsp转换为html->返回html->浏览器看到新页面
		// js发请求->controller把数据转换为json字符串->返回数据
		//转发  重定向   直接返回数据
		//不需要view只需要model
		HashMap<Object,Object> hashMap = new HashMap<>();
		hashMap.put("isExists", true);
		//会自动把返回的对象转换成json字符串
		return hashMap;
	}
	
	
	@RequestMapping("/reg")
	@ResponseBody
	public HashMap<Object,Object> reg(@RequestBody User user)
	{
		//调用service做插入
		//还需要再验证一遍
		HashMap<Object,Object> hashMap = new HashMap<>();
		hashMap.put("success", true);
		hashMap.put("msg", "注册成功");
		return hashMap;
	}
	
	
	
	
	
	
}
