package org.test;

import java.util.Scanner;

public class HelloTest {
	
	public static void main(String[] args) {
		
	
//	Question 9 and 10 Doubt
		/*
		 * int i=5; if (i == 5) { break; } System.out.println();
		 */
	 
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
       //String
       System.out.println("Please Enter Your Age:");
        int nextInt = scanner.nextInt();
       System.out.println("Your Age Is:" +nextInt);
       if (nextInt >= 18) {
    	   System.out.println("The Person Is Eligible To Vote");
	}else {
		   System.out.println("The Person Is Not Eligible To Vote");
	}    
}	 

}
