//package dov;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
//import modal.FacultyTableModal;
//
//public class FacultyTableDov {
//
//	
//	public List<FacultyTableModal> retrivetable() {
//		
//		List<FacultyTableModal> facdata=new ArrayList<>();
//		
//		try {
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
//			
//			PreparedStatement ps=con.prepareStatement("select * from faculty");
//			ResultSet rs=ps.executeQuery();
//			
//					System.out.println("before while");
//			while(rs.next()) {
//					System.out.println("entered while");
//				String tfirstname=rs.getString(2);			
//				String tlastname=rs.getString(3);	
//				String tgender=rs.getString(10);
//				long tmobile=rs.getLong(4); 
//				String tmail=rs.getString(5);
//				int tyear=rs.getInt(6);
//				String tcourse=rs.getString(7);
//				
//				FacultyTableModal ftm=new FacultyTableModal(tfirstname,tlastname,tgender,tmobile,tmail,tyear,tcourse);
//				facdata.add(ftm);
//	
//			}
//			
//		}
//		catch(Exception e) {
//		}
//		return facdata;
//
//	}
//	
//}
