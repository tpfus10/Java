package com.ruby.java.ch13;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {
	
	public static void main(String[] args) {
		Integer[] inum = {1, 2, 3, 4, 5};
		Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		//String[] snum = {"1", "2", "3", "4", "5"};
		
		List<Integer> iList = Arrays.asList(inum);//static 메소드
		List<Double> dList = Arrays.asList(dnum);
		//List<String> sList = Arrays.asList(snum);
		
		double isum = sum(iList);
		double dsum = sum(dList);
		//sum(sList);는 오류 발생함 List가 Number를 상속하기 때문(String은 Number를 상속하지 않음)
		
		
		System.out.println("inum의 합계" + isum);
		System.out.println("dnum의 합계" + dsum);
}
	
	public static double sum(List<?extends Number> list) { 
		double total = 0;
		for (Number v : list) {
			total += v.doubleValue();
		}
		return total;
	}
}
