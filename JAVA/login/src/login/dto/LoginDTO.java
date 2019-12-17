package login.dto;
public class LoginDTO {
//	DAOクラスでSELECTされた値を格納するためのクラス
	private int id;
	private String name;
	private String password;
//	フィールドで格納する値を宣言

	public int getId(){
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
//	ゲッターセッターを用いて値を習得
}
