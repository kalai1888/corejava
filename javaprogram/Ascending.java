package com.javalearning.string;

import java.util.Scanner;

import com.javalearning.ArrayBasic;

public class Ascending {
	public static void toReadValues(int arr[],Scanner scanobj) {
		for(int ctr=0;ctr<arr.length;ctr++) {
			arr[ctr]=scanobj.nextByte();
		}

	}
		public static void toCheckAscendingOrder( int arr[]) {
		for(int ctr=0;ctr<arr.length;ctr++) {
			for(int ctr1=ctr+1;ctr1<arr.length;ctr1++) {
				if(arr[ctr]>arr[ctr1]) {
					int temp=arr[ctr];
					arr[ctr]=arr[ctr1];
					arr[ctr1]=temp;
				}
			
			}
		System.out.println("ascnding order is "+arr[ctr]);
		
		}
	}
	public static void main(String[] args) {

		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter how many values you have need ");
		byte element=scanobj.nextByte();
		System.out.println("enter the elmentof the array  values ");
		int arr[]=new int[element];
		toReadValues(arr,scanobj);
		toCheckAscendingOrder(arr);
		scanobj.close();



	}

}
