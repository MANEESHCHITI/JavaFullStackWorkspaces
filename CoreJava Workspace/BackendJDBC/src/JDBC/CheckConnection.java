package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckConnection {  
	
	public static void main(String args[])
	{
		Connection con=LoadingClass.load();
		Student s=new Student();
		
		//s.m1(con);
//s.insert(con);
	//s.selectById(con);
		//s.update(con);
		//s.delete(con);
		
		//s.queryy(con);


	}

}
class Student{
//	public void m1(Connection con){
//		
//		try {
//			PreparedStatement ps=con.prepareStatement("insert into Jdbc1 (st_no,st_name,st_marks) values(?,?,?)");
//			ps.setInt(1,2);
//			ps.setString(2,"maneesh");
//			ps.setInt(3, 100);
//			int n=ps.executeUpdate();
//			
//			if(n>0)
//			{
//				System.out.println(n+" "+"rows inserted");
//			}
//			else {
//				System.out.println("invalid");
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}
	
//	public void insert(Connection con) {
//		try {
//			PreparedStatement ps=con.prepareStatement("insert into Jdbc1 (st_no,st_name,st_marks) values(3,'ram',95)");
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public  void update(Connection con) {
//		
//		try {
//			PreparedStatement ps=con.prepareStatement("update Jdbc1 set st_name='ram' where st_no='2' ");
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	
//	public  void delete(Connection con) {
//		
//		try {
//			PreparedStatement ps=con.prepareStatement("delete from Jdbc1 where st_no='2' ");
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	
	public void selectById(Connection con){
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from Jdbc1 where st_no=3");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void queryy(Connection con){
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from Jdbc1");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
}
	

	



}