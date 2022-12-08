package RestaurantModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Order extends RestaurantModel {

	public ArrayList<ArrayList<String>> orderItems;
	private double totalPrice;
	private int amount;
	public static int orderid;
        

	public Order(int orderid) { // Order olusturduk ve olusturulan orderin idsini orderidye esitliyoruz. islem
								// yaparken bu kullanilacak.
		this.orderid = orderid;
	}
        
	
	
	public int getQuantity(int itemid) {

		ResultSet result;
		String a = "";
		int b = 0;
		String Query = "SELECT quantity FROM orderitems WHERE order_id = " + orderid + " AND item_id = " + itemid + ";";
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



	public static void addProduct(int itemid) {

		String Query = "INSERT into orderitems VALUES (" + itemid + ", 1, " + orderid + ") ;";
		String Query2 ="UPDATE order_info SET total_price = total_price + (SELECT item_price FROM menuitems WHERE item_id = " + itemid + ") * 1 WHERE "
				+ " order_id = " + orderid +";";
		try {
			DBConnection.connection.createStatement().execute(Query);
			DBConnection.connection.createStatement().execute(Query2);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	public ArrayList<ArrayList<String>> listOrder() {
		ResultSet result;
		String a = "";
		orderItems = new ArrayList<ArrayList<String>>();
		
		String Query = "SELECT * FROM orderitems WHERE order_id = " + this.orderid + ";";
		try {
			result = DBConnection.connection.createStatement().executeQuery(Query);

			int sira = result.getMetaData().getColumnCount();
			while (result.next()) {
				ArrayList array = new ArrayList<String>();
				for (int i = 1; i <= sira; i++) {
					
					array.add(result.getString(i) + (i == sira ? "" : ""));
					
				}
				orderItems.add(array);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return orderItems;

	}
	
	public void print() {
		for(int i=0; i < orderItems.size(); i++){
            System.out.println( orderItems.get(i));
        }
	}
	
	public void closeOrder() {
		String Query = "DELETE FROM orderitems WHERE order_id = " + this.orderid + " ;" ;
		String Query2 = "UPDATE order_info SET total_price = 0 WHERE order_id = " + this.orderid + ";";
		try {
			DBConnection.connection.createStatement().execute(Query);
			DBConnection.connection.createStatement().execute(Query2);

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

        public void removeProduct(String item){
            String Query = "DELETE FROM orderitems WHERE item_id = " + MenuItems.getID(item) + " AND order_id = " + this.orderid + " ;";
            try {
			DBConnection.connection.createStatement().execute(Query);

		} catch (SQLException e) {

			e.printStackTrace();
		}
        }
        
	public double getTotalPrice() {
		ResultSet result;
		String a = "";
		double b =0;
		String Query = "SELECT total_price FROM order_info WHERE order_id =" + this.orderid+ ";";
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
	
	public void setTotalPrice(double price) {
		String Query = "UPDATE order_info SET total_price = " + price + " WHERE order_id =" + this.orderid +";";
		
		try {
			DBConnection.connection.createStatement().execute(Query);
			

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
