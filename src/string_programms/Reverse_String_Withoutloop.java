package string_programms;

import java.util.Scanner;

public class Reverse_String_Withoutloop {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter String value here :");
		String val=scan.next();
		int i=val.length()-1;
		method(i, val);
	}
	
	public static void method(int i,String value)
	{
		//System.out.println(i);
		if(i<0)
		{
			return;
		}
		System.out.print(value.charAt(i));
		i--;
		method(i,value);
	}


}
