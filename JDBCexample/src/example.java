 import java.sql.*;
 import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class example {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TENDERSYSTEM","CRAZYminds1@");
			Scanner sc = new Scanner(System.in);
			String username = sc.next();
			String password = sc.next();
			PreparedStatement ps=conn.prepareStatement("INSERT INTO ADMIN(ADMIN_username,password) VALUES(?,?)");
			ps.setString(1,username);
			ps.setString(2, password);
			int status=ps.executeUpdate();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT name FROM ADMIN");
			while(rs.next())
			{
				System.out.println(rs.getString("username"));
			}
			conn.close();
		}

		catch (Exception e) {
			System.err.println("Got an exception! ");
			
		}
	}

	}
