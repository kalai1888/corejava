package com.javalearning;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		int  b,c,d, e,f,g;
		int reverse=0;
		int sum=0;
		 System.out.println("enter the 4 digits number");
        Scanner sc=new Scanner(System.in);
	    int i= sc.nextInt();		
		b=i%10;    
		c=i/10;
	    sum+=b;
	    d=c%10;
	    e=c/10;
	    sum+=d;
		f=e%10;
		sum+=f;
		g=e/10;
		sum+=g;
		reverse=((b*1000)+(d*100)+(f*10)+g);
		System.out.println( "reverse order of the digits:" +reverse);
		System.out.println("sum of digits:" +sum);
		}
}
