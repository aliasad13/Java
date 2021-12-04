package abstractclass;  // another way to print a number


class Print{
	public void show(Integer i) { //here if we use Number(super class of integer,double,.. we do not need to create another method for decimal)     
								//Number is an abstract class.it doesn't have any objects,integer,double, float,.. extends number	
		System.out.println(i);         //here we can use return.But if we use it we will have to change void
		
		
	}
	
	public void show(Number i) {
		
		System.out.println(i);
	}
}

public class AnotherWayToPrint {

	public static void main(String[] args) {
		Print obj = new Print();
		obj.show(5.5);
		
		
		
		
		
	}

}
