package com.ruby.java.ch04;
public class Test36 {
	public static void main(String[] args) {
		char letter = 'A';
		int num = 'A';
		System.out.println("num = " + num);
		char[] alphabet = new char[26];
		for (int i = 0; i<alphabet.length; i++) {
			alphabet[i] = (char)(letter + i);//char는 타입 캐스팅을 해줘야 함, ㅣetter은 암묵적 캐스팅이 된 상태
		}                                    //(char)((int)letter + i)로 letter도 명시적 캐스팅을 해줘도 됨
		for (char c: alphabet) {
			System.out.println(c);
		}
	}
}
