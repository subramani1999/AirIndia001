package org.test;

public class SumOfOddNumber {
	public static void main(String[] args) {
		int n = 100;
		int sum =0;
		for (int i = 0; i <= n; i++) {
			if ((i%2) == 1) {
				sum += i;
			}
		}
		System.out.println("Sum of all odd numbers between o to "+n+" = "+sum);
	}
		
}
	
