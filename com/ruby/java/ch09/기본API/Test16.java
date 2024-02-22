package com.ruby.java.ch09.기본API;

import java.util.Arrays;

public class Test16 {

	public static void main(String[] args) {
		int score[] = { 85, 90, 95, 100, 75 }; //score를 출력하면 주소가 나옴->Arrays.toString으로 하면 배열이 나옴
		int score2[] = Arrays.copyOf(score, score.length);
		int score3[] = Arrays.copyOfRange(score, 3, 5);//3에서 5까지 복사

		int score4[] = new int[score.length];
		System.arraycopy(score, 0, score4, 0, score.length);

		System.out.println(Arrays.toString(score));//배열을 String으로 출력->[,]를 자동으로 넣어줌
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score3));
		System.out.println(Arrays.toString(score4));

		System.out.println(Arrays.equals(score, score2));

		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.equals(score, score2));

		int index = Arrays.binarySearch(score, 100); //배열에서 매개변수의 값을 검색하고 인덱스를 반환
		System.out.println(index);
	}
}