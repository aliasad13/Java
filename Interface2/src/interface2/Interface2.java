package interface2;

////////////////////////////////////////////////////
 interface Writer{	
	public abstract void write() ;//no need of public abstract as its always declared and not defined
		
	
}
////////////////////////////////////////////////
class A{
	public void Read(){
		System.out.println("read");
		
	}
	
	
}

//////////////////////////////////////////////////

class Pen extends A implements Writer {
public void write()
{
	System.out.println("Im a pen");
}

public void read() {
System.out.println("please read");	
}
}

//////////////////////////////////////////////

class Pencil extends A implements Writer 
{
public void write() {
	System.out.println("Im a pencil");
}	
}


///////////////////////////////////////////////////////

class Kit{

public void doSomething(Writer p ) {

p.write();
}


////////////////////////////////////////////////////

	
	
}
public class Interface2 {

	public static void main(String[] args) {
                  Writer p = new Pen();
                  Kit k = new Kit();
                  Writer a = new Pencil();
                  A obj = new A();
                  
               k.doSomething(a);  
               k.doSomething(p);
              obj.Read();
	}

}

