package com.javalearning;

import java.util.Scanner;

public class SeventhProgram {

	public static void looping(int num,int num1) {
	
	for( ;num<=num1;num+=1) {
			 if(num%2==0) {
	         System.out.println("given number is even" +"  " + num);
	     }
	        
	}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the starting number");
		int num=scan.nextInt();
		System.out.println("enter the ending number");
		int num1=scan.nextInt();
		looping(num,num1);

	}

}
