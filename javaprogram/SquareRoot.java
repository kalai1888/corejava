package com.javalearning;

import java.util.Scanner;

public class SquareRoot {   //squ no= 16 = 4*4 it is same number multiply
	// fact of num= 16 
	//  1*16 16
	// 2*8 16     //  //which number half of the square value   num/2
	// 4*4 16
	//8*2 16
	// 16*1 16

	static void tofindsquarerootnumber(int number) {
		boolean flag=false;                //ctr=1,2,3,4.....12=25
		for(int ctr=1;ctr<=number/2;ctr++) {    // ==25
			if(ctr*ctr==number)  
			{
				flag=true;
				System.out.println( "given numbr is   perfect square root"+ctr);

				System.out.println("display the square root value"+number);
				break;
			}
		
		}
		 if(flag==false) {
				System.out.println("given number is  not a perfect square root"+number);
			}  
	}
	
	public static void main(String[] args) {                      
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanobj.nextInt();
		tofindsquarerootnumber(number);
		scanobj.close();



	}

}
