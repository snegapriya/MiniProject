package com.example;

public class Pojo_B {

	
	public static void main(String[] args) {
		
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		System.out.println(age);
		
		a.setAge(42);
		
		int age2 = a.getAge();
		System.out.println(age2);
		
		a.setAge(33);
		
		int age3 = a.getAge();
		System.out.println(age3);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
