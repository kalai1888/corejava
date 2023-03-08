package com.javalearning;

import java.util.Scanner;

public class MultiplicationTable {
       void tocreatetable(int num,int num1) {
    	   for(int ctr=1;ctr<=num1;ctr+=1) {
    		   System.out.println(num+ " X"+ ctr + " = " +  (num*ctr) ); 
    	   }
    	   
       }
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("which table u want to see");
		int num=scanobj.nextInt();
		System.out.println("limit of the table u want to see");
		int num1=scanobj.nextInt();
		 MultiplicationTable obj=new  MultiplicationTable();
		 obj.tocreatetable(num,num1);
			}

}
