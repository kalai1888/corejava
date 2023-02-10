package jdbc1;

import java.sql.SQLException;

public class SwiggyDetails {
	private String resName;
	private String ownerName;
	private String location;
	private float rating;
	private String foodType;
	private int resId;
	private static String NAME= "kalai";
	private static String SECRET= "kalai123";
	
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
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
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}
	public static void toCheckLogin(String userName, String passWord) throws SQLException,Exception {
		if(NAME.equals(userName) && SECRET.equals(passWord)){
			System.out.println("Login successfully");
			DriverClass.toAccessData();
		}
		else {
			System.out.println("UserName or Password is incorrect");
		}
	}
	public static void toCallLogout() {
		System.out.println("Logged Out Successfully");
	}
	
		
		
	}
	


