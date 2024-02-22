package com.ruby.java.ch06;

public class StaticMethodTest {
	static int num = 123; //인스턴스 필드->선언 필요 static 선언해주면 다른 메서드에서 사용 가능
	public static void main(String[] args) {
		StaticMethodTest.print1(); //static에서 static을 호출할 때는 class명을 쓰지 않고 print1만 해줘도 됨
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}
	//main에 static이 붙는 이유
	//시작을 하는데 객체를 만들 수 없기 때문에 객체 생성 없이 바로 실행될 수 있도록 하기 위해
	public static void print1() {
		int num2 = num;
		System.out.println("Hello");
	}
	
	public void print2() {
		int num3 = num;
		System.out.println("java");
	}
}
