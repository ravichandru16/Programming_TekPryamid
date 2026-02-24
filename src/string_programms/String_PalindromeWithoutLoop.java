package string_programms;

import java.util.Scanner;

public class String_PalindromeWithoutLoop {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter ur String Value here :");
		String val=scan.next();
		int len=val.length()-1;
		
		char[] ch=val.toCharArray();
	//	boolean flag;
		
		for(int i=0;i<len/2;i++)
		{
			if(val.charAt(i)==ch[len])
			{
				System.out.println(val+" is a palindrome");
				break;
			}
			else
			{
				System.out.println(val+" is not a palindrome");
				break;
			}
		}
	}
}
