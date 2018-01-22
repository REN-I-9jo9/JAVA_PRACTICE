package Practice9;

import java.sql.*;

public class _1_
{ 
	public static void main(String[] args) 
	{ 
		try
		{ 
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); // Load the JDBC driver
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://db2.mdb");//Connect to the database
			System.out.println("資料庫連線測試成功！");

			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from students where stud_sex='M' and stud_addr='彰化'");       
			while(rs.next())
			{
				String stud_no=rs.getString(1);
				String stud_name=rs.getString(2);
				String stud_sex=rs.getString("stud_sex");
				String stud_addr=rs.getString("stud_addr");
				System.out.println(stud_no+","+stud_name+","+stud_sex+","+stud_addr); 
			}
			con.close(); 
		} 
		catch(ClassNotFoundException e) 
		{ 
			System.out.println("找不到驅動程式類別"); 
			e.printStackTrace(); 
		} 
		catch(SQLException e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
}