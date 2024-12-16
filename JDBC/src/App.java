import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/code2db";
		String userName = "root";
		String password = "";
        final List<String> retList = new ArrayList();
		try {
			//driverClass//msql connectoer J.jar
			Connection conn = DriverManager.getConnection(url, "root", "");
			System.out.println("connected");
//			String sql = "create table if not exists students (id int primary key auto_increment,name varchar(40),email varchar(60))";
			String sql = "insert into students (name,email) values ('Zaw Zaw','zawzaw@gmail.com')";
			String sql2 = "insert into students (name,email) values ('Ko Ko','koko@gmail.com')";
			String sql3 = "delete * from ";
			retList.add(sql);
			retList.add(sql2);
			Statement stmt =  conn.createStatement();
			System.out.println(retList);
			for (String j : retList) {
				System.out.println(j);
				stmt.execute(j);
			}
			System.out.println("success ");
		} catch (SQLException e) {
			System.out.println("Cannot be connected");
			e.printStackTrace();
		}


	}

}
