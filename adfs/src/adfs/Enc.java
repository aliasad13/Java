package adfs;   //ENCAPSULATION is binding data or variables onto methods so that they can only be accessed through methods

public class Enc {
	private int rollno;
	private String name;
 public void setRollno(int i) {  // thus methods are also called getters and setters
	rollno = i;
	
}
 
 public int getRollno() {
	 
	 return rollno;
 }
 
 public void setName(String n) {
	 name=n;
 }
 public String getName() {
	 
	 return name;
 }


	public static void main(String[] args) {

		Enc s1 = new Enc();
		Enc s2 = new Enc();
		s1.rollno=1;     //here variable is accessed directly                         //Accessing variables directly is dangerous
		System.out.println(s1.rollno);
		
		s2.setRollno(2);//here variable or data is accessd throgh methods.So we can vriables private 
		s2.setName("ravi");
		System.out.print(s2.getRollno());		
		System.out.println(" "+s2.getName());
		String str="123";
		int n=Integer.parseInt(str); //string str ="123"; int n = Integer.parseInt(str);
		System.out.println(n);
	}

}
