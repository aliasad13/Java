package supermethod3;



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
			super();
			
		{
			
			System.out.println("calling constructor B1");
			
		}
		
	               }
       public B1(int i) {
    	   super(1);
    	   {                                                                //AFTER using Super method
    		                                                                //we saw that even if we call using B1(5) or B1,the super class that comes up is A1 and not A1 int.Its because by default the default constructor is the super clas
    	   System.out.println("calling constructor B1 int");                //so if we add super(),it means to call the constructor of superclass.its actually invisibly placed inside every sub class.so to call a parameterised constructor we will need to specify super(5) 
    	                                                                    //B1 obj=new B1();//B1 super()==calling constructor B1 calling constructor A1 
       }                                                                    //B1 obj=new B1();//B1 super(5)== calling constructor A1 int calling constructor B1
	}																		//B1 obj=new B1(7);//B1(inti) super() == calling constructor A1 calling constructor B1 int 
       																		//B1 obj=new B1(7);//B1 (inti) super(4) == calling constructor A1 int calling constructor B1 int
	}
	                                                                         


public class SuperMethod {

	public static void main(String[] args) {

		B1 obj=new B1();
		
	
		

	}

}
