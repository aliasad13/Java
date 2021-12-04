package re;

interface A{
	
	void hello();             // if we are declaring a method in parent class
	default void show() {     //it must be defined in child class
		//declaring methods can only be done to abstract methods and if that happen it must have a abstract class
		
		System.out.println("in A");
	}
}


class C implements A{
public void hello() {
	
}

	
	}
	
	
		
	
	







public class Rere {

	public static void main(String[] args) {
	
		C obj =new C();
		obj.show();
		
		
	}

}
