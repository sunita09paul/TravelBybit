package com.demo;

public class MethodOverloading {

	public static void main(String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		
		
		
		MethodOverloading obj1 = new Child();
		obj1.sum(100);
		
		
	}
	
	public void sum (int a) {
		System.out.println(a);
	}
	
	public void sum(int a, float b) {
		System.out.println(a+b);
	}
}

 class Child extends MethodOverloading {
	 
	 public void sum (int a) {
			System.out.println(a+1);
			
			
		}
	 public void subtraction (int a) {
			System.out.println(a+1);
			
			
		}
	 
	
}
