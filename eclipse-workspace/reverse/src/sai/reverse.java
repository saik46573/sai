package sai;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("without reversing " + str);
		char[] ch=str.toCharArray();
		int l= ch.length-1;
		for(int i=l;i>=0;i--) 
		{
			System.out.print(ch[i]);		
		}
		String st=ch.toString();
		
		System.out.println("the string is " + st);	
	}
}

