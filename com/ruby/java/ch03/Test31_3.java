//입력받은 자릿수의 소수를 보여주기 
package com.ruby.java.ch03;

import java.util.Scanner;

public class Test31_3 {
	public static void main(String[] args) {
		//자릿수를 입력받자
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
	    int a = sc.nextInt();
		
	  //2부터 자기자신보다 하나 작은 수까지 나누어서 나누어지지 않으면 소수->소수 구하기
	  //자릿수 내에서 반복하자
	    for(int i = 2; i < a; i++) {//자릿수 입력하기부터 시작하기
	    if(a % i == 0) {
	    	System.out.println("소수가 아닙니다.");
	    } 
		
		//소수 출력하자
		
		

	}

	}
}
