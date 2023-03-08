package com.javalearning;

import java.util.Scanner;

public class ArmStrongNumber1 {
	static void tocheckarmstrong(int num) {
		int num1=num;
		int sum=0;
		int rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(num1==sum) {
			System.out.println("given numbr is armstrong");
		}
		else
		{
			System.out.println("given numbr is  not a armstrong");
		}

	}
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanobj.nextInt();
		tocheckarmstrong(num);
	}

}
