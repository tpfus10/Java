package com.ruby.java.ch08.innerClass;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
		OuterClass.InstanceClass inner02 = outer.new InstanceClass();
		inner01.a = 123;
		inner01.method2();
	}

}
