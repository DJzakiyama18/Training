package sns.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sns.dto.LoginDTO;
import sns.util.DBConnector;

public class LoginDAO {

	public LoginDTO getLoginDate(String user_name, String user_pass)  {

		DBConnector db = new DBConnector();

		LoginDTO dto = new LoginDTO();

		String sql = "select * from login_user "
				+ " where user_name = ? and user_pass = ?";

		try (Connection con = db.getConnection()){
			PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, user_name);
				ps.setString(2, user_pass);

				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					dto.setUser_name(rs.getString("user_name"));
					dto.setUser_pass(rs.getString("user_pass"));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
}

}
