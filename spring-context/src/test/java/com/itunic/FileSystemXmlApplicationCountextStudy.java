package com.itunic;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationCountextStudy {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath*:spring-study2.xml");
		TestService testService = (TestService)context.getBean("testService");
		testService.hello();

	}
}
