package com.ruby.java.ch13;

class Bag<T> {
	private T thing;
	
	public Bag() {
	}

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
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
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		bag.showType();
		bag2.showType();
		bag3.showType();
		
		//bag = bag2;=>타입이 다르기 때문에 오류가 발생함(BagTest2와 비교)
	}

//		Bag<Book> bag = new Bag<>(); //Bag class에 기본 생성자가 없으면 오류가 발생함
//		bag.setThing(new Book());
//		bag.showType();

}
