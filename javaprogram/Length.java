package com.javalearning;

import java.util.Scanner;

public class Length {

	public static void tofindnumber(int num) {
		int count=0;
		for(int ctr=1;ctr<=num;ctr++) {  //while(int num!=0){
			//System.out.println(ctr);
				int rem=num%10;// System.out.println(ctr);
			 count++;                 //int rem=num%10;
		num=num/10; 
			
		}
		System.out.println("count of the number"+count);
		
	}
	    public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanobj.nextInt();
        tofindnumber(num);

	}

}
