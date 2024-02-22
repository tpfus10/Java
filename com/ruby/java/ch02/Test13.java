package com.ruby.java.ch02;

public class Test13 {
	public static void main(String[] args) {
		byte a = 0b00010001;//2진수 표현은 0b로 시작
		byte b = 0b00100010;

		int c = a ^ b;//110011
		System.out.println(Integer.toBinaryString(c));
		
		int f = 12;
		int g = (~f) + 1;
		System.out.println("g=" + g);
		int h = f << 1;
		System.out.println(h);
		
		
	}

}
