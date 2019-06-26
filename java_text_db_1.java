package java_text_db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class java_text_db_1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_text_db_1?serverTimezone=UTC" , "root", "Zhy06150412252814732");
			System.out.println(conn+"   "
					+ "数据库连接成功");
			Statement stmt = conn.createStatement();
			/*ResultSet rs=stmt.executeQuery("select*from UserTb1");
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("passsword");
				System.out.println(id+" "+username+" "+password);
			}*/
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

