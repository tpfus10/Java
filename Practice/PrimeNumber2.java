package Practice;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //자릿수 입력받기
		int s 	= (int)Math.pow(10.0, (double)(num-1)); //자릿수의 시작 숫자
		int e  = (int)Math.pow(10.0, (double)(num))-1; //자릿수의 끝 숫자
		
		int[] pnum = new int[e-s+1];
		for (int i = 0; i <pnum.length; i++) {
			pnum[i] = s+i;
			for(int k = 2; k < (int)Math.sqrt(pnum[i]); k++) { 
				if(pnum[i]%k != 0) {
					System.out.println(pnum[i]);
				}
			} 
		}
	}
}

