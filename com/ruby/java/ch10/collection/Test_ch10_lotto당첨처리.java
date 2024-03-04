package com.ruby.java.ch10.collection;
/*
 * 로또 당첨 규칙:
 * 꽝: 번호 2개, 1개
 * 5등: 번호 3개 - 5000원
 * 4등: 번호 4개 - 5만원
 * 3등: 번호 5개 - 150만원 - 판매금액에 변동(판매금액의 12.5%)
 * 2등: 3등번호 + 보너스번호 - 3000만원 - 판매 금액에 변동, 당첨 확률: 1,300,000분의1
 * 1등: 6개 숫자 - 당첨 확률 8,000,000 분의 1, 10억 ~ 30억
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//hashset(중복이 없음)을 arraylist로 변환하여 정렬하기 구현
class ListComparator implements Comparator<List<Integer>> {
	@Override
	public int compare(List<Integer> l1, List<Integer> l2) {
 		Iterator<Integer> ait = l1.iterator();
		Iterator<Integer> bit = l2.iterator();
		while (ait.hasNext()) {
			int anum = ait.next();
			int bnum = bit.next();
			if (anum > bnum)
				return 1;
			else if (anum < bnum)
				return -1;

		}
		return 0;
	}
}

public class Test_ch10_lotto당첨처리 {

	public static void main(String[] args) {

		lotto_generator(5);

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		ArrayList<HashSet<Integer>> lotset = new ArrayList<>();
		HashSet<Integer> lotto = null;// 복권 1장
		List<Integer> al = new ArrayList<>();
		
		ArrayList<HashSet<Integer>> newSet = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			lotto = new HashSet<>();
			for (int j = 0; lotto.size() < 6; j++) {
				int num = number.nextInt(45) + 1;
				while (lotto.contains(num)) {
					num = number.nextInt(45) + 1;
				}
				lotto.add(num);
			}
			// 보너스 번호 생성
			int bonusNum = number.nextInt(45) + 1;
			while (lotto.contains(bonusNum)) {
				bonusNum = number.nextInt(45) + 1;
			}

			// hashset과 arraylist
			lotset.add(lotto); // 복권명부에 발행 복권을 추가
			al.add(bonusNum); // 보너스 번호 목록에 추가
			
			//6개 번호와 보너스 번호를 함께 포함하는 
			lotto.add(bonusNum);
			newSet.add(lotto);
		}

		System.out.println("\nlot hashset을 출력\n");
		for (HashSet<Integer> eachLotto : lotset) {
			System.out.println(eachLotto);
		}
		

		System.out.println("\n복권 정렬전::lot = " + al);
		for (HashSet<Integer> eachnewSet : newSet) {
			System.out.println(eachnewSet);
		}
		
		System.out.println("복권 정렬후::lot = " + al);
		//hashset을 arraylist로 변환
		List<Integer> lotlist = new ArrayList<>(lotto);
		List<Integer> list =  new ArrayList<>(lotlist);
		ListComparator comparator = new ListComparator();
		Collections.sort(list, comparator);//hashset의 리스트를 정렬
		List<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(list);
		
		
		//당첨번호 추첨
		HashSet<Integer> win = new HashSet<>();
		for (int j = 0; win.size() < 6; j++) {
			win.add(number.nextInt(45)+1);
		}
		int bonus = number.nextInt(45)+1;
		System.out.print("당첨번호: " + win + "보너스번호=" + bonus);// 6개의 당첨번호와 보너스번호
		
		// 6개를 맞힌 복권을 찾는다
		System.out.println();
		winnerLotto(win, bonus, lotset);// 1등을 찾는다

	}

	static void winnerLotto(HashSet<Integer> w, int bn, List<HashSet<Integer>> lotset) {
		// 당첨번호 w에 대하여 발행된 복권 리스트 al의 모든 원소 elem에 대하여 조사한다
		for (int i = 0; i < al.size(); i++) {
			checkWinner(w, bn, lotset.get(i));
		}
	}

	static void checkWinner(HashSet<Integer> w, int bn, List<HashSet<Integer>> lotset) {
		// 당첨번호 w의 각 숫자를 꺼내 복권 엔트리에 포함되어 있는지를 조사
		List<Integer> L = new ArrayList<>(w);
		int count = 0;
		for (int i = 0; i < L.size() - 1; i++) {
			/*
			 * 당첨번호 각 번호를 몇개 포함하는지를 elem에 대하여 조사
			 */
			// 구현할 부분
		}
		switch (count) {
		case 0:
		case 1:
		case 2:
			System.out.println("꽝");
			break;
		case 3:
			System.out.println("5등 복권 " +  + " 당첨번호:" + w);
			break;
		case 4:
			System.out.println("4등 복권 " +  + " 당첨번호:" + w);
			break;
		case 5:
			if (L.get(6).equals(elem.get(6))) { // 보너스 번호가 일치하는 지를 조사
				System.out.println("2등 복권 " + elem + " 당첨번호:" + w);
				break;
			} else {
				System.out.println("3등 복권 " + elem + " 당첨번호:" + w);
				break;
			}

		case 6:
			System.out.println("1등 복권 " + elem + " 당첨번호:" + w);
			break;
		}

	}
}