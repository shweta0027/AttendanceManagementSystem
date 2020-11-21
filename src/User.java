import java.sql.*;
import javax.swing.JFrame;
public class User extends JFrame 
{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	User()
	{
            
		try{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","root","");
                        pst=con.prepareStatement("select * from login where uname=? and pwd=?");
			
		   }
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
      
	public Boolean checkLogin(String uname,String pwd)
	{
		try {
                       
			pst.setString(1, uname); 
			pst.setString(2, pwd);   			
			rs=pst.executeQuery();
			if(rs.next())
			{
				
				return true;
			}
			else
			{
				return false;
			}
		} catch (Exception e) {
			
			System.out.println("error while validating"+e);
			return false;
		}
}

    
}

 



 

