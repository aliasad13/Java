package supermethod;

class A{
	
	public A() {
		
		{
			System.out.println("calling constructor A ");
		}
		
	}
	
	public A(int i) {                                               //a class having two constructors but with 2 different parameters=constructor overloading
		
		{
			System.out.println("calling constructor A int");
			
		}
		
		
	}
}
	
	class B {
		public B(){
		{
			
			System.out.println("calling constructor B");
			
		}
		
	               }
       public B(int i) {
    	   {
    	   System.out.println("calling constructor B int");                 //B obj=new B();==calling constructor B  
       }                                                                    //A obj=new A();==calling constructor A
	}																		//B obj=new B(7); == calling constructor B int
       																		//A obj=new A(7); == calling constructor A int
	}
	


public class SuperMethod {

	public static void main(String[] args) {

		B obj=new B(7);
	
		

	}

}
