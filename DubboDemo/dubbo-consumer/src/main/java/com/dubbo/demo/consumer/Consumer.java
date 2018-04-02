package com.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.demo.DemoService;

/**
 * Hello world!
 * 
 */
public class Consumer {
	public static void main(String[] args) {
		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
		
		context.start();
		System.out.println("consumer start");
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println("consumer");
		System.out.println(demoService.getPerssions(100l));
	}
}
