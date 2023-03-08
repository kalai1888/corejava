package com.javalearning;

import java.util.Scanner;

public class ForAndWhile {
	int num,num1;
	void loops(int num,int num1) {
		/*   for( ;num<=num1;num+=1) {

		   System.out.println("enter the values"+ " "+num);
		  }  */

		while(num<num1) {
			System.out.println(num);
			num++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting number");
		int num=sc.nextInt();
		System.out.println("enter the ending number");
		int num1=sc.nextInt();
		System.out.println("to generate the series");
		ForAndWhile obj=new ForAndWhile();
		obj.loops(num, num1);


	}
}




