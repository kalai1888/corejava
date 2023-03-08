package com.javalearning.program;

import java.util.Scanner;

import com.javalearning.ArrayBasic;

public class RightRotaion {
	public static void  toCheckRightRotation(byte arr[],int rotation) {
		for(int ctr=1;ctr<=rotation;ctr++) {
			byte lastNum=arr[arr.length-1];
			for(int ctr1=arr.length-1;ctr1>0;ctr1--) {
				arr[ctr1]=arr[ctr1-1];
			}
			arr[0]=lastNum;
		
		for( int values:arr) {
			System.out.print(values+" ");
			
		}
		System.out.println("");
	}
	}
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number of rotations");
		int rotation=scanobj.nextInt();
		System.out.println("enter the array size");
		byte size=scanobj.nextByte();
		
		byte arr[]=new byte[size];
		ArrayBasic.toreadvalues(arr,scanobj);
		toCheckRightRotation(arr,rotation);
	}

}
