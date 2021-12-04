package dynamicMethodDispatch;

class A{
	public void show() {
		System.out.println("in A");
		
	}
	
}

class B extends A{
	
	public void show() {
		
		System.out.println("in B");
	}
	
public void config() {
		
		System.out.println("config");
	}
	
	
	
}

class C extends A{
    public void show() {
    	
    	System.out.println("in C");
    }
}  



public class DynamicMethodDispatch {

	public static void main(String[] args) {
				A obj = new A();
				obj.show();
				
				obj = new B();					//A obj1 = new B();
				obj.show();						// obj1.show();
								  //equal to			              //as A is their super class
			    obj = new C();                 //A obj2 = new C();    //so we can call an object of B with respect to A
				obj.show();					   //obj2.show();         //this helps us to call the same method of different objects A,B,C
																	  //this is called dynamic method dispatch
			                                                          //This is a run time polymorphism. EXPLAINED IN NOTEBOOK
				
                                                                      				
				
				//what if we call the object config in B.it will show an error as A has no idea what config is.
	}

}
