package com.javalearning;

import java.util.Scanner;

public class ZerothCondition {
        int num;
        
        public  static void program1(int num) {
        	if(num==0) {
        		System.out.println("given number is neutral");
        	}
        }
        public static void main(String[] args){

        	 Scanner sc=new Scanner(System.in);
		     System.out.println("enter the number");
		     int num=sc.nextInt();
		     program1(num);
        	
        }
}
        	
        	
        	
        	
        	
	


