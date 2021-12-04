package finalmethod;                  //IMPOTANT:in java final key word helps us to prevent others from accessing our data
                                                //changing  the integer value,extending from our class,accessing data from our methods.
                                             //this too helps java to be a safe programming language

class C {
	
	final public void show() {
		
		System.out.println("in C");
	}
	
}

class D extends C{
	 public void show() {
			
		System.out.println("in D");
	}
	

}


public class FinalMethod {
	

	public static void main(String[] args) {
		
		D obj = new D();  // the only thing D is doing is extending to our class ,overriding our method and accessing its data 
		obj.show();       // printing it out in their name and getting all the credit.                     
                         //extending from our class is fine,but over riding our method in their name is note okay. 
		                 // to avoid this we make our  method final.
	}

}
