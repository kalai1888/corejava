package com.javalearning.string;

import java.util.Scanner;
     // kalaivani-akalvinai
public class SwapTheTwoString {
    public static void toSwapTheString(String userinput) {
    	char arr[]=userinput.toCharArray();
    	char temp;//=arr.lngth-1
    	for(int ctr=0;ctr<arr.length;ctr+=2) {
    	    temp=arr[ctr];
    		arr[ctr]=arr[ctr+1];
    		arr[ctr+1]=temp;
    		
    	}
    	for(char value : arr) {
    	       System.out.print(value);
    	 }
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name");
		String userinput=scan.nextLine();
		toSwapTheString(userinput);
		
		

	}

}
