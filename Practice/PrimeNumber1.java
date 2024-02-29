package Practice;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = "";

		// 소수 판별 방법: 1부터 해당 수의 제곱근까지 나누어 떨어지는 수가 없는지 확인
		for (int i = 2; i < (int) Math.sqrt(num); i++) { // i는 2부터 시작, Math.sqrt(num) 추가
			if (num % i == 0) {
				result = "소수가 아닙니다.";
			} else {
				result = "소수입니다.";
			}
		}
		System.out.println(result);
	}
}
