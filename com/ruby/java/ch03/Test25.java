package com.ruby.java.ch03;

import java.util.Scanner;

public class Test25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a:");
	    int a = sc.nextInt();
		
		int sum = 0; //sum을 for문에 사용하기 전에 선언하고 초기화해줘야 함
		for(int i = 0; i < a; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("OK:" + sum);
	}

}

/*for(int i = 0; i < 10; i++) {
System.out.println(i);
}
System.out.println("OK");*/