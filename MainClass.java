package com.javaproject;
import java.util.Scanner;
public class MainClass {
	public static void main(String[]args) {
		//we create object to swiggyManagement class
		SwiggyManagement obj=new SwiggyManagement();                     

		Scanner scan=new Scanner(System.in);

		//in this cases we call the methods from SwiggyManagement class using object
		int choices;
		do {
			choices = scan.nextInt();  

			switch(choices) {
			case 1:  
				obj.insert();
				break;

			case 2:                       //Display the inserted details
				obj.displayDetails();
				break;
                                       
			case 3:                             //remove particular restaurant details by giving unique number
				obj.deleteHotel(obj);
				break;

			case 4:
				obj.searchHotel(obj);
				break;

			case 5:
				obj.updateDetails(obj);
				break;
			}
		}

		while(choices<6);

		scan.close();

	}

}



