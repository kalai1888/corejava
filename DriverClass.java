package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DriverClass {

	private static Scanner scan=new Scanner(System.in);

	public static Connection toConnectDb() throws SQLException,Exception {
		Connection connection= null;
		try {
			String userName = "root";
			String password = "kv#45bln78";
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FOOD",userName,password);
			Statement line=connection.createStatement();

		}
		catch(Exception expObj) {
			System.out.println(expObj);
		}
		return connection;
	}

	public static void toAccessData() throws SQLException,Exception {

		Connection connection =toConnectDb();
		HotelDetails mObj=new HotelDetails();
		Scanner scan=new Scanner(System.in);
		System.out.println("    **SWIGGY**  ");
		System.out.println("1.Add the restaurants");
		System.out.println("2.View the hotel");
		System.out.println("3.Search the restaurants");      
		System.out.println("4.Remove the hotel");
		System.out.println("5.Update the menu list");	
		int choice;
		do {
			choice=scan.nextInt();
			switch(choice) {

			case 1:
				System.out.println("    Insert Restaurant details  ");
				mObj.toAdd(connection);
				break;
			case 2:
				System.out.println("    Display restaurant details");
				mObj.toDisplayAll(connection);
				break;
			case 3:
				System.out.println("    Find Restaurant using res Id");
				mObj.toDisplayById(connection);
				break;
			case 4:
				System.out.println("    Delete the restaurant using res Id");
				mObj.toDeleteById(connection);
				break;
			case 5:
				System.out.println("    Update the restaurant using res Id");
				mObj.toUpdateById(connection);
				break;
			case 6:
				SwiggyDetails.toCallLogout();
				break;
			case 7:
				break;
			}
		}while(choice!=7);
		connection.close();
	}

	public static void main(String[] args) throws Exception, SQLException {
		System.out.println("Enter the username:");
		String userName=scan.next();
		System.out.println("Enter the password: ");
		String password=scan.next();
		SwiggyDetails.toCheckLogin(userName, password);


	}

}

