package dov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import modal.CourseModal;

public class CourseDov {
	String status="failure";

	public String insertData(CourseModal cm) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		PreparedStatement ps=con.prepareStatement("insert into course (Course_name,Course_fee,Course_duration,location)values(?,?,?,?)");
		ps.setString(1, cm.getCourse());
		ps.setString(2, cm.getFee());
		ps.setString(3, cm.getDuration());
		ps.setString(4, cm.getLocation());
		int n=ps.executeUpdate();
			if(n>0) {
				System.out.println("1 row inserted");
				status= "success";
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
		
	}
}
