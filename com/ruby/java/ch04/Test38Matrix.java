package com.ruby.java.ch04;

import java.util.Random;

public class Test38Matrix {

	public static void main(String[] args) {
		int A [][] = new int[3][4];//난수 입력
		Random rand = new Random();
		for (int i = 0; i < A.length; i++) 
			for(int j = 0; j < A[0].length; j++) 
		    A[i][j] = rand.nextInt(500);
	
		
		
		int B [][] = new int[4][5];//난수 입력
		//Random rand = new Random();
		for (int i = 0; i < B.length; i++) 
			for(int j = 0; j < B[0].length; j++) 
		    B[i][j] = rand.nextInt(500);
		
		
		
		int C [][] = new int[3][5];
		
		
		
		int D [][] = new int[3][4];//난수 입력
		//Random rand = new Random();
		for (int i = 0; i < D.length; i++) 
			for(int j = 0; j < D[0].length; j++) 
		    D[i][j] = rand.nextInt(500);
		
		
		
		int E [][] = new int[3][4];
		int F [][] = new int[4][3];
		
		
	  //C = A * B; // 행렬 곱하기
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < B.length; j++) {
				int temp = 0;
				for(int k = 0; k < B.length; k++) {
					temp += A[i][k] + B[k][j];
				}
				System.out.println(temp);
			}
		}
					
	  //E = A + D;// 행렬 더하기
		for(int i = 0; i<A.length; i++) {
			for(int j = 0; j<A[0].length; j++) {
				A[i][j] += B[i][j];
			}
			System.out.println(A);
		}
		
		
	  //F = A의 전치 행렬
		public void print(int[][] array) {
		 for(int array1[] : array)
			for(int i : array1) {
				System.out.println(i + " ");
		}
		    System.out.println("\n");
		}

	}
		

}
