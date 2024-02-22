//경우의 수
package com.ruby.java.ch05;

import java.util.Scanner;

public class practice1 {
	
	//변수 선언하고 범위 지정하기
	static void problem(int b) {
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j < 11; j++) {
				for(int z = 1; z < 11; z++) {
					int sum = (2*i) + (3*j) + (5*z);
					if(sum == b) {                  
						System.out.println("(" + i + j + z + ")");
					}	
				}
			}
		}
	}
		
	public static void main(String[] args) {
		//임의의 값 입력받기(10~100)
		Scanner sc = new Scanner(System.in);
		System.out.println("a:");
	    int a = sc.nextInt();
	    problem(a); //메서드 호출
	}
	
}
