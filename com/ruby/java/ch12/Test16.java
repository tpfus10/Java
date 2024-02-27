package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test16 {

	public static void main(String[] args) {
		
		try(ObjectInputStream in =
				new ObjectInputStream(new FileInputStream("user.txt"))) {
			UserBean user = (UserBean) in.readObject(); //(UserBean) 부분은 캐스팅 연산자 
			System.out.println(user);                   //in.readObject() 메서드에서 반환된 객체를 UserBean 클래스의 인스턴스로 변환하는 역할
			
		} catch(Exception e) {
			e.printStackTrace();
			}
	}

}
