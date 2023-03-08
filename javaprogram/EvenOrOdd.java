package com.javalearning;

import java.util.Scanner;

public class EvenOrOdd {
         int num;
         public static void program2(int num) {
        	 if(num%2==0) {
        		 System.out.println("given number is even" +"  " + num);
        	 }
        	 else {
        	  System.out.println("given number is odd" + " " + num);	 
        	 }
         }  	 
         public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    program2(num);
	
}
}

         
         
         
         
         
         
         

