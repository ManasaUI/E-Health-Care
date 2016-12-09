import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




import Utility.DBConnection;
import oracle.net.aso.e;


public class Firstaid 
{
DBConnection con=new DBConnection();
public ArrayList getfirstaidDetails(String fit)
{
	ArrayList al =new ArrayList();
	Statement stmt;
	 try {
		stmt=DBConnection.getconnection().createStatement();
		ResultSet rs=stmt.executeQuery("SELECT FIRSTAIDPROBLEM,FIRSTAIDTIPS FROM FIRSTAIDTIPSDETAILS WHERE FIRSTAIDPROBLEM='"+fit+"'");
		while(rs.next())
		{
			al.add(rs.getString(1));
			al.add(rs.getString(2));
			System.out.println(al.get(0));
			System.out.println(al.get(1));
		}
	} 
	 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return al;
}
}
