package com.ruby.java.ch14;

interface Myfunc<T> {
	T modify (T t); //제네릭 T타입의 변수 t->str, n이 t인 것
}

public class Test06 {
	public static void main(String[] args) {
		
		Myfunc<String> mf1 = (str) -> str.toUpperCase() + ":" +str.length();
		System.out.println(mf1.modify("Java"));
		System.out.println(mf1.modify("Java programming"));
		
		Myfunc<Integer> mf2 = (n) -> n*2;
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
 	}

}
