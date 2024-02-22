package com.ruby.java.ch08.innerClass;

interface Messenger {
	String getMessage();
	void setMessage();

}

class GalaxyMessenger implements Messenger {//이게 생략되고 인터페이스의
	public String getMessage() {
		return "test";
	}
	public void setMessage(String msg) {
		System.out.println("메시지 = : + msg");
	}

public class Messenger {
	public static void main(String[] args) {
		Messenger test = new Messenger();
		Messenger test = new Messenger() {//추상 메소드를 구현한 클래스->클래스 이름 생략=익명 클래스(자바 컴파일러가 알아서 만들어줌)
			public String getMessage() {
				return "test";
			}
			public void setMessage(String msg) {
				System.out.println("메시지 = : + msg");
			}
		};//왜 여기에 세미 콜론을 넣어야 하는가?
	}
}
}
