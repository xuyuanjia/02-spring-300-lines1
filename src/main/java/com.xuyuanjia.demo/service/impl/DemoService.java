package com.xuyuanjia.demo.service.impl;

import com.xuyuanjia.demo.service.IDemoService;
import com.xuyuanjia.mvcframework.annotation.GPService;

/**
 * 核心业务逻辑
 */
@GPService
public class DemoService implements IDemoService{

	@Override
	public String get(String name) {
		return "My name is " + name;
	}

}
