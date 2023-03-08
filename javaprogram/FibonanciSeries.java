package com.javalearning.program;

import java.util.Scanner;

public class FibonanciSeries {
    static void toFindFibonanciSeries(int num1,int num2,int limit) {
    	System.out.print(num1+" "+num2);
    	for(int ctr=2;ctr<limit;ctr++) {
    		int total;
    		total=num1+num2;
    		System.out.print(" "+total);	
    		num1=num2;
    		num2=total;
    	}
    	
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers..");
		byte num1=scan.nextByte();
	    byte num2=scan.nextByte();
		System.out.println("enter the limit of the numbers..");
        int limit=scan.nextInt();
		toFindFibonanciSeries(num1,num2,limit);
		
		
	}

}
