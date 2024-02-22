package com.ruby.java.ch03;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		
        //시스템 입력 장치 선언
		Scanner sc = new Scanner(System.in); 
        //입력 메시지 출력	
		System.out.println("점수:");
		//시스템 입력 장치로부터 정수값 입력
		int score = sc.nextInt();
		
		//int score = 90;
		String result = "";
		
		if(score >= 60) {
			result = "당신의 점수는" + score + "점이기 때문에 합격입니다.";
			
		} else {
			result = "당신의 점수는" + score + "점이기 때문에 불합격입니다.";}
		System.out.println(result);
	}
	
}
		/*if(score >= 60) {
			result = "합격";
			
		} else {
			result = "불합격";
			System.out.println("당신의 점수는" + score + "점이기 때문에" + result + "입니다.");	
		*/
		
