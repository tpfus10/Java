package com.ruby.java.ch05;

import java.util.Random;

public class Test_Chap5장_행렬계산 {
	/*
	 * 행렬 덧셈, 곱셈 연산 메소드 정의
	 * 1차버젼: 덧셈후 바로 출력
	 * 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
	 */
	static void showMatrix(int [][]X) {
		for(int[] row : X) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println(" ");
		}
	}
	
	static int[][] getData(int [][]X){
		for (int i = 0; i<X.length; i++) 
			for (int j = 0; j<X[0].length; j++) {
				X[i][j] = (int)(Math.random() * 100 + 1);
			}
				return X;
	}
	
	static int[][] addMatrix(int[][]B, int[][]C){
		int r = B.length;
		int c = B[0].length;
		int m[][] = new int[r][c];
		for (int i = 0; i<r; i++) 
			for (int j = 0; j<c; j++)
				m[i][j] = B[i][j] + C[i][j];
				return m;
	}
	
	static int[][] multiplyMatrix(int[][]B, int[][]E){
		int r = B.length; //3
		int c = B[0].length; //4 
		int d = E[0].length; //5
		int m[][] = new int[r][d];
		for (int i = 0; i<r; i++) {
			for (int j = 0; j<d; j++) {
				for (int k = 0; k<c; k++) {
					m[i][j] += B[i][k]*E[k][j];
				}
			}
		}	
					return m;
	}
	
	  static int[][] transposeMatrix(int[][]B) {
		  int r = B.length;
		  int c = B[0].length;
		  int m[][] = new int[c][r];   //전치행렬 주의점!
		  for(int i = 0; i < r; i++) {
			  for(int j = 0; j< c; j++) {
				  m[j][i] = B[i][j];
			  }
		  }			
		  	return m;
	  }
	  
	 
	
public static void main(String[] args) {
		/*
		 * 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬
		 */
		Random random = new Random();
		int[][] A = new int[3][4];
		int[][] B = new int[3][4];
		int[][] C = new int[3][4];	
		int[][] D = new int[3][5];
		int[][] E = new int[4][5];
		int[][] F = new int[4][3];
		
		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		getData(B);getData(C);getData(E);
		A = addMatrix(B, C);
		showMatrix(A); System.out.println();
		//showMatrix(B);showMatrix(C);showMatrix(A);
		//System.out.println(A);
		
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		getData(B);getData(D);getData(E);
		D = multiplyMatrix(B,E);
		showMatrix(D); System.out.println();
		//showMatrix(B);showMatrix(E);showMatrix(D);
		
		
		 System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬"); 
	     getData(B);
	     F = transposeMatrix(B); 
	     showMatrix(F);
		 //showMatrix(B);showMatrix(F);
		 

	}

}