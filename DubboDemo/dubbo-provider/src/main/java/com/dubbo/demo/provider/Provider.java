package com.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
		
		 System.out.println(ctx.getDisplayName() + ": here");
		 ctx.start();
         System.out.println("服务已经启动...");
         System.in.read();
		
	}
}
