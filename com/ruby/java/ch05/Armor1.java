package com.ruby.java.ch05;

public class Armor1 {

	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");//1
		
		String num = takeoff(6, 7);         //3
		System.out.println(num);
		
//		System.out.println(takeoff());
		
		
		System.out.println("3"); 
		System.out.println("4");//4
		
	}
	static String takeoff(int num1, int num2) {
		System.out.println("take off1");
		System.out.println("take off2"); 
		System.out.println("take off3"); //2
		return num1 + "====>" + num2; 
	}
}
