import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Utility.DBConnection;


public class Health 
{
DBConnection con=new DBConnection();
public ArrayList gethealthDetails(String disease)
{
	ArrayList al = new ArrayList();
	Statement stmt;
	try {
		stmt = DBConnection.getconnection().createStatement();
		ResultSet rs=stmt.executeQuery("SELECT PROBLEM,TIPS FROM GENERALHEALTHTIPS WHERE PROBLEM='"+disease+"'");
		while(rs.next())
		{
			
					al.add(rs.getString(1));
					al.add(rs.getString(2));
			System.out.println(al.get(0));
			System.out.println(al.get(1));
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println("SELECT PROBLEM,TIPS FROM GENERALHEALTHTIPS WHERE PROBLEM='"+disease+"'");

	return al;
}
}
