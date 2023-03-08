package com.javalearning;

import java.util.Scanner;

public class Array2 {
     // System.out.println("even number" + "odd number");
	static void tocheckeven(byte arr[]) {
		 System.out.println("even number" );
		for(int ctr=0;ctr<arr.length;ctr++) {
			 
	             if(arr[ctr]%2==0) {
					    System.out.println(arr[ctr]);
					
				}
		} 
	}
		static void tocheckodd(byte arr[]) {
			 System.out.println( "odd number");
		for(int ctr=0;ctr<arr.length;ctr++) {
            if(arr[ctr]%2!=0) {
				    System.out.println(arr[ctr]);
					
			}
	} 
}
public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter how many size you have need ");
		byte size=scanobj.nextByte();
		System.out.println("enter the elmentof the array  values ");
		byte arr[]=new byte[size];
		ArrayBasic.toreadvalues(arr,scanobj);
		ArrayBasic.displayarrvalues(arr);
		tocheckeven(arr);
		tocheckodd(arr);

	}

}
