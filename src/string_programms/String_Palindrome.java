package string_programms;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String value = scan.next();
		String temp = "";

		int i = value.length() - 1;

		while (i >= 0) {
			temp += value.charAt(i);
			i--;
		}

		System.out.println(value);
		System.out.println(temp);
		if (value.equals(temp) ) {
			System.out.println(value + " is a palindrome string");
		} else {
			System.out.println(value + " is not a palindrome string");
		}
	}
}
