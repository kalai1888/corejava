package com.javalearning;

import java.util.Scanner;


public class Prime {
       static void tocheckprime(int num) {
    	   boolean flag=false; 
    	   for(int ctr=1;ctr<=num;ctr++) {
    		   if(num%ctr==0) {
    	    	  flag=true;
    	      }
    	   
    	       System.out.println(flag==true?" prime":"  non prime" );
    	   }
       }
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanobj.nextInt();
        tocheckprime(num);


	}

}
