package RestaurantModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Table extends RestaurantModel {
	private int tableId;
	private boolean available;
	int a = 0;

	public Table(int tableId) {
		this.tableId = tableId;
		this.available = false;

	}

	public int getTableId() {
		ResultSet result;
		String a = "";
		int b = 0;
		String Query = "SELECT table_id FROM tables WHERE table_id = " + tableId + " ;";
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

	public boolean isAvailable() {
		ResultSet result;
		String a = "";
		boolean b = false;
		String string = "1";
		String Query = "SELECT available FROM tables WHERE table_id = " + tableId + " ;";
		try {
			result = DBConnection.connection.createStatement().executeQuery(Query);
			result.next();
			a = result.getString(1);

			if (a.equals(string)) {
				b = true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return b;
	}

//	UPDATE tables set available = 0 where table_id =3;
	public void setAvailable(boolean available) {

		String Query = "UPDATE tables SET available = " + available + " WHERE table_id = " + tableId + ";";
		try {
			DBConnection.connection.createStatement().execute(Query);

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
