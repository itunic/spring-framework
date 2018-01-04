package com.itunic;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationCountextStudy {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("spring-study.xml");
		System.out.println("aaa");
	}
}
