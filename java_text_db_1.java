package java_text_db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class java_text_db_1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_text_db_1?serverTimezone=UTC" , "root", "1");
                       /*这里用来输入使用的数据库地址，MySQL一般是3306，由于欧美与中国有时间的差距，所以需要在数据库文件名后添加"?serverTimezone=UTC"
		       来将时间设置为标准时间，不然会导致数据库连接错误。
		       */
			System.out.println(conn+"   "+ "数据库连接成功");
			/*此语句用来测试是否连接成功
			*/
			Statement stmt = conn.createStatement();
			ResultSet rs=stmt.executeQuery("select*from UserTb1");
			 /*此语句用来操纵sql语句。
			 */
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("passsword");
				System.out.println(id+" "+username+" "+password);
			}/*此语句为为数据库键入的信息*/
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

