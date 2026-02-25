package string_programms;

import java.util.Scanner;

public class String_PalindromeWithoutLoop {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter ur String Value here :");
		String val=scan.next();
		int len=val.length()-1;
		int j=len;
		
		char[] ch=val.toCharArray();
		int count=1;
		for(int i=0;i<len/2;i++)
		{
			if(val.charAt(i)==ch[j])
			{
				count++;
				j--;
			}
		}
		System.out.println(count);
		if(count>len/2)
		{
			System.out.println(val+" is a palindrome");
		}
		else
			System.out.println(val+" is not a palindrome");
	}
}
