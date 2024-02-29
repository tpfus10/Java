package com.ruby.java.ch14;

import java.util.Arrays;

interface StringFunc2 {
	String[] modify(String s) throws EmptyStringException;
}

class EmptyStringException extends Exception {
	EmptyStringException() {
		super("빈 문자열");
	}
}

public class Test08 {
	public static void main(String[] args) { //throws EmptyStringException을 넣으면 해당 클래스에서 외부 처리가 됨
		
		String str = "Korea, Australia, China, Germany, Span, Turkey";
		
		StringFunc2 sf = (s) -> {
			if(s.length() == 0)
				throw new EmptyStringException();
			return s.split(",");
		};
		
		String result[];
		try { //try-catch문은 예외를 내부에서 처리하는 방법임
			result = sf.modify(str);
			System.out.println(Arrays.toString(result));
		} catch (EmptyStringException e) {
					}
		
		String str2 = "";
		String result2[];
		
		try {
			result2 = sf.modify(str2);
			System.out.println(Arrays.toString(result2));
		} catch (EmptyStringException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End"); //외부 처리를 하면 중간에 프로그램이 중단되어 이 부분이 출력되지 않음
	}

}
