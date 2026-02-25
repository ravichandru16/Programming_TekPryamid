package string_programms;

public class Demo1 {

	public static void main(String[] args)
	{
		String s="abc";
		System.out.println(s);
		s=s+"xyz";
		System.out.println(s);
		String s1="abc";
		System.out.println(s1);
		demo2();
		demo3();
		demo4();
		demo5();
	}
	
	public static void demo2()
	{
		String s="abc";
		String s1="abc";
		
		if(s==s1)
			System.out.println("both are equal");
	}
	public static void demo3()
	{
		String s="abc";
		String s1="abc";
		
		if(s.equals(s1))
			System.out.println("both are equal");
	}
	
	public static void demo4()
	{
		String s="abc";
		String s1=new String("abc");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}
	
	public static void demo5()
	{
		String s="malayalam";
		System.out.println(s.length());
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.indexOf('m'));
	}
	
}
