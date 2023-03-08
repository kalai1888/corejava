package com.javalearning;

import java.util.Scanner;

public class SumAndProductNumber {
	static void tofindsumandproductofnumber(int number) {
       int sum=0;
       int product =1;
       while(number!=0) {                            //123!=0
    	                                              //rem=123%10=3/
    	   int rem=number%10; 
    	                                              //sum=0+3=3/3+2=5/5+1=6
    	   sum=sum+rem;                               //product=1*3=3/3*2=6/6*1=6
    	   product=product*rem;
    	   number=number/10;
       }
       System.out.println(sum==product?"spy number":"not a spy number");
}

	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanobj.nextInt();
		tofindsumandproductofnumber(number);
		scanobj.close();

	}

}
