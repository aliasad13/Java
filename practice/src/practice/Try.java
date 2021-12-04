package practice;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of square"); 
		int n= sc.nextInt();
		char i,j;
		
		for (i = 1;i<=n;i++)
		{
			
			for (j=1;j<=n;j++)
			{
				if (i==1||j==1|i==n|j==n) {
				
				System.out.print((char)(j+64)+" ");}
				
				else {
					System.out.print("  ");
				}
				
				
			}System.out.println();
		}
		

	}

}
