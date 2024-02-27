package com.ruby.java.ch12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test15 {

	public static void main(String[] args) {

		UserBean user = new UserBean("purum", "OhJungEam", "010-123-4567", "Seoul");

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"))) {
			out.writeObject(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
