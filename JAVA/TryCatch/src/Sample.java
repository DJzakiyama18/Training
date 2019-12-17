public class Sample  {
	String val = "a";
	public static void main(String [] args)   {





			try {
            int i = 10 / 2; // 例外発生
            System.out.println(i); // 実行されない
			}catch (Exception e) {
				System.out.println("例外が発生しました");
				// TODO: handle exception
			}



		try {
			System.out.println(Ttrows.test(10, 0));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		Function r  = (val) -> {
			 System.out.println(val);
		};
		r.test("yy");
	}
	}
		interface Function{
			void test(String val);
		}



