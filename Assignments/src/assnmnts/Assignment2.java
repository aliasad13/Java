package assnmnts;
/*
 * 1
 * 12
 * 123
 * 1234
 * 
 * to convert this pattern to A AB ABC ABCD the only ting to do is change 
   system.out.print(j); to system.out.print((char)(j+64));
   65 is the ASCII value for A  
 */
public class Assignment2 {

	public static void main(String[] args) {
		int n = 4;
		for(int i=1;i<=n;i++)
		{
		for (int j=1;j<=i;j++)
		{
			System.out.print((char)(j+64));
		}
		System.out.println();	
		}
	
	

	}
}
