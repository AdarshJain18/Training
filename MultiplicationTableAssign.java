package com.pack;

import java.util.Scanner;

public class MultiplicationTableAssign {
	
	static void MultiplicationTable(int num, int i) {
		System.out.println(num + "*" + i + "=" + num*i);
		if(i<10) {
			MultiplicationTable(num, i+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		System.out.println("Multiplication Table of " + num + " is: ");
		/*
		 * for(int i = 1; i <= 10; i++) { System.out.println(num + "*" + i + "=" +
		 * num*i); }
		 */
		MultiplicationTable(num, 1);
		sc.close();
	}
}
