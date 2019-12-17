import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {
		String name = "";
		String password = "";
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		public void select(String name) {


			String sql = "select * from test_table where user_name=? ";

			try {
				PreparedStatement  ps = con.prepareStatement(sql);
				ps.setString(1,  name);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					System.out.println(rs.getString("user_id"));
					System.out.println(rs.getString("user_name"));
					System.out.println(rs.getString("password"));
				}else {System.out.println("そのデータは存在しません");}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
}
		public void insert(int user_id, String name, String password ) {
			String sql = "insert into test_table values (?,?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, user_id);
				ps.setString(2, name);
				ps.setString(3, password);
				int i = ps.executeUpdate();
				if(i>0) {
					System.out.println(i + "件登録されました");
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try {
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
