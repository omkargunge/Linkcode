package JDBCprogram;

import java.sql.*;

	public class JDBCdelete {

		public static void main(String[] args) throws ClassNotFoundException {

			// JDBC 5 steps - mysql connector add

			// 1. Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Open connection
			try {

				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/javabatch43",
						"root",
						"omkar@2004gunge");

				Statement statement = con.createStatement();

				// Delete student where id = 2
				int result = statement.executeUpdate(
						"DELETE FROM student WHERE id = 2");

				System.out.println("Query Ok " + result + " row affected");

				statement.close();
				con.close();

			} catch (SQLException e) {

				e.printStackTrace();

			}
		}

	}

