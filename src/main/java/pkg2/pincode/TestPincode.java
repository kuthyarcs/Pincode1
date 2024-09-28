package pkg2.pincode;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPincode {

	public static void main(String[] args) throws SQLException {
		String host="jdbc:mysql://localhost:3306/smvitm1";
		String username="root";
		String password="root";
		Connection conn1=DriverManager.getConnection(host,username,password);
		Statement stmt1=conn1.createStatement();
		String query1="select * from pincodes";
		ResultSet rs1=stmt1.executeQuery(query1);
		
		List<Integer>pincodes=new ArrayList<>();
		List<String>location=new ArrayList<>();
		List<String>town=new ArrayList<>();
		List<String>district=new ArrayList<>();
		List<String>state=new ArrayList<>();
		List<String>country=new ArrayList<>();
		
		while(rs1.next()) {
			pincodes.add(rs1.getInt(2));
			location.add(rs1.getString(3));
			town.add(rs1.getString(4));
			district.add(rs1.getString(5));
			state.add(rs1.getString(6));
			country.add(rs1.getString(7));
		}
		
		System.out.println(pincodes);
		System.out.println(location);
		System.out.println(town);
		System.out.println(district);
		System.out.println(state);
		System.out.println(country);
		
	}

}
