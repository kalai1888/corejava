package com.javalearning;

import java.util.Scanner;

public class DuplicateValue {
 // First occur in duplicate value by using array
	
	static void tocheckduplicate(byte print[] ) { //30,10,45,30,55
	       String flag="not found";                                        
	  for(int ctr=0;ctr<print.length;ctr++) {
		  for(int ctr1=ctr+1;ctr1<print.length;ctr1++) {
			  if(print[ctr]==print[ctr1]) {
				  flag="found";
				  System.out.println("first occur duplicate value"+print[ctr]);
				  System.out.println("element found index"+ctr1);
				  break;
			  }
			  
		  }
	  
	      if(flag=="not found") {
	
	     System.out.println("not found duplicat value");
	      break;
	      }
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
		tocheckduplicate(print);

	}

}
