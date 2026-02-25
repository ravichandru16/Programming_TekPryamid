package string_programms;

import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Scanner;



public class Occurrence_String {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter ur String value here :");
		String val=scan.next();
		
		LinkedHashMap<Character, Integer> l= new LinkedHashMap<Character, Integer>();
		for(int i=0;i<val.length();i++)
		{
			char ch=val.charAt(i);
			if(!(l.containsKey(ch))) {
				l.put(ch, 1);
			}
			else {
				int n=l.get(ch);
				n++;
				l.put(ch, n);
		}
			for(java.util.Map.Entry<Character, Integer> e:l.entrySet())
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
				
		}
	}
}
