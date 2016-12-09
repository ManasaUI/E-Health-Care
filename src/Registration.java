
import java.sql.SQLException;
import java.sql.Statement;

import Utility.DBConnection;

public class Registration {

	DBConnection db= new DBConnection();
	public void setNewRegistration(String fname,String lname,String dob,String eaddress,String pnumber,String add,String pword)
	{
		try 
		{
			System.out.println("INSERT INTO REGISTRATIONDETAILS VALUES('"+fname.trim()+"','"+lname.trim()+"','"+dob.trim()+"','"+eaddress.trim()+"','"+pnumber.trim()+"','"+add.trim()+"','"+pword.trim()+"') ");
			Statement stmt=DBConnection.getconnection().createStatement();
			stmt.executeUpdate("INSERT INTO REGISTRATIONDETAILS VALUES('"+fname.trim()+"','"+lname.trim()+"','"+dob.trim()+"','"+eaddress.trim()+"','"+pnumber.trim()+"','"+add.trim()+"','"+pword.trim()+"') ");
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
