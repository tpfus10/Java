package com.ruby.java.ch11;

public class Test01 {

	public static void main(String[] args) {
		test1();
		System.out.println("GOOD");
	}

	private static void test1() {
		System.out.println("test1 start");
		test2();
		System.out.println("test1 end");
	}

	private static void test2() {
		System.out.println("test2 start");
		try {
			int temp = 10/0;
			
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length(); 
			
			int arr[] = new int[3];
			arr[3] = 30; // JVM이 ArrayIndexOutOfBoundException() 발생시킴->예외 객체 생성(어떤 오류가 발생했는지 메시지 저장)
			System.out.println("OK");
			
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		} catch (NullPointerException e2) {
			e2.printStackTrace();
		} catch(Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		System.out.println("test2 end");
	}
}
