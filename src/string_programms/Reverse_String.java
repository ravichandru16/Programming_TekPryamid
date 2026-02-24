package string_programms;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("String String value");
		String value=scan.nextLine();
		int i=value.length()-1;
		 
		while(i>=0)
		{
			System.out.print(value.charAt(i));
			i--;
		}
		
	}
}
