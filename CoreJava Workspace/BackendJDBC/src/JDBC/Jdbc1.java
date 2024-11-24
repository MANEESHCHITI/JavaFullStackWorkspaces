package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		Statement st=con.createStatement();
		int n=st.executeUpdate("insert into Jdbc1 values(1,'abcd',100)");
		
		if(n>0)
		{
			System.out.println(n+":row(s) inserted");
		}
		else {
			System.out.println("something went Wrong!!!");
		}
	} 
	catch (Exception e) {
		System.out.println(e);
	}
	}


}

