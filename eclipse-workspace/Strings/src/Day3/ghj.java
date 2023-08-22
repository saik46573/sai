package Day3;

import java.util.Arrays;

public class ghj
{

	public static void main(String[] args) {
		
		String s="Hello all     good morning  coding";
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		int count=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i].isEmpty())
			{
				continue;
			}
			else
			{
				count++;
			}
		}System.out.println(count);
	}
}
