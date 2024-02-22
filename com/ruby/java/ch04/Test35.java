package com.ruby.java.ch04;
public class Test35 {
	public static void main(String[] args) {
		String[] st = {"apple", "banana", "peach", "pineapple"};
		
		int[] arr = {1, 2, 3, 4, 5};
		for (int i = 0; i <3; i++)
			System.out.println(arr[i]);
		
		for(String stx: st) 
			System.out.println(stx); //간결한 코딩-배열 원소 전부 출력 + 인덱스 사용이 필요하지 않을 때
		
		
		for (int num: arr) //:는 배열의 값을 하나씩 가르킨다는 의미임
			System.out.println(num);
	
	}

}

