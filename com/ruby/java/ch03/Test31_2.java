//구구단 우로 정렬
package com.ruby.java.ch03;

public class Test31_2 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			//System.out.println("\n");
		}
	}
}