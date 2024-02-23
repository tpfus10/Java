package com.ruby.java.ch11;

public class NagativeNumberException extends Exception {
		public static final long serialVersionUID = 1L;
		
		public NagativeNumberException() {
			super("음수는 허용하지 않습니다.");//message를 넣어주면 throw new NagativeNumberException()부분에 바로 입력해줄 수 있음
	}
}
