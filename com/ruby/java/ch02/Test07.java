package com.ruby.java.ch02;

public class Test07 {
	public static void main(String[] args) {
		boolean isOn = false;
		while(!isOn) {   //많이 사용하는 형태
			//반복 실행
		}
		short e = 10;
		int f = -e;
		int a = 10;
		int b = 1,c = 0;//여러 개 한 번에 초기화 가능
		c = -b;
		b = ++a;//a값을 1만큼 증가시키고 a에 그 값을 저장(13번줄과 이어짐)
		c = a++;
		System.out.println("b=" + b + ", c=" +c);
		System.out.println("a=" + a);//왜 12가 나오지? b와 c를 거치면서 a값이 변화함
		boolean result = (b == c);
		System.out.println("result = " + result);

	}

}
