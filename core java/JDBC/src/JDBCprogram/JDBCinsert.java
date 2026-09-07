package JDBCprogram;
import java.sql.*;

public class JDBCinsert {

	public static void main(String[] args) throws ClassNotFoundException{
		
		//JDBC 5 steps -mysqlconnector-add
		//1.load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	//	2.open connection =-dburl -database url
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch43","root","omkar@2004gunge");
			Statement statement = con.createStatement();
			int result = statement.executeUpdate("INSERT INTO student VALUES (2, 'omkar',88.99,22)");
			System.out.println("Query Ok "+result+" row affected");
			statement.close();
			con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
