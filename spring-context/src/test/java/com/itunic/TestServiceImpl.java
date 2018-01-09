package com.itunic;

public class TestServiceImpl implements TestService{
	private TestDao dao;


	public TestServiceImpl(TestDao dao) {
		this.dao = dao;
	}

	public void setDao(TestDao dao) {
		this.dao = dao;
	}

	public TestServiceImpl(){
		System.out.println("TestServiceImpl instance");
	}
	@Override
	public void hello() {
		System.out.println("TestServiceImpl hello() running");
		dao.sayHello();
	}
}
