package interfaceLearning;
//////////////////////////////////////////////
class Pen{

public void write()
{
	System.out.println("Im a pen");
}
}
//////////////////////////////////////////////////
class Pencil
{
public void write() {
	System.out.println("Im a pencil");
}	
}
////////////////////////////////////////////////

class Kit{

public void doSomething(Pencil a) {

a.write();
}

public void doSomething(Pen p) {
	p.write();
}


	
	
}
public class Interface {

	public static void main(String[] args) {
		
                  Pen p = new Pen();
                  Pencil a = new Pencil();
                  Kit k = new Kit();
                  
               k.doSomething(a);  
               k.doSomething(p); 
              
	}

}
