package com.javalearning;

import java.util.Scanner;

public class ReverseArray {
      static void tofindreversearray(byte arrayvalues[]) {
    	  for(int ctr=arrayvalues.length-1;ctr>=0;ctr--){
    		  System.out.println("reverse of array"+arrayvalues[ctr]);
    	  }
    	  
      }
	public static void main(String[] args) {
		
	Scanner scanobj=new Scanner(System.in);
	System.out.println("enter how many values to u want to see");
	byte userinput=scanobj.nextByte();
	System.out.println("print the array elements");
	byte arrayvalues[]=new byte[userinput];
	ArrayBasic.toreadvalues(arrayvalues,scanobj);
	ArrayBasic.displayarrvalues(arrayvalues);
	tofindreversearray(arrayvalues);
	scanobj.close();
	}

}
