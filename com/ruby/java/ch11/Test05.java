package com.ruby.java.ch11;
//1->2->3->4 순서로 예외처리 됨

public class Test05 {
	int battery = 0;
	
	public void charge(int time) throws Exception {//2
		
		if(time<0) {
			time = 0;
				throw new NagativeNumberException();//1
		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);
	}
	
	public static void main(String[] args) {
		
		Test05 test = new Test05();
		try {//3
			test.charge(30);
			test.charge(20);
			test.charge(-10);
		} catch (Exception e) {//4
			System.out.println(e.getMessage());
		}
	}
}
