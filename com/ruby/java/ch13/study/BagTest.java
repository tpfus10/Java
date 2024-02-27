package com.ruby.java.ch13.study;

class Bag {
	private Object thing;
	
	public Bag() {
	}

	public Bag(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은" + thing.getClass().getName());
	}
}

class Book {}

class PencilCase {}

class Notebook {}

public class BagTest {

	public static void main(String[] args) {
		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new Notebook());
		
		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag= bag2;//동일한 Object 타입, 다른 데이터=>오류는 안 나지만 작동은 되지 않음
	}

}
