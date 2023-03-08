  package com.javalearning;
public class PrimeNumber1 {

  public static void main(String[] args) {
	  int count=0;
	  
	  for(int i=5;i<=10;i++) {
		  for( int j=1;j<=i;j++) {
			  if(i%j==0) {
				  count++;
				  
			  }
		  }
		      if(count==2) {
		    	  System.out.println("given number is prime number:" +i);
		      }
		   //   else 
		   //   {
		       
		   //   System.out.println("given number is not a prime number:" +i);  
		  //    }
	  }

	}

}

