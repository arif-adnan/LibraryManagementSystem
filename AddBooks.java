
package AA_LibraryManagement;

import AA_LibraryManagement.DbC;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddBooks {
public static int save(String callno,String name,String author,String publisher,int quantity){
	int status=0;
        int issued = 0;
	try{
		Connection con = DbC.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into books(callno,name,author,publisher,quantity,issued) values(?,?,?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setString(4,publisher);
		ps.setInt(5,quantity);
                ps.setInt(6,issued);
		status = ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
