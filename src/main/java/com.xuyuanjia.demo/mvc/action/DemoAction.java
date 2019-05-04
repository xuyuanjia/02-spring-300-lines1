package com.xuyuanjia.demo.mvc.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuyuanjia.demo.service.IDemoService;
import com.xuyuanjia.mvcframework.annotation.GPAutowired;
import com.xuyuanjia.mvcframework.annotation.GPController;
import com.xuyuanjia.mvcframework.annotation.GPRequestMapping;
import com.xuyuanjia.mvcframework.annotation.GPRequestParam;

@GPController
@GPRequestMapping("/demo")
public class DemoAction {

  	@GPAutowired private IDemoService demoService;

	@GPRequestMapping("/query")
	public void query(HttpServletRequest req, HttpServletResponse resp,
					  @GPRequestParam("name") String name){
		String result = demoService.get(name);
//		String result = "My name is " + name;
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GPRequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@GPRequestParam("a") Integer a, @GPRequestParam("b") Integer b){
		try {
			resp.getWriter().write(a + "+" + b + "=" + (a + b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GPRequestMapping("/remove")
	public void remove(HttpServletRequest req,HttpServletResponse resp,
					   @GPRequestParam("id") Integer id){
	}

}
