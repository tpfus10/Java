package com.ruby.java.ch06;


class Count {                 
	public static int totalCount;
	int count; //default로 선언된 상태, 해당 패키지 내에서만 사용 가능
}

public class CountTest {
	public static void main(String[] args) {
		System.out.println("실행 시작");
	    Count c1 = new Count();
	    Count c2 = new Count();
	    Count c3 = new Count();
	    
	    c1.count++;//객체 c1의 count 변수를 1만큼 증가(인스턴스 필드)
	    Count.totalCount++;//클래스 변수 totalCount를 변경(클래스 필드)
	    c2.count++;
	    Count.totalCount++;
	    c3.count++;
	    Count.totalCount++;
	    
	    System.out.println(Count.totalCount + " : " + c1.count);
	    System.out.println(Count.totalCount + " : " + c2.count);
	    System.out.println(Count.totalCount + " : " + c3.count);
	   
	}
}



