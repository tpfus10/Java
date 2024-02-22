package com.ruby.java.ch07.inheritance;

public class Person {
	private String name;
	private int age;

	public Person() {	
	}
	
	//1) Person Class의 필드 name에 name을, age 필드에 age를 저장
	//2) "Person 생성자"를 프린트
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person 생성자");
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	//3)"name + ":" + age;"을 출력(ProfessorE에서 오버라이딩해서 실행은 안 됨)
	public String toString() {
		return  name + ":" + age;
	}
	

}
