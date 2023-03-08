package com.javalearning;

public class PrimeNumber {

	public static void main(String[] args) {
	  int count=0;
	  int n=5;
	  for(int i=1;i<=n;i++) {
		  for( int j=1;j<=i;j++) {
			  if(i%j==0) {
				  count++;
				  
			  }
		  }
		      if(count==2) {
		    	  System.out.println("given number is prime number:" +i);
		      }
	  }

	}

}
