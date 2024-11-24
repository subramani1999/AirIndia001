package org.test;

import java.util.Scanner;

public class CountOfEvenNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int nextInt = sc.nextInt();
		int Count = 0;
		for (int i = 1; i <= nextInt; i++) {
			if ((i%2) == 0) {
				Count++;
			}
		}
		System.out.println("Count of all of even number 1 to "+nextInt+" = "+Count);
	}

}
