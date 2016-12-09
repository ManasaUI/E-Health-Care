import java.sql.SQLException;
import java.sql.Statement;

import Utility.DBConnection;


public class Update 
{
DBConnection con=new DBConnection();
public void updateDetails(String fname,String lname,String dob,String eaddress,String pnumber,String add,String pword)
{
	
		try
		{
		Statement stmt=DBConnection.getconnection().createStatement();
		
	   int i = stmt.executeUpdate("UPDATE REGISTRATIONDETAILS SET firstname='"+fname.trim()+"', lastname='"+lname.trim()+"',dateofbirth='"+dob.trim()+"',phonenumber='"+pnumber.trim()+"', address='"+add.trim()+"',password='"+pword.trim()+"'where emailaddress='"+eaddress.trim()+"'");
	   System.out.println("UPDATE REGISTRATIONDETAILS SET firstname='"+fname.trim()+"', lastname='"+lname.trim()+"',dateofbirth='"+dob.trim()+"',phonenumber='"+pnumber.trim()+"', address='"+add.trim()+"',password='"+pword.trim()+"'where emailaddress='"+eaddress.trim()+"'");
	   System.out.println("The I value is" +i);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
