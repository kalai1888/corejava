package com.javalearning;

import java.util.Scanner;

public class Array1 {
	static void tocheckoddoreven(byte print[]) {
		for(int ctr=0;ctr<print.length;ctr++) {
			if(print[ctr]%2==0) {
				System.out.println("givn no.is even"+" "+print[ctr]);
				}
			else {
			System.out.println("givn no.is odd"+ " "+ print[ctr]);
		} 
	}
	}
	static void tocheckpossitiveornegative(byte print[]) {
		for(int ctr=0;ctr<print.length;ctr++) 
			if(print[ctr]>0) {
				System.out.println("givn no.is possitive"+" "+print[ctr]);
			}else
			{
		System.out.println("givn no.is negative"+"  "+ print[ctr]);
	} 
	}
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter how many values you have need ");
		byte numbers=scanobj.nextByte();
		System.out.println("enter the elmentof the array  values ");
		byte print[]=new byte[numbers];
		ArrayBasic.toreadvalues(print,scanobj);
		ArrayBasic.displayarrvalues(print);
		tocheckoddoreven(print);
		tocheckpossitiveornegative(print);
		
	}

}
