package com.ruby.java.ch14;

import java.util.function.Function;

public class Test14 {
	public static void main(String[] args) {
		Function<String, Integer> func = (s) -> {//인터페이스
			int cnt = 0;
			String[] word = s.split(" ");
			cnt = word.length;
			return cnt;
		};
		
		int wordCnt = func.apply("고개를 들어 별들을 보라 당신 발만 내다 보지말고");//메서드
		System.out.println("단어 수 : " + wordCnt);
	}
}
