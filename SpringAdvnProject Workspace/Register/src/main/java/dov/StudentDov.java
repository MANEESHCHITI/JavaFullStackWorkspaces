package dov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import modal.StudentModal;

public class StudentDov {

	String status="failure";
	public String insertData(StudentModal sm) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		PreparedStatement ps=con.prepareStatement("insert into student (username, password, First_name, Last_name, Mob_no,"
				+ " email_id, EngBranch, Yearofpass, course, college, gender )values(?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1,sm.getUsername());
		ps.setString(2, sm.getPassword());
		ps.setString(3, sm.getFirstname());
		ps.setString(4, sm.getLastname());
		ps.setString(5, sm.getMobile());
		ps.setString(6, sm.getGmail());
		ps.setString(7, sm.getBranch());
		ps.setString(8, sm.getYear());
		ps.setString(9, sm.getCourse());
		ps.setString(10, sm.getCollege());
		ps.setString(11, sm.getGender());
		
		int n=ps.executeUpdate();
		
	
		if(n>0) {
			System.out.println(n+": row inserted");
			status="success";
		}
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return status ;
		
	}
	public  void update(Connection con) {
	
	try {
		PreparedStatement ps=con.prepareStatement("update Jdbc1 set st_name='ram' where st_no='2' ");
		ps.executeUpdate();
	} catch (Exception  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}
