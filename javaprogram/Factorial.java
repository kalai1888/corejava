package com.javalearning;

import java.util.Scanner;

public class Factorial {
     
     long fact=1;
     
	public void tocheckfact(int num) {
		
		for(int ctr=1;ctr<=num;ctr++) {
			  fact=fact*ctr;
		}
		/*int ctr=1;
		while(ctr<=num) {
			fact=fact*ctr;
			ctr++;
		}   */
		     System.out.println("factorial number is" +" " +fact); 
	}
	     

	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanobj.nextInt();
        Factorial obj=new Factorial();
        obj.tocheckfact(num);
        
        
	}

}
