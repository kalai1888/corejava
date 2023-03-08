package com.javalearning;

import java.util.Scanner;

public class MonthCalculation {

	static void tofindmonth(int monthofnum) {
	   int noofdays=0;
	   switch(monthofnum) {
	   case 1:
		   noofdays+=31;
	   case 2:
		   noofdays+=28;
	   case 3:
		   noofdays+=31;
	   case 4:
		   noofdays+=30;
	   case 5:
		   noofdays+=31;
	   case 6:
		   noofdays+=30;
	   case 7:
		   noofdays+=31;
	   case 8:
		   noofdays+=31;
	   case 9:
		   noofdays+=30;
	   case 10:
		   noofdays+=31;
	   case 11:
		   noofdays+=30;
	   case 12:
		   noofdays+=31;
		   System.out.println("enter the noof days"+noofdays);
			
		   break;
		default :
			System.out.println("enter the proper montn number");
		
	   }   
	  // System.out.println("enter the noof days"+noofdays);
		

		      }
	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("enter the number");
		int monthofnum=scanobj.nextInt();
		tofindmonth(monthofnum);
		scanobj.close();


	}

}
