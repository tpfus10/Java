package com.ruby.java.ch03;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in); 
	    
	    System.out.println("a:");
	    int a = sc.nextInt();
	    
	    System.out.println("b:");
	    int b = sc.nextInt();
	    
	    System.out.println("op:");
	    char op = sc.next().charAt(0);	  
		
	
		
		switch(op) {
		case '+':
			System.out.println(a + b);break;
		case '-':
			System.out.println(a - b);break;
		case '*':
			System.out.println(a * b);break;
		case '/':
			System.out.println(a / b);break;
			
		}
	}
}

/*int a = 12;
int b = 12;
char op = '+';*/