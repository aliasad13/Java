package com.multithreading;
class A{
	
	public void perform() {
		for(int i=1;i<=5;i++) {
		System.out.println("hi");
		try{Thread.sleep(500);} catch(Exception e){};
	}
		}
	
}
class B{
	
	public void perform() {
		for(int i=1;i<=5;i++)
		System.out.println("hello");
	try{Thread.sleep(500);} catch(Exception e){}
	}
}
public class MultiThreding {

	public static void main(String[] args) {
		
		A obj = new A();
		B obj1 = new B();
		obj.perform();
		obj1.perform();
		
	}

}
