package mulpleinheritance;

interface Demo{
	void abc();
	default public void show() {
		System.out.println("from demo show");
		
	}
}

interface MyDemo{
	
	default public void show() {
		
		System.out.println("from mydemo show");
	}
} 

class A implements Demo,MyDemo{ // multiple inheritance implemented by overriding method
	
	public void show() {
		System.out.println("from class A show");
		
	}
	
	public void abc() {
		System.out.println("from class A abc");   
	}
}


public class MultipleInheritance {

	public static void main(String[] args) {

	Demo obj = new A();
	obj.abc();
	obj.show();
		
		
	}

}
