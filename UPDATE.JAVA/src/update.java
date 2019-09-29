import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TENDERSYSTEM","CRAZYminds1@");//jdbc connection for this username and paswword
			Statement st = conn.createStatement();
			st.executeUpdate("UPDATE ADMIN SET username ='prakash' WHERE password = 'type675'");//update details of admin 
			st.executeUpdate("UPDATE CONTRACTOR SET gender ='male' WHERE usernmae = 'vijay'");//update details of contractor
			st.executeUpdate("UPDATE OFFICIALS SET department ='construction' WHERE name= 'murthy'");//update details of officials
			
			conn.close();
		}
		catch (Exception e) {
			System.err.println("Got an exception! ");

		}
	}

}



