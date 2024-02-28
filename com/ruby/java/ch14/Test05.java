package com.ruby.java.ch14;

interface NumberFunc {
	int func(int n);
}

public class Test05 {
	
	public static void main(String[] args) {
		NumberFunc sum = (n) -> {
			int result0 = 0;
			for(int i = 0; i <= n; i++) {
				result0 += i;
			}
			return result0;
		};
		
		NumberFunc even = (n) -> {
			int result1 = 0; 
			for(int i = 0; i <= n; i++) {
				if((i%2) == 0) {
					result1 += i;
				}
			}
			return result1;
		};
		
		NumberFunc odd = (n) -> {
			int result2 = 0; 
			for(int i = 0; i <= n; i++) {
				if((i%2) != 0) {
					result2 += i;
				}
			}
			return result2;
		};
		
		System.out.println("1부터 10까지의 합 : " + sum.func(10));
		System.out.println("1부터 100까지의 합 : " + sum.func(100));
		System.out.println("1부터 10까지 짝수의 합 : " + even.func(10));
		System.out.println("1부터 100까지 짝수의 합 : " + even.func(100));
		System.out.println("1부터 10까지 홀수의 합 : " + odd.func(10));
		System.out.println("1부터 100까지 홀수의 합 : " + odd.func(100));
	}

}
