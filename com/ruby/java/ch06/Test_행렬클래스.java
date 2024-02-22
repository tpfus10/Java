package com.ruby.java.ch06;

/*

 * 클래스 메소드 구현 실습 목적

 * 2차원을 1차원으로 바꾸기

 */

import java.util.Random;
	class Matrix {
		int rows;
		int cols;
		int[] data;

	
		public Matrix(int rows, int cols) {
			this.rows = rows; this.cols = cols;
			data = new int[rows*cols];
		}

		
		void getData() {
			Random random = new Random();
			for (int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					this.data[i*cols + j] = (int)(Math.random() * 100 + 1);
		}
	}
}
		
		Matrix addMatrix(Matrix X) {
		Matrix A = new Matrix(this.rows, this.cols);
		for (int i = 0; i<this.rows; i++)  {
			for (int j = 0; j<this.cols; j++) {
				A.data[i*this.cols + j] = this.data[i*this.cols + j] + X.data[i*this.cols + j];
			}
		}
			return A;
}

		Matrix multiplyMatrix(Matrix E) {
			Matrix D = new Matrix(this.rows, E.cols);
			for(int i = 0; i<this.rows; i++)
				for(int j =0; j<E.cols; j++) 
					for(int k =0; k<E.rows; k++) {
						D.data[i*D.cols + j] += this.data[i*this.cols + k] * E.data[k*this.rows + j];
					}
			
			return D;	
	}

		Matrix transposeMatrix() {
		Matrix F = new Matrix(this.cols, this.rows);
		int length = this.rows*this.cols;
		for (int i = 0; i<length; i++) {
			F.data[length-1-i] = this.data[i];
		}
			return F;
	}

	void showMatrix(String str) { 
		System.out.println(str);
		for (int i = 0; i<this.rows; i++) {
			for(int j = 0; j <this.cols; j++) {
				System.out.print(this.data[i*this.cols + j]);
				System.out.print("\t");
				}
			System.out.println();
		}
	}
}



public class Test_행렬클래스 {
	public static void main(String[] args) {
		Matrix B = new Matrix(3,4);
		Matrix C = new Matrix(3,4);
		Matrix A = new Matrix(3,4);
		Matrix D = new Matrix(3,5);
		Matrix F = new Matrix(4,3);
		Matrix E = new Matrix(4,5);

		System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
		B.getData();C.getData();
		A = B.addMatrix(C);
		B.showMatrix("B[3][4]");C.showMatrix("C[3][4]");A.showMatrix("A[3][4]");
		
		System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
		E.getData();
		D = B.multiplyMatrix(E);
		B.showMatrix("B[3][4]");E.showMatrix("E[4][5]");D.showMatrix("D[3][5]");

		System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
		F = B.transposeMatrix();
		B.showMatrix("B[3][4]"); F.showMatrix("F[4][3]");
	}
}