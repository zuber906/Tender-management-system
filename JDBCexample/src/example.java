import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class example {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TENDERSYSTEM","CRAZYminds1@");
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO ADMIN VALUES ('surya roa','dash435')");//admin login details
			st.executeUpdate("INSERT INTO CONTRACTOR VALUES ('vijay surya roa','surya roa','dash435','surya1546@gmail.com','9987656655','male')");//as contractor credentials will be lenghtjy because to acess admin details ,might be some maintain privacy
			st.executeUpdate("INSERT INTO OFFICIALS VALUES('vijay surya roa','assistant engineer','transport')");//officials means who are yet to work or involve in only known these details
			conn.close();
		}
		catch (Exception e) {
			System.err.println("Got an exception! ");
			
		}
	}

}
