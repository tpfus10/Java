package Practice;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //자릿수 입력받기
		int s 	= (int)Math.pow(10.0, (double)(num-1)); //자릿수의 시작 숫자
		int e  = (int)Math.pow(10.0, (double)(num))-1; //자릿수의 끝 숫자

		for (int i = s ; i <= e ; i++) {
			String strNum = Integer.toString(i);
			boolean flag = true;
			
			while(true) {
				for(int k=10; k<Math.pow(10, strNum.length()); k*=10) { //소수인 경우에는 flag가 true로 유지됨
					int i_s = ((i-i%k)/k);
					if (isPrime(i_s)) {
					} else { 
					flag = false;
					break;
				}	
			}
				if (flag) {
					System.out.println(i);
			}
		}
	}
}
	
	private static boolean isPrime(int num) {
		// 소수 판별 방법: 1부터 해당 수의 제곱근까지 나누어 떨어지는 수가 없는지 확인
		for (int i = 2; i <= Math.sqrt(num); i++) { // i는 2부터 시작, Math.sqrt(num) 추가
			if (num % i == 0) {
				return false; // 한 번이라도 true 값이 나오면 소수가 되므로 if문을 빠져나오면 됨
			}
		}
		return true;
	}
}
