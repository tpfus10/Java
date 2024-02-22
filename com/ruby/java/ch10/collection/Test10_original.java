package com.ruby.java.ch10.collection;

import java.util.ArrayList;//빨간 줄 생겼을 때 import 선택해주면 됨 
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10_original {
	public static void main(String[] args) {
		lotto_generator(5);
	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<Integer> lotto = null;
		for (int i = 0; i < n; i++) {
			lotto = new HashSet<Integer>();//생성자
			for (int j = 0; lotto.size() < 6; j++) {//0~6->7개
				lotto.add(1+number.nextInt(45));//45이하
//				System.out.println("lotto_size = " + lotto.size());
			}
			List<Integer> L = new ArrayList<Integer>(lotto);
//			Collections.sort(L);
			;
			System.out.println(L);
		}
	}
}
