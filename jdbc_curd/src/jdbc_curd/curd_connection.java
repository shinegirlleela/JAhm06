package jdbc_curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class curd_connection {
	
	static Connection cn;
	
	public static final String url="jdbc:mysql://localhost:3306/student";
	public static final String username="root";
	public static final String password="Lee!@#123";
	
	public static Connection getConnetion() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn = DriverManager.getConnection(url, username, password);
			System.out.println(cn);
			
		}catch(ClassNotFoundException | SQLException e){
			
			e.printStackTrace();
			
		}
			
		return (cn);		
	}

}
