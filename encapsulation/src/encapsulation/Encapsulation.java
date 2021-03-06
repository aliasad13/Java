package encapsulation;           //the concept of binding data or variables with methods is called encapsulation

class Student{
	private int rollno;         // variables that carries data must always be private and methods that access these variables must be private  
	private String name;
	
	//variables must be accessed through methods only.
	//methods are of 2 type getters and setters
 
	public void setRollno(int rno) {
		
		this.rollno=rno;
		
		
	}
	
	public int getRollNo() {
		System.out.println("someone is accessing the files");
		return rollno;
		
		
	}
	
	public void setName(String stname) {
		this.name=stname;
	}
	
	public String getName() {
		
		System.out.println("some one is accessing name");
		return name; 
		
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setRollno(01);
		s1.setName("Abdu");
		System.out.print(s1.getRollNo() + " ");
		System.out.println(s1.getName());
		   
		System.out.println();
		
		Student s2 = new Student();
		s2.setRollno(02);
		s2.setName("Amal");
		System.out.println(s2.getRollNo());
		System.out.println(s2.getName());
		
		
		
		
	}

}
