package JDBCcollablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class collab {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch43","root","omkar@2004gunge");
		CallableStatement statement=connection.prepareCall("call test()");
		ResultSet set=statement.executeQuery();
		while(set.next()) {
			System.out.println(set.getInt(1)+"||"+set.getString(2)+"||"+set.getDouble(3));
		}
		connection.close();
		statement.close();
		
	}
}
