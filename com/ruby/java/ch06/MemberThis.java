package com.ruby.java.ch06;

public class MemberThis {
	private String name;
	private int age;
	
	public MemberThis() {
		this("guest");
	}
	
	public MemberThis(String name) {
		this(name, 0);
	}
	
	public MemberThis(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age; //return [name=" + name + ", age=" + age +"];
	}
	
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy", 23);
		
		System.out.println(m1.toString()); 
		System.out.println(m2.toString()); 
		System.out.println(m3.toString()); 
	}

}
