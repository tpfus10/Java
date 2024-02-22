//소수 판단 문제
package com.ruby.java.ch03;

import java.util.Scanner;

public class Test31_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
	    int a = sc.nextInt();
		
	    for(int i = 2; i < a; i++) {
	    if(a % i == 0) {
	    	System.out.println("소수가 아닙니다.");break;
	    } else {
	    	System.out.println("소수입니다.");break;
	    }
	}

  }
}

