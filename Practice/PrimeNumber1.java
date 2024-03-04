package Practice;

import java.util.Scanner;

public class PrimeNumber1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String result = "";
//		
//		//2와 3은 특별한 경우이기 때문에 따로 확인함
//		if (num == 2 || num == 3) 
//			System.out.println("소수입니다.");
//			
//		// 소수 판별 방법: 1부터 해당 수의 제곱근까지 나누어 떨어지는 수가 없는지 확인
//		for (int i = 2; i <= Math.sqrt(num); i++) { // i는 2부터 시작, Math.sqrt(num) 추가
//			if (num % i == 0) {
//				result = "소수가 아닙니다.";
//				break; // 한 번이라도 true 값이 나오면 소수가 되므로 if문을 빠져나오면 됨
//			} else {
//			result = "소수입니다.";
//			}
//		}
//		System.out.println(result);
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");	
		}
	}

	private static boolean isPrime(int num) {
		// 소수 판별 방법: 1부터 해당 수의 제곱근까지 나누어 떨어지는 수가 없는지 확인
		for (int i = 2; i <= Math.sqrt(num); i++) { // i는 2부터 시작, Math.sqrt(num) 추가
			if (num % i == 0) {
				return false; 
			}
		}
		return true;
	}
}
