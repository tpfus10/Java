package com.ruby.java.ch04;
public class Test32 {
	public static void main(String[] args) {
		/*int[] score;
		score = new int[] {1, 2, 3, 4, 6, 7, 8};
		int num = score.length;
		String str = "nice day";
		int snum = str.length();
		System.out.println("num = " + num);
		System.out.println(str.length());
		
		System.out.println();*/
		
		int[]arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr.length+"\n");
		for (int i = 0; i < arr.length; i++) {//"<="을 넣으면 arr[5]까지 출력하라는 명령이 됨
			System.out.println(arr[i]);
		}
		
		/*int anum = arr.length;
		System.out.println(anum);*/
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
	}
}
