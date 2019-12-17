package sns.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

	private String driver = "com.mysql.jdbc.Driver";

	private String url = "jdbc:mysql://localhost/sns";

	private String user = "root";

	private String password = "root";


	public Connection getConnection() {

		Connection con = null;

		try {
			Class.forName(driver);
				con = (Connection) DriverManager.getConnection(url,user,password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return con;
	}

}
