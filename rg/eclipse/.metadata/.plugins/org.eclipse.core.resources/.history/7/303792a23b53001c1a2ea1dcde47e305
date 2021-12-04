package supermethod;

class A1{
	
	public A1() {
		
		
		{
			
			System.out.println("calling constructor A1 ");
		}
		
	}
	
	public A1(int i) {                                               //a class having two constructors but with 2 different parameters=constructor overloading
		
		{
			System.out.println("calling constructor A1 int");
			
		}
		
		
	}
}
	
	class B1 extends A1 {
		public B1(){
			
		{
			
			System.out.println("calling constructor B1");
			
		}
		
	               }
       public B1(int i) {
    	   
    	   {                                                                //AFTER EXTENDING
    	   System.out.println("calling constructor B1 int");                //B1 obj=new B1();==calling constructor B1 calling constructor A1 //its because A1 is the super class or parent of B1 .so both will come
       }                                                                    //A1 obj=new A1();== calling constructor A1
	}																		//B obj=new B(7); == calling constructor B1 int calling constructor A1//whene ever we call the constructor of sub class,it will also call the constructor of superclass
       																		//A obj=new A(7); == calling constructor A int
	}
	                                                                         


public class SuperMethod2 {

	public static void main(String[] args) {

		B1 obj=new B1(5);
	
		

	}

}
