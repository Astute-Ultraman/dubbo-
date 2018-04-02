package com.dubbo.demo.provider.impl;

import java.util.ArrayList;
import java.util.List;

import com.dubbo.demo.DemoService;


public class DemoServiceImp implements DemoService {

	@Override
	public List<String> getPerssions(Long id) {
		List<String> demo = new ArrayList<String>();
		demo.add(String.format("Permission_%d", id - 1));
		demo.add(String.format("Permission_%d", id));
		demo.add(String.format("Permission_%d", id + 1));
		return demo;
	}
	

}
