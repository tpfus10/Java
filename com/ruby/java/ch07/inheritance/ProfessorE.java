package com.ruby.java.ch07.inheritance;

public class ProfessorE extends Person {	
	private String subject;

//	public String getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
	

	//1) ProfessorE class 의 name 필드에 name, age 필드에 age를 저장
	//2) ProfessorE class 의 subject 필드에 subject를 저장
	//3) "Professor 생성자"를 프린트
	public ProfessorE(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Peofessor 생성자");
		}
	//4) 앞에서 저장한 값들을 출력(LMSTest에서 Person을 거쳐 ProfessorE를 통해 저장된 값들)
	public String toString() {
		return super.toString() + ":" + subject;
	}
}
