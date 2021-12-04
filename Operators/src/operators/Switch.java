package operators;

import java.nio.file.spi.FileSystemProvider;

public class Switch {

	public static void main(String[] args) {
		String n="abc";
		switch(n)
		{
		case "abc":
			System.out.println("one");
			break;
		case "2":
			System.out.println("two");
			break;
		case "3":
			System.out.println("three");
			break;
		case "4":
			System.out.println("4");
			break;
		case "5":
			System.out.println("5");
			break;
		case "a":
			System.out.println("1st letter");
			break;
			
		default:
			System.out.println("not defined");
			
		}
	}
}
