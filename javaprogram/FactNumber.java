package com.javalearning;
                            
import java.util.Scanner;                   // fact of num= 16 
                              //  16/2=8   //  1*16 16
                                          // 2*8 16    
                                           // 4*4 16
            //exe time reduce  num/2                                //8*2 16
                                             // 16*1  16
public class FactNumber {

	 public static void tofactnumber(int num) {
		 int count=0;
		 for(int ctr=1;ctr<=num/2;ctr++) {
	          if(num%ctr==0) {
				 System.out.println("given number is fact"+ " "+ctr);
				  count++; 
			 }
		 }
	  System.out.println("given the fact of count"+" "+count);
	  }
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanobj.nextInt();
        tofactnumber(num);

	}

}
