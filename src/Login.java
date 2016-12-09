import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Utility.DBConnection;

public class Login {

	DBConnection db= new DBConnection();
	public ArrayList getRegisterDetails(String eaddress,String pword)
	{
		ArrayList info = new ArrayList();
		try 
		{
			Statement stmt=DBConnection.getconnection().createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM REGISTRATIONDETAILS WHERE emailaddress='"+eaddress+"'and password='"+pword+"'");
			System.out.println("SELECT * FROM REGISTRATIONDETAILS WHERE emailaddress='"+eaddress+"'and password='"+pword+"'");
			if(rs.next())
			{
				info.add(rs.getString(1));
				info.add(rs.getString(2));
				info.add(rs.getString(3));
				info.add(rs.getString(4));
				info.add(rs.getString(5));
				info.add(rs.getString(6));
				info.add(rs.getString(7));	

			} 
			System.out.println(info.size());
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return info;
}
}
