package com.javalearning;

import java.util.Scanner;

public class SixthProgram {


	int num,num1;
	public  void tocheck1(int num,int num1) {
		for( ;num<=num1;num+=1) {
			/*	 if(num%2==0) {
    	         System.out.println("given number is even" +"  " + num);
    	     }  else{
    	     System.out.println("given number is odd" +"  " + num);
    			}	
    	}		
 }*/
			EvenOrOdd.program2(num);
		}
	}
	
	    static void toGenerateSeries(int num,int num1) {
		for( ;num<=num1;num+=1) {
			System.out.println(num);
		}
	} 
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the starting number");
		int num=scanobj.nextInt();
		System.out.println("enter the ending number");
		int num1=scanobj.nextInt();
		SixthProgram obj=new SixthProgram();
		obj.tocheck1(num,num1);
		toGenerateSeries(num,num1);
		scanobj.close();

	}     		
}