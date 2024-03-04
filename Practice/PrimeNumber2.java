package Practice;

import java.util.Scanner;

//class Check {
//	
//	public Check(int[] pnum) {
//		// 에라토스테네스의 체 알고리즘 사용
//		for (int i = 0; i < pnum.length; i++) {
//			for (int j = 2; j < pnum.length; j++) {//j는 k가 pnum.length 범위 내의 모든 숫자의 배수 값을 가질 수 있도록 해줌
//				for (int k = j*j; k <= pnum[pnum.length-1]; k += j) { //k의 범위는 pnum.length가 아니라 pnum 배열의 마지막 값이어야 함
//																	//k값은 j가 아니라 j의 제곱값부터 시작해야 함
//					if (pnum[i] == k || pnum[i] == 1) { //2부터 pnum.length 범위 내의 숫자에 대해 배수를 가지는 값을 제거
//						pnum[i] = 0;
//						break;
//					}
//				}
//			}
//		}
//		
//		// 소수 출력
//		for (int i = 0; i < pnum.length; i++) {
//			if (pnum[i] != 0) {
//				System.out.println(pnum[i]);
//			}
//
//		}
//	}
//}

public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //자릿수 입력받기
		int s 	= (int)Math.pow(10.0, (double)(num-1)); //자릿수의 시작 숫자
		int e  = (int)Math.pow(10.0, (double)(num))-1; //자릿수의 끝 숫자
//		int[] pnum = new int[e - s + 1];
//		
//		// 배열을 생성하고 s부터 e까지 값을 순서대로 입력하기
//		for (int i = 0; i < pnum.length; i++) {
//			pnum[i] = s + i;
//		}
//		
//		Check check = new Check(pnum);
		
		for (int i = s ; i <= e ; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	private static boolean isPrime(int num) {
		// 소수 판별 방법: 1부터 해당 수의 제곱근까지 나누어 떨어지는 수가 없는지 확인
		for (int j = 2; j <= Math.sqrt(num); j++) { // i는 2부터 시작, Math.sqrt(num) 추가
			if (num % j == 0 || num == 1) {
				return false; // 한 번이라도 true 값이 나오면 소수가 되므로 if문을 빠져나오면 됨
			}
		}
		return true;
	}
	
}
