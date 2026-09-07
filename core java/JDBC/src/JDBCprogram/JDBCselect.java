package JDBCprogram;

import java.sql.*;
public class JDBCselect {


	public static void main(String[] args) throws ClassNotFoundException {

	        // 1. Load the driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        try {
	            // 2. Open connection
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/javabatch43",
	                    "root",
	                    "omkar@2004gunge"
	            );

	            // 3. Create Statement
	            Statement statement = con.createStatement();

	            // 4. Execute SELECT query
	            ResultSet result = statement.executeQuery(
	                    "SELECT * FROM student"
	            );

	            // 5. Display data
	            while (result.next()) {

	                int id = result.getInt(1);
	                String name = result.getString(2);
	                double marks = result.getDouble(3);
	                int age = result.getInt(4);

	                System.out.println(
	                        "ID: " + id +
	                        " Name: " + name +
	                        " Marks: " + marks +
	                        " Age: " + age
	                );
	            }

	            // Close resources
	            result.close();
	            statement.close();
	            con.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

