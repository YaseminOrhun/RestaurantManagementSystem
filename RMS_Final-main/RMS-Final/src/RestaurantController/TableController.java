package RestaurantController;

import RestaurantModel.*;

public class TableController {
	
	public void changeTableColor(Table table,boolean color) {
		table.setAvailable(color);
	}

}
