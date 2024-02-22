package com.ruby.java.ch03;

public class Test31_1해설 {

	public static void main(String[] args) {
		
		//숫자 하나 입력 받자.
		int num = 109;
		
		//소수: 1과 자기 자신을 제외하고 나누어지지 않는 수
		//2부터 자기자신보다 하나 작은 수까지 나누어서 나누어지지 않으면 소수
		//num : 10 ==> 2~9
		boolean flag = false;
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
			System.out.println(flag? "소수가 아닙니다." : "소수입니다.");
			//sc.close();//값을 입력받았을 때는 코드가 꼬일 수 있으므로 써주는 게 좋음
		}
	}

}

//주석 달기> 코드로 구현하기

//int i = 2;
//for(int i = 2 ; i < num ; i++) {
//		if(num % i == 0);
//		break;
//System.out.println((i<num)?"소수가 아닙니다." : "소수입니다.");