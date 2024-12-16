import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/code2db";
		String userName = "root";
		String password = "";
		try {
			//driverClass//msql connectoer J.jar
			Connection conn = DriverManager.getConnection(url, "root", "");
			System.out.println("connected");
		} catch (SQLException e) {
			System.out.println("Cannot be connected");
			e.printStackTrace();
		}
	}

}
