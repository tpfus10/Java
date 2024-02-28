package com.ruby.java.ch14;

interface Verify {
	boolean check(int n);
}

public class Test03 {
	public static void main(String[] args) {
		Verify isEVen = (n) -> (n%2) == 0; //Verify 인터페이스를 람다식으로 구현
		System.out.println(isEVen.check(10));
		
		Verify isPositive = (n) -> n>=0; //Verify 인터페이스를 람다식으로 구현
		System.out.println(isPositive.check(-5));
	}
}
