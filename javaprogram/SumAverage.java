package com.javalearning;

import java.util.Scanner;

public class SumAverage {
	static void toreadvalues1(byte stdmarks[],Scanner obj) {
		for(int ctr=0;ctr<stdmarks.length;ctr++) {
			stdmarks[ctr]=obj.nextByte();
		}
		}
	
	static int displaysumaverage(byte stdmarks[]) {
		int sum=0;
		for(int ctr=0;ctr<stdmarks.length;ctr++) {
			sum= sum + stdmarks[ctr];
		}
		//System.out.println(sum);
		 return sum;
	}
	public static void main(String[] args) {
	 Scanner scanobj=new Scanner(System.in);
	 System.out.println("entr how many sub u have need ");
	 byte noofsub=scanobj.nextByte();
	 System.out.println("entr the stdmarks ");
	 byte stdmarks[]= new byte[noofsub];
	// ArrayBasic.toreadvalues(stdmarks, scanobj);
	 toreadvalues1(stdmarks, scanobj);
	 int result=displaysumaverage(stdmarks);
	// SumAverage obj=new SumAverage();
	// int result=obj.displaysumaverage(stdmarks);
	 
	 System.out.println(result);
	 System.out.println(result/noofsub);
	 
	 
	  }
	  
  }
	


