package staticNonstatic;

public class Static {
 void nonStaticTest() {
		System.out.println("nonstatic");
	}
	public static void staticTest() {
		System.out.println("static");
	
	}
	public static void main(String[] args) {
		Static staticObject= new Static();
		staticObject.nonStaticTest();
		staticTest();
		
	}

}
