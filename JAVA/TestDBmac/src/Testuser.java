
public class Testuser {
	public static void main(String [] args) {
	TestUserDAO dao = new TestUserDAO();

	//dao.select("hanako");

	dao.insert(4, "katuo", "123");
}
}