package com.ruby.java.ch03;

import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		//시스템 입력 장치 선언
		Scanner sc = new Scanner(System.in); 
		//입력 메시지 출력	
	    System.out.println("점수:");
	    //시스템 입력 장치로부터 정수값 입력
	    int score = sc.nextInt();
	    
	   //int score = 90;
		char grade;
		
		if(score>=90) {
			grade = 'A';
		} else if(score>=80) {
			grade = 'B';
		} else if(score>=70) {
			grade = 'c';
		} else if(score>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}
}