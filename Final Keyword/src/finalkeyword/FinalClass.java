package finalkeyword;

final class A{
	
	public void show() {
		
		System.out.println("in B");
		
	}
}

class B extends A{
								//now someone extends our class and change the credits to their name.
public void show()	{           //to avoid this we can stop other classes to extend from our class using final class
	
	System.out.println("in B");
}	
	
}


public class FinalClass {

	public static void main(String[] args) {
		

	}

}
