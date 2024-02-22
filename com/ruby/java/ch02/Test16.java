package com.ruby.java.ch02;

public class Test16 {
	public static void main(String[] args) {
	byte a = 23;
	int b = a;
	//a = b;
	//a = (byte)b;//explicit casting
	byte i = 10;
	byte j = 20;
	byte K = (byte)(i + j);//연산자를 이용해 연산을 할 때는 int 타입으로 변환되어 연산을 수행함
	}

}
