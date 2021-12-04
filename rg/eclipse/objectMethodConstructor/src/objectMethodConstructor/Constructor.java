package objectMethodConstructor;

class A{

	
int num1,num2,result;
 
public A()               //We know that constructor does not return any value,so even if we write 'void'
						 //it will not show any error,but it wont be a constructor anymore
{  num1=5;               //call using A obj=new A();
   num2=10;				// known as default constructor as it need not be called and does not have parameters			
   
  
	}
public A(int i) {         //same constructor with different signature or parameter    
	    num1=i;
	    num2=i;					//now if we need this constructor use A obj=new A(7) or any integer
	
	
}
public A(float f) {      
	num1=(int)f;          //call using A obj=new A(5.5)
	num2=(int)f;          

}
public A(double d,int n) {  //call using A obj=new A(5.5,6)
	num1=(int)d;
	num2=n;
	
}

}

public class Constructor {

	public static void main(String[] args) {
		A obj=new A(7); //as soon as we type new A();        //here we are calling a constructor which we do not 
					   //it will create a new object
		               //referring to constructor A()        //have, A() in class A .What happens is that java knows 
					   //and java will call the constructor //when ever a new object is created we need to call a constructor,
					   //we don't have to call it			//U don't have to create it,instead java itself gives the constructor
										 				    //to us.By default Java gives us a constructor and is called a default
										                    //constructor and does not return any value.It does only one job ,allocating
		System.out.println(obj.num1+obj.num2);              //memory.If we need a constructor for example ,one that assigns value
										                    //we need to create it ourselves
              /*here we can see that for taking
               * values from constructor A() we
               * did not call it.
               * but problems occur when there are
               * multiple constructors known as 
               * constructor over loading.
               * But can there be multiple constructors
               * of same class?
               * no,multiple constructors of same class 
               * can only be used if they have different 
               * parameters as shown above.
               */
		
	}

}
