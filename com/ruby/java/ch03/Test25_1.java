package com.ruby.java.ch03;

import java.util.Scanner;

public class Test25_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Num:");
		int num = sc.nextInt();//입력을 대기하는 상태, 디버그하려면 값을 입력해야 함
		
		int sum1 = 0; // 홀수합
		int sum2 = 0; // 짝수합
		for(int i = 0; i < num; i++) {
			if(i%2 == 0) {       //짝수
				sum2 += i;
				System.out.println("->" + sum2);
			} else {             //홀수
				sum1 += i;
				System.out.println("->" + sum1);
			}	
		}
		System.out.println("OK:" + sum1 + "," + sum2);
	}
}
