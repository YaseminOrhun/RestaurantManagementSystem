package RestaurantController;

import RestaurantModel.*;

public class DailyReportController {
	
	public static double calculateExpense() {
		return DailyReports.getDailyIncome() *0.6;

	}
	
	public static double calculateIncome() {
		return DailyReports.getDailyIncome();
	}
	
	public static double calculateTips() {
		return DailyReports.getDailyIncome()* 0.1;
	}
	
	public  static double calculateRevenue() {
		return calculateIncome()-calculateExpense();
	}
}
