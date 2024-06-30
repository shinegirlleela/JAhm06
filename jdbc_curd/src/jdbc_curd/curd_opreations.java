package jdbc_curd;

import java.sql.*;
import javax.sql.*;
import java.util.*;

public class curd_opreations {
	
	static Statement st;
	static Connection cn;
	
	public curd_opreations() {
		
		cn = curd_connection.getConnetion();
		
		try {
			
			st = cn.createStatement();
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
	
	}
	
	public static void insertData(int Enrollno, String Name, String Stream) {
		
		String squery = "insert into Student values('" + Enrollno + "','" + Name + "','" + Stream + "')";
		// System.out.println(squery);
		
		try {
			int r = 	st.executeUpdate(squery);
			System.out.print(r);
			
				if(r>0)
				{
					System.out.println("Record Inserted SuccessFully ..");
				}
			} 
			catch( SQLIntegrityConstraintViolationException sq)
			{
				System.out.println("cannot duplicate enrollment number..");

			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void deleteData() {
		
		String sq = "delete from Student where Enrollno = 10";
		
		try {
			
			int k = st.executeUpdate(sq);
			
			if(k>0)
			{
				System.out.println(" Recored Deleted ...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	
		public static void updateData(int  Enrollno, String Name, String Stream) {
		
		String sq = "update Student set Name = '"+Name+"',Stream = '"+Stream+"' where Enrollno = "+Enrollno;
		
		try {
					
			int l = st.executeUpdate(sq);
			
			if(l>0)
			{
				System.out.println("Record Updateds Successfulyy ..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		public static void searchData(String Name) {
			
			String sq = "select * from Student where Name = '"+Name+"'";
			
			try {
				
				ResultSet k = st.executeQuery(sq);
				
				while(k.next())
				{
					System.out.println(k.getString(1)+" "+k.getString(2)+" "+k.getString(3)+" ");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
			
		

	public static void get_data() {
	
		String sq = "select * from Student";
		try {
			ResultSet r = st.executeQuery(sq);
			
			while(r.next())
			{
				System.out.println(r.getString(1)+" " + r.getString(2) +" " + r.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

