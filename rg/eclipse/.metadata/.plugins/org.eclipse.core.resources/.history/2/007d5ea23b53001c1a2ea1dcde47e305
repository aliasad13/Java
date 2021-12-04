package learning;
class Outer {									//outer class
                                                //class must have a method and every action or command is performed
                                               //inside this.Variable declartion can be done inside or outside*/   
    int a;                                             
	public void show() {						//outer class method	
		System.out.println("from outer class");
		
	}
	
public class Inner {
		
		public void display() {
			
		System.out.println("from inner class");
			
    }
		}
	}


public class InnerClassDemo {

	public static void main(String[] args) {      
			
				Outer obj = new Outer();
				obj.show();
				
				Outer.Inner obj1 = obj.new Inner();  //if inner class is static inner class{ },we do not use
				obj1.display();						 //object,we use class name like: Outer.Inner obj1 = new Outer.Inner	
		
	}


	}
