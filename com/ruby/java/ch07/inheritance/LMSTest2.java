package com.ruby.java.ch07.inheritance;

public class LMSTest2 extends Person {
	public static void main(String[] args) {
		//1)ProfessorE의 객체를 생성하고 주솟값을 p에 저장
		//2)동시에 매개변수와 함께 ProfessorE의 생성자를 호출 
		//3)Person의 1~2
		//4)ProfeesorE의 1~4
		ProfessorE p = new ProfessorE("홍길동", 30, "수학");
		
//		p.setName("김푸름");
//		p.setAge(52);
//		p.setSubject("빅데이터");
		
		//5) ProfessorE의 4번을 출력
		System.out.println(p.toString());
	}
}
