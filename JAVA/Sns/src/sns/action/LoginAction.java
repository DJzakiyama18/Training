package sns.action;

import com.opensymphony.xwork2.ActionSupport;

import sns.dao.LoginDAO;
import sns.dto.LoginDTO;

public class LoginAction extends ActionSupport  {

	private String user_name;

	private String user_pass;

	public String execute() {
		LoginDAO dao = new LoginDAO();

		LoginDTO dto = new LoginDTO();

		String result = ERROR;

		dto = dao.getLoginDate(user_name, user_pass);

		if(dto.getUser_name().equals(user_name) && dto.getUser_pass().equals(user_pass)) {
			result = SUCCESS;
		}

		return result;

	}







	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}




}
