package com.ruby.java.ch08.innerClass;

public class MyLinkedLlist {
	private Node head;
	private class Node {
		private String data;
		private Node link;
		public Node(String data) {
			//생성자는 필드가 2개 이므로 heap에 필드 공간 2개를 할당
			this.data = data;this.link = null; //link가 하나뿐이라 this 안 써도 상관없음
			//값을 넣어주지 않아도 공간은 할당됨
		}
	}
	public void add(String data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			Node next = head;
			while(next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}
	public void print() {
		
	}
	public MyLinkedLlist() {
		this.head = null;
	}

}
