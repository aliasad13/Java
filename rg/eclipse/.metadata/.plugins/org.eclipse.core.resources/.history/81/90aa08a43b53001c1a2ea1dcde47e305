package staticKeyword;

class Emp {  
   int eid;
   int salary;
   static String ceo;
   
   //to create default values when no values are entered,create a constructor
   
   public Emp() {                       //for objects
	eid=000;
	salary=0000;
	ceo="unnown"; //when we use ceo="" here it will show it,but its better to use static block for static variables .  
	//constructors are used for objects and for static variables we use static block.reason in notebook                   
   System.out.println("constructor");
   }
   
   static {
	   ceo="Larry";                                //static block when you load a class
	   System.out.println("static");
   }
   
   public void show()
   {
	System.out.println(eid+":"+salary+":"+ceo);   
   }
	
}

public class Staticc {

	public static void main(String[] args) {
		Emp Navin = new Emp(); // navin object created referring class Emp
		
		
		Emp Rahul = new Emp();
		Rahul.eid=002;
		Rahul.salary=5000;
		Rahul.ceo="Mahesh";
		
	    //Navin.ceo="Nikita"; will give nikita as output no matter what we type in other objects 
		// since we changed string ceo into static.i.e. if we make a variable(ceo) static 
	    // it's value will be same for all objects(rahul,navin)that uses that varable   
		Navin.show();
		Rahul.show();

	}

}
