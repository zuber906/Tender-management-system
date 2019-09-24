package myjdbc;

import java.sql.Connection;//used together with sqlAdapter and sql command to increase the performance
import java.sql.DriverManager;// containing a database connection URL
import java.sql.SQLException;//import required packages

public class JDBC {  // create a class file

	public static void main(String[] args) throws ClassNotFoundException, SQLException { //throws exception could be added,so that caller has to be handle it
	  Class.forName("oracle.jdbc.driver.OracleDriver");//import package for sql
				Connection conn=null;
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","TENDERSYSTEM","CRAZYminds1@");// password details are given which will given for insallating the oracle 
				if(conn!=null) 
					System.out.println("established successfully");
					
				else 
			System.out.println("Notconnected");
				
     }

}
