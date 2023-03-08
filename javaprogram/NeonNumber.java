package com.javalearning.program;

import java.util.Scanner;

public class NeonNumber {
     public static void toCheckNeonNumber(int userinput) {
    	 int sum=0;
    	 int rem=0;
    	 int square =userinput*userinput;
    	 while(square>0) {
    		 rem=square%10;
    		 sum=sum+rem;
    		 square=square/10;
    	 }
    System.out.println(sum==userinput ? "neon number":"not a neon number");	 
    	 
     }
	public static void main(String[] args) {
		Scanner scanobj= new Scanner(System.in);
		System.out.println("enter the number neon or not");
		int userInput=scanobj.nextInt();
		toCheckNeonNumber(userInput);
		}

}
