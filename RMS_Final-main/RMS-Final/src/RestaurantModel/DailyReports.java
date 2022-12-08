package RestaurantModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DailyReports extends RestaurantModel {
	
	private int solditemnumber;
	private ArrayList<Order> dailyOrder;
	private float dailyIncome;
	private float dailyExpense;
	
	
	
	public static double getDailyIncome() {
		ResultSet result;
		double total = 0;

		String Query = "SELECT item_total_price FROM daily_order ;";
		try {
			result = DBConnection.connection.createStatement().executeQuery(Query);

			int sira = result.getMetaData().getColumnCount();
			while (result.next()) {
				for (int i = 1; i <= sira; i++) {
				total = total +	Double.parseDouble(result.getString(i));
				}

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return total ;
		
	}
	
	public static void setSolditemnumber(int id , int solditemnumber ) {
		String Query = "UPDATE daily_order SET quantity = quantity + " + solditemnumber + ", item_total_price = item_total_price+ "
	+ solditemnumber +"* (SELECT item_price FROM menuitems WHERE item_id ="+ id + ") WHERE item_id = "+ id+ ";";
		try {
			DBConnection.connection.createStatement().execute(Query);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	
	
	}
	

	
}
