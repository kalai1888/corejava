package com.javalearning;

   public class SumOfEvenDigits {

	public static void main(String[] args) {
	
/*	System.out.println("odd"+"  "+"even");
	for(int i=1;i<=20;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
		else
		{
			System.out.print(i+"  ");
		}
	
	}
	}
}   */
	
 int num=5;
 boolean prime=true;
 for(int i=2;i<=num;i++) {
	 if(num%i==0) {
		 prime=false;
		 break;
	 }
 }
System.out.println(prime);
	}
   }
   









	


