package functinalinterfaceAndlambdaexpression;

interface Abc{
	
void show();
}
public class FunctionalInterface {

	public static void main(String[] args) {              
		
        Abc obj = () ->{						//this is an lambda expression and can be used only in functional or single abstract method interface 
        										//lambda expressions were defined only after java 1.8.
        										//a functional interface is an interface that has only one method.
        	System.out.println("show");            
        	
        };

obj.show();
              
	}
	}


//  Abc obj = new Abc() {
//public void Show()
//{
//System.out.println("shoe"); 
//}
//}
