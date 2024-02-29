package com.ruby.java.ch14;

interface Calculator {
	int func();
}

public class Test09 {
	static int num1 = 10;// 필드로서 힙 영역에 생성됨
	int num2 = 20;
	
	public static void main(String[] args) {
		Test09 test = new Test09();
		int num3 = 30;//람다식이 구현된 메서드의 지역변수는 마치 final이 선언된 변수처럼 사용됨(수정이 안 됨)
		
		Calculator calc = () -> {
			int num4 = 40; //람다식의 지역변수
			Test09.num1++;//클래스 변수 증가
			test.num2++;//인스턴스 변수 증가
			//num3++; //main 메소드 안에 선언했으므로 지역변수임
			num4++;
			return num4;
		};
	}
}
