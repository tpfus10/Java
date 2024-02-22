package com.ruby.java.ch05;

public class Test01 {
	static void test(int... v) {
		System.out.print(v.length + " : ");
		for(int x : v) //배열에 있는 값을 순차적으로 탐색
			System.out.print(x + " ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		test(1);
		test(1, 2);
		test(1, 2, 3);
	}

}
