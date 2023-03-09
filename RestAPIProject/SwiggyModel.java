package com.BasicExample.demo.model;
/*In this project we are creating the restaurant management like Swiggy.
 *  In this, we can create the restaurant details, display the details, display the restaurant details in 
 *  which hotel id we want to see,update the restaurant details in which hotel id we want to see and deleting the particular id*/
 
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*here we take the attributes of a restaurant like restaurant name,owner name,food type,rating,location in the private access modifier
 * so that to access the attributes by public getters and setters method  */


/*@Entity(default)- A Class can be mapped to a table
 * @Table- Specifies the table name
 * @Dynamic Update- Updates the particular value to the attribute which we want to change instead of checking all the attributes.
 * @Id-Considers as a primary key
 * @Generated value(strategy=GenerationType.IDENTITY)- automatically generates the primary key values.
 * @Column-Specifies the column name*/
@Entity
@Table(name="SwiggyModel")
@DynamicUpdate
public class SwiggyModel {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int hotelId;
		
		@Column(name="restaurantName",nullable=false)
		private String restaurantName;
		private String ownerName;
		private String foodType;
		private float rating;
		private String location;
		
		public SwiggyModel() {
			
		}
		
		public String getRestaurantName() {
			return restaurantName;
		}
		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public int getRestaurantId() {
			return hotelId;
		}
		public void setRestaurantId(int restaurantId) {
			this.hotelId = restaurantId;
		}
		public String getFoodType() {
			return foodType;
		}
		public void setFoodType(String foodType) {
			this.foodType = foodType;
		}
		public float getRating() {
			return rating;
		}
		public void setRating(float rating) {
			this.rating = rating;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}

		public SwiggyModel(int hotelId, String restaurantName, String ownerName, String foodType, float rating,
				String location) {
			this.hotelId = hotelId;
			this.restaurantName = restaurantName;
			this.ownerName = ownerName;
			this.foodType = foodType;
			this.rating = rating;
			this.location = location;
		}

		
		
		
	}



		

