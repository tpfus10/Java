package com.ruby.java.ch02;

public class Test15 {
	public static void main(String[] args) {
		char c = 'F';
		String gender;
		if ( c == 'F')
			gender = "여자";
		else
			gender = "남자";
		//String gender = (c == 'F') ? "여자" ; "남자"; 
		//if else문을 삼항문으로 나타낼 수 있음
		System.out.println(gender);
		
	}

}
