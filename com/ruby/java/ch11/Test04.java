package com.ruby.java.ch11;

import java.io.FileInputStream;
//import java.io.*;//가급적 쓰지 말기(io의 클래스를  모두 import하겠다는 의미)

public class Test04 {

	public static void test() throws Exception { //얘와->웬만하면 Exception으로 함
		FileInputStream fi = new FileInputStream("a1.txt");
		int c = fi.read();
		System.out.println((char) c);
	}

	public static void main(String[] args) { // 여기에서도 throws 쓸 수 있음
		System.out.println("Start");
		try {
			test();
		} catch (Exception e) { //얘는 같아야 함, 쟤랑 상관 없이 Exception을 써도 됨
			e.printStackTrace();
		}
		System.out.println("End");// throws 쓰면 안 뜸
	}
}
