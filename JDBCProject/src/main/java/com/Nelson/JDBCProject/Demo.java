package com.Nelson.JDBCProject;
import java.sql.*;
public class Demo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

		String sql = "SELECT * FROM Heep.Student";
		String url = "jdbc:mysql://localhost:3306/Heep";
		String userName = "root";
		String password = "password123A$";
		Connection con = DriverManager.getConnection(url, userName,password);
Statement st = con.createStatement();
ResultSet resultSet = st.executeQuery(sql);
resultSet.next();
int value = resultSet.getInt(1); // This line throws "Before start of result set"
int value1 = resultSet.getInt(2); // This line throws "Before start of result set"

   System.out.println(value);
   System.out.println(value1);
  
	}

}
