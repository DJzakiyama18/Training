public class Driver{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {




//System.out.println( wa(52));
long count =wa(52) /(wa(5)*wa(47));
System.out.println(count);
//		String msg = "";
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			msg = "ドライバーのロードに成功しました";
//		} catch (ClassNotFoundException e) {
//			msg = "ドライバーのロードに失敗しました";
//		}
//		System.out.println(msg);
//
//	}
    }
	static long wa(int d) {
			//long v= d*--d;
			//System.out.println(v);
			long total =1;
		for(int i=d ;i>0; i--) {
			total *=i;
		}
		return total;
		}
}


