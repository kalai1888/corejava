package com.javalearning;

import java.util.Scanner;

public class PassitiveOrNegative {
             int num;
             public static void program(int num) {
             
            	 if(num<0) {
            		 System.out.println("given number is ngative"+" "+num);
            	 }
            	 else
            	 {
            		 System.out.println("given number is passitive"+" "+num);	 
            	 }
             }   	 
       
             public static void main(String[] args) {
		     Scanner sc=new Scanner(System.in);
		     System.out.println("enter the number");
		     int num=sc.nextInt();
		     PassitiveOrNegative obj=new PassitiveOrNegative();
		     //program(num);
		     obj.program(num);
             }
}
