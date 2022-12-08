package RestaurantController;

import RestaurantModel.*;

public class PaymentController {
	
	
	
	public static double payAll(Order order) {
		return order.getTotalPrice();
	}
	
	// Double
	//degiştir burayı...	
	public static double paySeperately(double amount, Order order) {
		double a = order.getTotalPrice();
		if (a == amount) {
			payAll(order);
		}
		double newprice =a-amount;
		order.setTotalPrice(newprice);
		
		return newprice;
	}
	
	
}
	
