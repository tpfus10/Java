package com.ruby.java.ch08.innerClass;
class Node3 {
	int data;
	Node3 link;
	public Node3(int data) {
		this.data = data;
		link = null;
	}
}
class LinkedList3 {
	Node3 first; // int 대신 node 쓴 거로 생각
	void append(int data) {
		Node3 p = first, q = null; // Node3 p = first = null 상태
		Node3 newNode = new Node3(data);
		if (first == null) { // List is empty
			first = newNode;
			return;
		}
		while (p.link != null) {
			p = p.link;
		}
		p.link = newNode;
	}
	public LinkedList3() {
		first = null;
	}
	void showList() {
		System.out.println();
		Node3 p = first;
	}
	void insert(int data) {
		Node3 newNode = new Node3(data);
		Node3 p = first, q = null;
		if (p == null) {
			first = newNode;
			return;
		}
		while (p != null && data > p.data) {
			q = p;
			p = p.link;
		}
		if (q == null) {
			newNode.link = first;
			first = newNode;
		} else {
			newNode.link = p;
			q.link = newNode;
		}
	}
}
public class Test_ch08_연결리스트와배열 { // 내부 클래스
	static int getList(int[] data) {
		int count = 0;
		int mid = data.length / 2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5;
			count++;
		}
		return count;
	}
	static void showList(int[] data) { // 값을 추가해서 출력하는 함수
		System.out.println();
		for (int i = 0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i] + " ");
		}
	}
	static int insertList(int[] data, int count, int x) {// 구현하기
		int indx = 0;
		while (indx < count) {
			if (x < data[indx]) {
				while (indx < count) {
					int temp = data[indx];
					for (int i = count; i > indx; i--) {
						data[i] = data[i - 1];
					}
					data[indx] = x;
					x = data[++indx];
				}
				break;
			} else {
				indx++;
			}
			return ++count;
		}
	}
	public static void main(String[] args) {
		int[] list = new int[10];
		int count = 0;
		System.out.println("배열로 리스트::");// 배열에 리스트 표현하는 문제(밀어내서 공간 만들기 필요)
		count = getList(list);
		showList(list);
		count = insertList(list, count, 3);// 배열에 3을 넣어라
		showList(list);
		count = insertList(list, count, 7);// 배열에 7을 넣어라
		showList(list);
		System.out.println();
		System.out.println("노드로 리스트::");
		LinkedList3 ll = new LinkedList3();// 노드-링크를 활용하는 문제
		ll.append(5);
		ll.append(10);
		ll.append(15);
		ll.append(20);
		ll.append(25);// 맨 뒤에 추가하는 함수 append; 5>10>15>20>25
		ll.showList();
		ll.insert(3);
		ll.showList();// 리스트에 3을 넣어라
		ll.insert(7);
		ll.showList();// 리스트에 7을 넣어라
	}
}