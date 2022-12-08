package RestaurantModel;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class DBConnection {
	 
	   private static final String URL = "jdbc:mysql://sqlyigid.cc5ar8icwkh1.eu-central-1.rds.amazonaws.com:3306/cs320?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	    private static final String USERNAME = "admin";
	    private static final String PASSWORD = "yigitsql123";

	    public static Connection connection = null;


	    public static void establishConnection() {
	        try {
	            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void closeConnection() {
	        try {
	            if (connection != null) {
	                connection.close();
	            }
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }

    
}
            
             
