package com.javalearning.string;

import java.util.Scanner;

public class ReverseString {
	
	  
      static void tofindreversestring(String userInput) {//hellohi  =  iholleh
    	  String reverseStr="";
    	  for(int ctr=userInput.length()-1;ctr>=0;ctr--) {
    		  System.out.println(userInput.charAt(ctr));
    		  reverseStr=reverseStr+userInput.charAt(ctr);
    	  }
    	  if(userInput.equals( reverseStr)) {
        	  System.out.println("it is a palindrome");
          }
          else {
        	  System.out.println("it is  not a palindrome");
          }
      }
      
      static void toReverseStr(char[] userInput) {//hellohi  =  iholleh
     	 
    	  for(int ctr=userInput.length-1;ctr>=0;ctr--) {
    		  System.out.println(userInput[ctr]);
    	  }
      }
     
      
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the message");
		String userInput=scanobj.nextLine();
		//char cchar[]=userInput.tocharArray();
		tofindreversestring(userInput);
	//	StringBuilder str=new StringBuilder("hello");
	//	System.out.println(str.reverse());
		
	//	StringBuffer str=new StringBuffer("hello");
	//		System.out.println(str.reverse());
			
	   char	cchar[]=userInput.toCharArray();
		toReverseStr(cchar);
		
		
		

	}

}
