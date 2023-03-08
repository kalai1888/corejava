package com.javalearning;

import java.util.Scanner;

public class BuzzNumber {  //divided by 7 and ending of the number is 7
	static void tofindbuzznumber(int number) {
		if( number%7==0 || number%10==7) {
			System.out.println("givn number is buzz number");
		}
		else {
			System.out.println("givn number is  not a buzz number"); 
		}
	}
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanobj.nextInt();
        tofindbuzznumber(number);
        scanobj.close();

	}

}
