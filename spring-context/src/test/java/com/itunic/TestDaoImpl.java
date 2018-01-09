package com.itunic;

public class TestDaoImpl implements TestDao{
	public TestDaoImpl(){
		System.out.println("TestDao instance");
	}
	@Override
	public void sayHello() {
		System.out.println("TestDao sayHello running");
	}


}
