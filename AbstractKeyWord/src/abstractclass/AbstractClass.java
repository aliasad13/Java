package abstractclass;

abstract class Humans{  //abstract class
	
	public abstract void breath() ;    //abstract method must not be defined.//it must have an abstract class
	
	public void eat() {
		
		
		
	}
	
}

class Men extends Humans{
	
	public void breath() {            //when we extend an abstract class its compulsory that its abstract method must be defined 
									  //in the subclass				
		
	}
	
	
}
public class AbstractClass {

	public static void main(String[] args) {
		

	}

}
