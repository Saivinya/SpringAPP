package com.basiccrud.components;

import org.springframework.stereotype.Component;

@Component
public class Saivinya {
	
	
	public void add(int a,int b) {
		
		System.out.println(a+b);
	}
	public String back(String str) {
		return "Hello"+str+"!";
	}

}
