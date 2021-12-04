

	@FunctionalInterface                                     // here we break some rules of Interface with default method
	interface A{		                                     //interface must have only abstract method,but we can have default method
		                                                     //functional Interface can only have one abstract method = here 3 with default
		void dontShow();                                     //abstract methods cannot be defined,we can define default methods  
		default void Show() {                                //default methods can be over rided  
			System.out.println("default Method");            //even the public abstract method dontShow() IS DEFINED now using overriding
		}
		
		default void hello() {
				
			System.out.println("default method 2");
		}
		
		
	}
			
		class B implements A {
			
			public void dontShow() {
				System.out.println("show");
			}
			
			public void Show() {
				System.out.println("defined now");
			}
			
			public void hello() {
				System.out.println("not default");
			}
			
		
		
	}
		public class DefaultMethod {

	public static void main(String[] args) {
		
		A obj= new B();
		obj.Show();
		obj.hello();
		obj.dontShow();
           
	}

}
