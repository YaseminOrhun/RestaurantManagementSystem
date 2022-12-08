package RestaurantController;

import java.util.ArrayList;

import RestaurantModel.*;

public class OrderController {

	public Order createOrder(Table table) {
		Order order = new Order(table.getTableId());
		return order;
	}

	public static void addItem(Order order, int itemid) {
		order.addProduct(itemid);

	}

	public void finishOrder(Order order) {
		ArrayList<ArrayList<String>> arr = order.listOrder();
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < 1; j++) {
				DailyReports.setSolditemnumber(Integer.parseInt(arr.get(i).get(j)),
						Integer.parseInt(arr.get(i).get(j + 1)));

			}
		}
		order.closeOrder();
	}

	public ArrayList<String> listOrder(Order order) {
		ArrayList<ArrayList<String>> arr = order.listOrder();
		ArrayList<String> names = new ArrayList<String>();

		for (int i = 0; i < arr.size(); i++) {
			int id = Integer.parseInt(arr.get(i).get(0));
			names.add(MenuItems.getName(id));
		}
		return names;
	}

	public ArrayList<Integer> listOrderQuantity(Order order) {
		ArrayList<ArrayList<String>> arr = order.listOrder();
		ArrayList<Integer> names = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {
			int id = Integer.parseInt(arr.get(i).get(1));
			names.add(id);
		}
		return names;
	}

	public static double calculate(Order order) {
		return order.getTotalPrice();
	}

}
