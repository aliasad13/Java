package variablearguments;
class Add{
	
	public int add(int i,int j ) {					//int is the return type here.// public void add(){
		                                                               //  int k=i+j; } can be used.
	 return i+j;
		
	}
	
}


public class VarArgs {

	public static void main(String[] args) {
		Add obj = new Add();
		
		obj.add(4, 5);
		
		System.out.print(obj.add(4,5));      //this is another way to add 2 numbers using return keyword.
                                             //the other way is in object calling class in objectmethodconstructor project
	}                                        // Now what is that we can do if there are more than 2 nos,we will have to change 
	                                         //the no.of variables.But there is another way rather than changing variables continuously

}                                             //that method is called the Var Args method orvariable arguments
                                              