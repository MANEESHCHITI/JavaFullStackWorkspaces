package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {

	
	
	public  boolean getDbConnection(String usernmae1,String password1) throws ClassNotFoundException, SQLException {
		
		
		boolean status=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		
		PreparedStatement ps=con.prepareStatement("select *from Admin1 where username=? and password=?");
		ps.setString(1,usernmae1);
		ps.setString(2,password1);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			status=true;
		}
		System.out.println("return up stat");
		return status;
		
		
	}

}