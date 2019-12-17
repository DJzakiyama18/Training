public class Driver{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO 自動生成されたメソッドスタブ
		String msg = "";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ドライバーのロードに成功しました";
		} catch (ClassNotFoundException e) {
			msg = "ドライバーのロードに失敗しました";
		}
		System.out.println(msg);

	}
}
