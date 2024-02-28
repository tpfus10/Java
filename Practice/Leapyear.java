package Practice;

import java.util.Scanner;

public class Leapyear {
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	String result = " ";
	
	if (year % 4 != 0) {
		result = "평년";
	} else if (year % 100 != 0) {
		result = "윤년";
	} else if (year % 400 == 0) {
		result = "윤년";
	} else {
		result = "평년";
	}
	System.out.println(result);
	}
}



