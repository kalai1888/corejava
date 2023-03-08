package com.javalearning;

import java.util.Scanner;

public class KrishnamoorthyNumber {

	 public static void tofindKrishnamoorthyNumber(int num) {
		    
            while(num!=0) {  
                int rem=num%10;
        	    for(int ctr=1;ctr<=rem;ctr++) {
        		 int fact=1;
        		 int sum=0; 
        		 int num1=num;      //5=5!  4=4!  1=1!
        	     fact=fact*ctr;
        	     sum=sum+fact;
        	     num=num/10;
        	  }
            }
            System.out.println(sum==num1?"km number":"not a km number");  	    
		 
	}
	
	public static void main(String[] args) {
		
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the  km number");
	    int num=scanobj.nextInt();
        tofindkrishnamoorthyNumber(num);
		}

}
