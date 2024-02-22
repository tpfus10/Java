package com.ruby.java.ch02;

public class Test11 {
	public static void main(String[] args) {
		int a = 12;
		int b = -12;
		String bBit = Integer.toBinaryString(b);//()값을 2진수로 바꿔줌
		System.out.println("bBit = " + bBit);
		
		String aBit = Integer.toBinaryString(a);
		System.out.println("bBit = " + aBit);
	}

}
