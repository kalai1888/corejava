package jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HotelDetails {
	
			private static Scanner scan =new Scanner(System.in);
			public void toAdd(Connection connection) throws SQLException {
				PreparedStatement addAll=connection.prepareStatement("INSERT INTO swiggy values(?,?,?,?,?,?)");
				System.out.println("Enter the res Id: ");
				addAll.setInt(1,scan.nextInt());
				System.out.println("Enter the res name: ");
				addAll.setString(2,scan.next());
				System.out.println("Enter the owner name: ");
				addAll.setString(3, scan.next());
				System.out.println("Enter the location: ");
				addAll.setString(4, scan.next());
				System.out.println("Enter the rating: ");
				addAll.setFloat(5, scan.nextFloat());
				System.out.println("Enter the foodType: ");
				addAll.setString(6, scan.next());
				int insertValues=addAll.executeUpdate();
				System.out.println(insertValues+" inserted values");
				

			}
			
			public void toDisplayAll(Connection connection) throws SQLException,Exception {
				Statement inputDisplay=connection.createStatement();
				ResultSet view=inputDisplay.executeQuery("SELECT * FROM swiggy");
				while(view.next()) {
					System.out.println("resID= "+view.getInt(1)+", resName= "+view.getString(2)+", OwnerName= "+view.getString(3)+", Location= "+view.getString(4)+", Rating= "+view.getFloat(5)+", FoodType= "+view.getString(6));	
				}

			}
			
			public void toDisplayById(Connection connection) throws SQLException,Exception {
				PreparedStatement displayId = connection.prepareStatement("SELECT * FROM swiggy WHERE resId = ?");
				System.out.println("Enter the restaurant id to Display");
				int resId = scan.nextInt();
				displayId.setInt(1,resId);
				ResultSet view = displayId.executeQuery();
				while(view.next()) {
					System.out.println("resId= "+view.getInt(1)+", resName= "+view.getString(2)+", OwnerName= "+view.getString(3)+", Location= "+view.getString(4)+", Rating= "+view.getFloat(5)+", FoodType= "+view.getString(6));	
				}

			}
			
			public void toDeleteById(Connection connection) throws SQLException {
				PreparedStatement delete = connection.prepareStatement("DELETE FROM swiggy WHERE resId= ?");
				System.out.println("Enter the restaurant id to Delete");
				int resId = scan.nextInt();
				delete.setInt(1,resId);
				int deleteValue = delete.executeUpdate();
				System.out.println(deleteValue + "record deleted");
			}
			
			
			/*public void add(Connection connectin) {
				PreparedStatement user = connectin.prepareStatement("insert into tn values(?,?,?,?,?,?,?");
				user.setInt(1,  scan.nextInt())
				int inser =  user.executeUpdate();
			}
			*/
			public void toUpdateById(Connection connection) throws SQLException,Exception {
		
				PreparedStatement update=connection.prepareStatement("Update swiggy set foodType=? where resId= ?");
				System.out.println("Enter the res Id: ");
				update.setInt(2, scan.nextInt());
				System.out.println("Enter the food type: ");
				update.setString(1, scan.nextLine());
				int updateValues=update.executeUpdate();
				System.out.println(updateValues+" record updated successfully");
				
			}

		}

