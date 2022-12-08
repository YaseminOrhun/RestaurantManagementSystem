package RestaurantController;

import RestaurantModel.DBConnection;
import RestaurantModel.DailyReports;
import RestaurantModel.MenuItems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import RestaurantModel.DBConnection;
import RestaurantModel.Order;
import RestaurantModel.Table;

class TestController {
	DBConnection conn = new DBConnection();

	@BeforeEach
	public void Before() {

		conn.establishConnection();
	}

	@AfterEach
	public void After() {
		conn.closeConnection();
	}

	@Test
	void addProductTest() {
		ArrayList<String> arr = new ArrayList<String>();
		Table table = new Table(1);
		Order ord = new Order(1);
		OrderController rcont = new OrderController();
		rcont.addItem(ord, 1);
		arr = ord.listOrder().get(0);
		assertEquals("1", arr.get(0));
	}

	@Test
	void finishOrderTest() {
		Table table = new Table(1);
		boolean a = table.isAvailable();
		Order ord = new Order(1);
		OrderController rcont = new OrderController();
		rcont.finishOrder(ord);
		boolean b = table.isAvailable();
		assertEquals(a, b);

	}
	
	@Test
	void listOrderTest() {
		Table table = new Table(1);
		Order ord = new Order(1);
		OrderController rcont = new OrderController();
		rcont.addItem(ord, 1);
		rcont.addItem(ord, 1);
		rcont.addItem(ord, 1);
		ArrayList<String> arr = new ArrayList<String>();
		arr = rcont.listOrder(ord);
		assertEquals(arr.get(0),"Hamburger");
		assertEquals(arr.get(1),"Hamburger");
		assertEquals(arr.get(2),"Hamburger");
	}

	@Test
	void listOrderQuantityTest() {
		Table table = new Table(1);
		Order ord = new Order(1);
		OrderController rcont = new OrderController();
		rcont.listOrderQuantity(ord);
		rcont.addItem(ord, 1);
		int a = ord.getQuantity(1);
		assertEquals(1,a);
		
	}
	
	@Test
	void CalculateTest() {
		
		Order ord = new Order(9);
		OrderController rcont = new OrderController();
		rcont.addItem(ord, 1);
		ord.addProduct(1);
		ord.removeProduct("Hamburger");
		double dbl = rcont.calculate(ord);
		double price = ord.getTotalPrice();
		assertEquals(dbl , price);
		
		
	} 
	
	 @Test
	 void menuItemsTest() {
		 MenuItems mni= new MenuItems("Hamburger",25,15,1);
		 String name = MenuItems.getName(1);
		 int id = MenuItems.getID("Hamburger");
		 double price = MenuItems.getPrice("Hamburger");
		 double cost = mni.getCost();
		 int type = MenuItems.getItem_type(1);
		 assertEquals("Hamburger", name);
		 assertEquals(25, price);
		 assertEquals(15, cost);
		 assertEquals(1, id);
		 assertEquals(1, type);
	 }
	
	 @Test 
	 void dailyReportTest() {
		DailyReports report = new DailyReports();
		double dailyy = report.getDailyIncome();
		double daily = DailyReportController.calculateIncome();
		assertEquals(daily , dailyy);
	 }
	 
	 @Test 
	 void TableTest() {
		
		 Table table = new Table(1);
		 int tableid = table.getTableId();
		 table.setAvailable(false);
		 boolean bool = table.isAvailable();
		 assertEquals(tableid , 1);
		 assertEquals(false , bool);
	 }
	
	
	
}
