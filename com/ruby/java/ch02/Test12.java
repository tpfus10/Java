package com.ruby.java.ch02;

public class Test12 {
	public static void main(String[] args) {
		int a = 017;//8진법은 0으로 시작
		int b = 0xf;//16진법은 0x로 시작
		System.out.println("a=" + a + ", b=" + b);
		String hexa = Integer.toHexString(b);
		System.out.println("hexa=" + hexa);
		
	}

}
