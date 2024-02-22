//17번줄 오류
package com.ruby.java.ch04;

import java.util.Random;

public class Test38 {
	public static void main(String[] args) {
		int arr[][] = new int [5][5];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) 
			for(int j = 0; j < arr[0].length; j++)
				arr[i][j] = rand.nextInt(500);
		
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[0].length;j++) {
				 if (i > j)
					System.out.print(arr[i][j]);
				System.out.print("\t");
				}
			}
			System.out.println();
			
	}

}

/*arr[0][0] = 1;
		arr[0][1] = 2;
		
		System.out.print(arr);
	
		System.out.println("행수:" + arr.length);
		System.out.println("열의 수:" + arr[0].length);
		
		int arr2[][] = {{1,2},{3,4,7,8},{5,6}};//ragged array-주의가 필요(자주 쓰지는 않음)*/