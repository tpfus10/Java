package com.ruby.java.ch04;

import java.util.Random;

public class Test37 {
	
	public static void main(String[] args) {
		//난수 생성하기 
		Random rnd = new Random();//Random은 난수 생성과 관련된 클래스
		int [] score = new int[20];
		int sum = 0;//변수를 선언할 때 초기화를 하고 코딩하면 값을 추적하기 좋음
		double avg = 0.0;
		int max = 0; int min = 99990;
		for(int i = 0; i < score.length; i++) {
			score[i] = rnd.nextInt(20)+1; //+1은 0을 제외하기 위함
		}
		for(int num: score)
			System.out.print(num + " ");
		for(int i = 0; i < score.length; i++) {
			if (i%4 == 0) //특정 개수씩 출력하고 줄 바꾸기
				System.out.println();
			if(score[i] < 10)
				System.out.print(" "); //자리수가 다른 숫자들을 열 맞춰 출력하는 법 ln 붙이면 안 됨
			System.out.print(score[i] + " ");
		}
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i])
				max = score[i];
			if (min > score[i])
				min = score[i];
		}
		 System.out.println("\n" + "최소: " + min);
	}
}
