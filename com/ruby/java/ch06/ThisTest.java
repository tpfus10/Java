package com.ruby.java.ch06;

public class ThisTest {
	int i = 1;//내 메서드가 포함된 class의 i
	
	public void first( ) {
		int i = 2;
		int j = 3;
		this.i = i + j;
		
		second(4);
	}
		
	public void second(int i) {//가까운 i
		int j = 5;
		this.i = i + j;//가까운 i가 아닌 내 메서드가 포함된 class의 i를 사용하고 싶을 때->세터, 게터에서 많이 사용
	}
		
	public static void main(String[] args) {
		ThisTest exam = new ThisTest();//int i는 힙에 선언된 것 나머지 int는 stack에 선언
		exam.first();
		System.out.println("Done");

	}

}
