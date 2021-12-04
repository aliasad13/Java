package overRiding;


class A{
	int i;
	
public void show() {
		
		System.out.println("in A " );
	}
	
}

class B extends A{
	int i;
	@Override
	
	public void show() {            //if we use show1 or some other method name here;the answer would be "in A"
		                             //to avoid this,if we use @Override in B,it wont go to A.instead it shows 
		    					     //there's a mistake in method name.Here the Syubclass is said to override Superclass
		
		System.out.println("in B " );
	}
}

public class OverRiding {

	public static void main(String[] args) {

							B obj = new B();
							obj.show();
		
	}

} 