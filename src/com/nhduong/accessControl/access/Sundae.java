package com.nhduong.accessControl.access;

public class Sundae {
	private Sundae(){
		
	}
	static Sundae makeSundae(){
		return new Sundae();
	}
	
	void test(){
		System.out.println("Test");
	}
}
