package com.ruby.java.ch13.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) //Check 클래스의 값을 유지하기 위해 RUNTIME 사용
@interface Check {
	String name();
	int val();
}

public class AnnoTest {

	@Check(name = "first", val = 123)
	public static void test() {
		AnnoTest obj = new AnnoTest();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("test");

			Check check = m.getAnnotation(Check.class);
			System.out.println(check.name() + " : " + check.val());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		test();
	}
}
