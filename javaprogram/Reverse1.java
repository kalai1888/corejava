package com.javalearning;

import java.util.Scanner;

public class Reverse1 {
    public static void tofindreverse(int num) {
    	int num1=num;
    	int reverse=0;
    	while( num>0) {
    		int rem=num%10;
    		 num=num/10;
    		reverse=reverse*10+rem;
    	}
    	
    	System.out.println("reverse of the number"+reverse);
    	System.out.println(num1==reverse? " palindrome":" not palindrome");
    	
    }
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanobj.nextInt();
        tofindreverse(num);


	}

}
