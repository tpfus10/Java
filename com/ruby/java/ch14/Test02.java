package com.ruby.java.ch14;

@FunctionalInterface
interface Mutifly {
	double getValue();
}

public class Test02 {

	public static void main(String[] args) {
		
		
	Mutifly m;
	m = () -> 3.14*2;
	System.out.println(m.getValue());
	
	m = () -> 10*3;
	System.out.println(m.getValue());
	
	}
}
