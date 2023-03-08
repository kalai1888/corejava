package com.javalearning;

import java.util.Scanner;

public class FifthProgram {
		int num,num1;
        public static void tocheck(int num,int num1) {
      for( ;num<=num1;num+=1) {
    	 /* 	   if(num<0) {
  		 System.out.println("given number is negative"+" "+num);
  	 }
  	 else
  	 {
  		 System.out.println("given number is possitive"+" "+num);	 
  	 }*/
   
    	  

    	  PassitiveOrNegative.program(num);
    	  
    	  }
       	  }
			
	   public static void main(String[] args) {
		   
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the starting number");
		int num=scanobj.nextInt();
		System.out.println("enter the ending number");
		int num1=scanobj.nextInt();
	
       tocheck(num,num1);
	}

}
