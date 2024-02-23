package com.ruby.java.ch11;

public class Test02 {

	public static void main(String[] args) {
		test1();
		System.out.println("-".repeat(30));
		test2();
	}

	private static void test1() {
		try {
			System.out.println("1");
			String s = null;
			s.length();
			System.out.println("2");
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("오류 발생");
		} finally {
			System.out.println("OK");
		}
		System.out.println("4");
	}

	private static void test2() {
		try { 
			System.out.println("1");
			String s = null;
			s.length();
			System.out.println("2");
			System.out.println("3");
		} catch (Exception e) {
			System.out.println("오류 발생");
			return;	//finally 먼저 실행 후 return 실행
		} finally {
			System.out.println("OK");
		}
		System.out.println("4");
	}
}
