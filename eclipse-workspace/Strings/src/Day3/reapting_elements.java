package Day3;

import java.util.Scanner;

public class reapting_elements 
{

	public static void main(String[] args) 
	{
		String s="java";
		String s1=" ";
		for(int x=0;x<s.length();x++)
		{
			s1=s1+s.charAt(x)+s.charAt(x);
		}
		
		System.out.println(s1);
	}

}
