package com.javalearning;

import java.util.Scanner;

public class EightProgram {
     int num,num1;
	static void looping1(int num, int num1) { 
	     
		for( ;num<=num1;num+=1) {
			if(num%2!=0) {
				System.out.println("given number is odd" +"  " + num);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the starting number");
		int num=scan.nextInt();
		System.out.println("enter the ending number");
		int num1=scan.nextInt();
		looping1(num,num1);
}

}
