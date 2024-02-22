package com.ruby.java.ch05;

class Armor {

	private String name = "홍길동";
	private int height;
	int weight;
	String color = "red";
		
	private void takeOff() {
		System.out.println("Take Off");
	}
	private void land() {
		System.out.println("Land");
	}
	void shootLaser() {
		System.out.println("Shoot Laser");
	}
	    
	}

public class ArmorTest {
	public static void main (String[] args) {
		Armor1 armor = new Armor1();
		
		//mor.name="홍이동";
	}
}