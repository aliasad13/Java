package superKeyWord;

class A{
	int i;
	
public void show() {
		
		System.out.println("in A " );
	}
	
}

class B extends A{
	int i;
	
	public void show() {
		super.show();              //if super.show(); is removed,we get only "in b".With the super keyword we are calling the super class too.
		
		System.out.println("in B " );
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

							B obj = new B();
							obj.show();
		
	}

} /*if this was a constructor i.e 

class A{

public A(){

System.out.println("in A");

}
}
 
 Class B{
 public B(){
 
 System.out.println("in B");
 
 
 }


}

public Constructor{

public static void main(String[] args){

			B obj = new B();    				output = in A
														 in B i.e we called B,but A(super class) too came.
														 This wont happen in Method.

}






*/
