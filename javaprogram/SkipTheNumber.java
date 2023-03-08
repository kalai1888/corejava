package com.javalearning.string;

import java.util.Scanner;

public class SkipTheNumber {
 public static void toSkipTheNumber(String userinput)
 {
	 for(int ctr=0;ctr<userinput.length();ctr++) {
		 if(userinput.charAt(ctr)>=48 && userinput.charAt(ctr)<=57 ) {
			 continue;
			 
		 }
		 
	 
	 System.out.print(userinput.charAt(ctr));
 }
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name");
		String userinput=scan.nextLine();
		toSkipTheNumber(userinput);
		


	}

}
