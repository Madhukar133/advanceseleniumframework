package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class example {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Driver driverRef= new Driver();
		
		DriverManager.registerDriver(driverRef);
		 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/trainer_details","root","root");
		 Statement state=conn.createStatement();
		 String query="select * from trainer";
		 ResultSet result=state.executeQuery(query);
		 
		 while(result.next()) {
			 System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
		 }
		 conn.close();
	}

}
