package hgbu;



//executing hi and hello parallely

class A extends Thread implements Runnable{
	
	
	
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("hi");
		try{Thread.sleep(500);} catch(Exception e){};
	}
		}
	
}
class B extends Thread implements Runnable{
	
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println("hello");
	try{Thread.sleep(500);} catch(Exception e){}
	}
}


public class Multithreading2 {

	public static void main(String[] args) {
		
		A obj = new A();
		B obj1 = new B();
		
		obj.start();
		obj1.start();
		
		
	}

}
