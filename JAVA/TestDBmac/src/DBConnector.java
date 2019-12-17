import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
//	driverを変数に代入
	private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
//	mysqlで使うデータ ベースの宣言　localhost の自分のtestdbって意味＆以降はオプション
	private static String user = "root";
//	mysqlのアカウント
	private static String password = "root";
//	上のアカウントのパスワード

	public Connection getConnection() {
//		mysql接続メソッド
		Connection con = null;
//		状態を初期化　この後のreturnで値が帰ってくる
		try {
//			java言語以外でのエラーをここで捕まえる
			Class.forName(driverName);
			con = DriverManager.getConnection(url, user, password);
//			ここでエラーが無ければconにログインして値が帰る
		} catch (ClassNotFoundException e) {
//			classがなかった時の例外
			e.printStackTrace();
		} catch (SQLException e) {
//			データ ベース処理に関する例外
			e.printStackTrace();
		}
		return con;
	}

}
