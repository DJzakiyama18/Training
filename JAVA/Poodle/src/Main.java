  class A1{

	void hello() {
		System.out.println("初めまして");
	}

}

class A2 extends A1{

	void hello() {
		System.out.println("宜しくね");
	}
	void tap() {
		System.out.println("タップ");
	}


}
public class Main {
//	static String a ;
//	static Integer b;
//	static Character c;
//	static Short d;
//	static Double e;
//	static Boolean f;
	public static void main(String args[]) {
		A1	a = new A2();
		a.hello();
		String[] b = new String[2];

		System.out.println(b[0].concat("3"));



//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
}
}