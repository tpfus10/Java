package com.ruby.java.ch14;

interface MyInterface {
	public void print();
}

//인터페이스 구현 방법1: implements 키워드로 클래스 선언
class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	public static void test(MyInterface mi) { //인터페이스 타입으로 매개변수 선언
		mi.print(); //인터페이스를 구현한 클래스의 참조변수 또는 익명 클래스의 참조 변수를 인자로 전달할 수 있음
	}
	
	public static MyInterface test2() { //인터페이스 타입으로 반환값이 선언된 메서드
		MyInterface mi = new MyInterface() { //익명 클래스 선언
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		return mi; 
	}
	
	public static void main(String[] args) {
		
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print();
		mc2.print();

//인터페이스 구현 방법2: 익명 클래스 사용
		MyInterface mi = new MyInterface() {//인터페이스는 익명 클래스를 만들 수 있음(자바 버전업):클래스명 없이 인터페이스명을 써서 익명 클래스
			@Override
			public void print() { //클래스 선언 없이 메소드를 구현
				System.out.println("익명 클래스로 구현");
			}
		};
		test(mc1);
		test(mc2);
		
		mi.print(); //인터페이스를 반환하는 메서드를 호출
		
//인터페이스 구현 방법3: 람다식
		(/*MyInterface ml = */new MyInterface() { //매개변수 ml을 한 번만 선언하고 다시 사용하지 않을 때 활용
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한 번에 처리");
			}
		}).print();
		
		MyInterface mi2 = test2();
		mi2.print();
		}
}
