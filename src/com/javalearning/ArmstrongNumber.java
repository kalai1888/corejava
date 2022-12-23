package com.javalearning;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num,num1,rem,sum=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		num1=num;
		while(num>0) {
			rem=num%10;
			sum=  sum + rem*rem*rem;
			num=num/10;
		}
		
		if(num1==sum)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	
	}
			
		}
		

	


