package RestaurantModel;

import java.sql.SQLException;

import java.sql.*;

public class MenuItems extends RestaurantModel {
	private String name;
	private double price;
	private double cost;
	public int type;

	public MenuItems(String name, double price, double cost, int type) {
		this.name = name;
		this.price = price;
		this.cost = cost;
		this.type = type;

	}

	public static String getName(int ID) {
		ResultSet result;
		String a = "";
		String Query = "SELECT item_name FROM menuitems WHERE item_id ='" + ID + "' ;";
		try {
			result = DBConnection.connection.createStatement().executeQuery(Query);
			result.next();
			a = result.getString(1);
		
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return a;

	}
        
        public static int getID(String name) {
		ResultSet result;
		String a = "";
                int b = 0;
		String Query = "SELECT item_id FROM menuitems WHERE item_name ='" + name + "' ;";
		try {
			result = DBConnection.connection.createStatement().executeQuery(Query);
			result.next();
			a = result.getString(1);
                        b = Integer.parseInt(a);
		
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return b;

	}



	public static double getPrice(String name) {
		ResultSet result;
		String a = "";
		double b =0;
		String Query = "SELECT item_price FROM menuitems WHERE item_name ='" + name + "' ;";
		try {
			result = DBConnection.connection.createStatement().executeQuery(Query);
			result.next();
			a = result.getString(1);
			 b = Double.parseDouble(a);
		
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return b;
	}

	public double getCost() {
		ResultSet result;
		String a = "";
		double b =0;
		String Query = "SELECT item_cost FROM menuitems WHERE item_name ='" + name + "' ;";
		try {
			result = DBConnection.connection.createStatement().executeQuery(Query);
			result.next();
			a = result.getString(1);
			 b = Double.parseDouble(a);
		
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return b;
	}

           public  static int getItem_type(int itemid){
               ResultSet result;
		String a = "";
		int b = 0;
		String Query = "SELECT item_type FROM menuitems WHERE item_id = " + itemid  + ";";
		try {
			result = DBConnection.connection.createStatement().executeQuery(Query);
			result.next();
			a = result.getString(1);
			b = Integer.parseInt(a);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return b;

           }
         
}
