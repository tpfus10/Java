package com.ruby.java.ch05;

import java.util.Scanner;

public class practice1_A {
	static int getNumber(Scanner sc) {
		int num;
		do {
			System.out.println("10~100 사이 정수[마치려면 0]: ");
			num = sc.nextInt();
		} while (num != 0 && (num < 10 || 100 <num));
		return num;
	}	
	public static int clac(int a, int b, int c) {
		Scanner sc = new Scanner(System.in);
		while(true) { 
			int num = getNumber(sc);
			if(num == 0) break;
			System.out.println("입력값 : " + num);
			int cnt = 0;
		//	for (int 1 = 1; i < 11 ; i++)
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
