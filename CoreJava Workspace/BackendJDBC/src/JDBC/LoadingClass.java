package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class LoadingClass {
	public static Connection load()
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return con;
	}
}

