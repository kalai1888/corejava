package com.javaproject;
/*
 * In this program we acting has a swiggy management to add restaurant details.
 * we do some functions like add details,display,search the restaurant,delete restaurant details and update hotel the details
 * we use some attributes -->shopName,location,owner,rating,veg_nonVeg
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SwiggyManagement {
	     /*to hide the details we use private attributes
		 * shopName
		 * ownerName
		 * location
		 * rating
		 * veg_nonVeg
		 * Veg
		 * nonVeg
		 */
		private String shopName;
		private String ownerName;
		private String location;
		private float rating;
		private String veg;
		private String nonVeg;
		private String veg_nonVeg;
		private int hotelNum;
		private static Scanner scanObj=new Scanner(System.in);            //to get userinput we create obj for scanner class

		/*we create list to add restaurant details
		 * ArrayList implements list interface
		 * methods-->add,remove,set,get
		 */
		ArrayList<SwiggyManagement>resList=new ArrayList<SwiggyManagement>();


		/*Swiggy()-->no parameter constructor is defined--->to display the details to the user
		 * Swiggy(hotelNumber,owner,location,rating,veg_nonveg)-->parameterized constructor is defined
		 * 
		 * this keyword-->if the attributes and parameter names are same we use this keyword
		 * we can access attributes with in the class
		 */

		public SwiggyManagement() {
			System.out.println("    **SWIGGY**  ");
			System.out.println("1. Add the restaurants");
			System.out.println("2. View the hotel");
			System.out.println("3. Remove the restaurants");      
			System.out.println("4.Search the hotel");
			System.out.println("5. Update the menu list");	
		}

		public SwiggyManagement(int hotelNum, String shopName, String ownerName, String location, float rating, String veg_nonVeg) {
			this.hotelNum=hotelNum;
			this.shopName = shopName;
			this.ownerName = ownerName;
			this.location= location;
			this.rating =rating ;
			this. veg_nonVeg = veg_nonVeg;
			
		}

		// Here we use encapsulation methods to set the input we use setter and getter to get the input
		public int getHotelNum() {
			return hotelNum;
		}

		public void setHotelNum(int hotelNum) {   //to set the input 
			this.hotelNum = hotelNum;
		}

		public String getShopName() {       //to get the the output from setter
			return shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public float getRating() {
			return rating;
		}

		public void setRating(float rating) {
			this.rating = rating;
		}

		public String getVeg() {
			return veg;
		}

		public void setVeg(String veg) {
			this.veg = veg;
		}

		public String getNonVeg() {
			return nonVeg;
		}

		public void setNonVeg(String nonVeg) {
			this.nonVeg = nonVeg;
		}

		public String getVeg_nonVeg() {
			return veg_nonVeg;
		}

		public void setVeg_nonVeg(String veg_nonVeg) {
			this.veg_nonVeg = veg_nonVeg;
		}


		/*it convert int,float,char...to string type
		 * toString come from object class
		 */
		@Override     
		public String toString() {
			return "shopName=" + shopName + ", ownerName=" + ownerName + ", location=" + location + ", rating="
					+ rating + ", veg_nonVeg=" + veg_nonVeg + ", hotelNum=" + hotelNum ;
		}

		/*add all the restaurant details in this method
		 *listname.add(new classname(parameters))
		 */
		public void insert() {
			System.out.println(" **Insert the restaurant details**  ");
			System.out.print("Enter Restaurant Id: ");
			int hotelNo=scanObj.nextInt();
			System.out.print("Enter Restaurant name: ");
			String name=scanObj.next();
			System.out.print("Enter the Location: ");
			String place=scanObj.next();
			System.out.print("Enter the shopOwners: ");
			String ownerName=scanObj.next();
			System.out.print("Shop rating: ");
			float rating=scanObj.nextFloat();
			System.out.print("Veg/nonveg hotel: ");
			String veg_nonVeg=scanObj.next();
			resList.add(new SwiggyManagement(hotelNo,name,ownerName,place,rating,veg_nonVeg)); 	
		}


		//Here we display the inserted restaurant details by using iterator 
		public void displayDetails() {
			System.out.println("   **Display the Hotel Details**  ");	

			Iterator<SwiggyManagement>res= resList.iterator();  //Iterator<classname>variable=listname.iterator
			while(res.hasNext()) {
				System.out.println(res.next());
			}
			//System.out.println(resList);
		}


		/*here we take unique id number to remove the hotel details
		 *if the id is not their it will print "Hotel is not found"
		 *if id is found --> remove the hotel details
		 */
		public void deleteHotel(SwiggyManagement obj) {
			System.out.println("  **Remove the restaurants**  ");
			boolean delFlag = false;
			System.out.println("Enter hotel no to delete");
			int hotelNumDel = scanObj.nextInt();
			Iterator<SwiggyManagement> rem = resList.iterator();
			while(rem.hasNext()) {
				obj=rem.next();
				if(obj.getHotelNum()== hotelNumDel) {           
					delFlag = true;
					resList.remove(obj);
					System.out.println("Deleted succesfully");
					displayDetails();
					break;
				}
			}
			if(delFlag == false) {
				System.out.println("Hotel is not deleted");         
			}
		}


		/*search the hotel using id number
		if the id is not their it will print -->hotel is not found
		if id is found-->it display the details searched details
		 */

		public void searchHotel(SwiggyManagement swiggyObj) {
			System.out.println("  **Find the restaurant**   ");        
			System.out.println("Enter restaurant ID number:");
			int findHotel= scanObj.nextInt();
			boolean findFlag= false;
			Iterator<SwiggyManagement> toFind=resList.iterator();

			while(toFind.hasNext()) {
				swiggyObj=toFind.next();
				if(swiggyObj.getHotelNum()==findHotel) {
					findFlag= true;
					System.out.println("Restaurant found");
					//System.out.println(resList);  
					displayDetails();
					break;
				}
			}

			if(findFlag==false) {
				System.out.println("Restaurant not found");  
			}
		}

		//to update the details using id
		//which index you want set ctr value,add the details
		public void updateDetails(SwiggyManagement obj) {
			System.out.println("  **Update the restaurant**  ");	 
			System.out.println("Enter the hotel Id to update");
			int hotelNoUpd=scanObj.nextInt();

			boolean updFlag=false;
			Iterator<SwiggyManagement> updHotel=resList.iterator();

			int ctr=-1;
			while(updHotel.hasNext()) {

				obj=updHotel.next();
				ctr++;
				if(obj.getHotelNum()==hotelNoUpd) {
					updFlag = true;
					System.out.println("Enter the Restaurant name:");
					String hotel=scanObj.next();
					System.out.println("Enter the location: ");
					String place1=scanObj.next();
					System.out.println("Enter the rating: ");
					float ratings=scanObj.nextFloat();
					System.out.println("Enter the Owner name: ");
					String owner=scanObj.next();
					System.out.println("Enter the veg or non veg: ");
					String nonVeg_veg=scanObj.next();
					resList.set(ctr,new SwiggyManagement(hotelNoUpd,hotel,place1,owner,ratings,nonVeg_veg));
					displayDetails();
					System.out.println("Update successfully");
					break;
				}
			}
			if(updFlag == false) {
				System.out.println("Restaurant not found to update the details");
			}
		
	}
}
