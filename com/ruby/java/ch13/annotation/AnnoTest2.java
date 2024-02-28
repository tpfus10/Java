package com.ruby.java.ch13.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Mapping {
	String mode();
	int value();
}

@Target(ElementType.METHOD)//메소드로만 어노테이션의 범위를 제한함
@Retention(RetentionPolicy.RUNTIME)
@interface Comment {
	String msg();
}

@Mapping(mode = "class", value = 100)
//@Comment(msg = "Annotation2 클래스")
public class AnnoTest2 { //19,20이 21 class에 적용되는 것(줄 띄우지 않기)
	@Mapping(mode = "method", value = 200)
	@Comment(msg = "test() 메서드")
	public static void test() { //22,23이 24 메소드에 적용되는 것(줄 띄우지 않기)
		AnnoTest2 obj = new AnnoTest2();
		try {
			Class<?> c = obj.getClass();
			Annotation[] annoList = c.getAnnotations();
			System.out.println("클래스의 annotation 목록");
			for(Annotation item : annoList)
				System.out.println(item);
			
			Method m = c.getMethod("test");
			annoList = m.getAnnotations();
			System.out.println();
			System.out.println("test()메서드의 annotation 목록");
			for(Annotation item : annoList)
				System.out.println(item);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		test();
	}
}
