package first;

public class Pap {//checking the number through extraction of 2 digits 
	

	public static void main(String[] args) 
	{
		int n=175468,count=0,count1=0,i,j,k,l,rem=0,rem1=0,rem2=0,rem3=0,sum1=0,sum=0,h=0;
		for(i=n;i>0;i/=100)
		{
			rem=i%100;
			count++;
			if(count==1)
			{
				h=rem;
					for(j=2;j<rem/2;j++)
					{
						if(rem%j==0)
					{
						count1++;
					}
					
					}
			}	
				else if(count==2)
				{
					for(k=rem;k>0;k/=10)
					{
						rem1=k%10;
						sum=sum+(rem1*rem1);
					}
				}
				else if(count==3)
				{
					for(l=rem;l>0;l/=10)
						{
						rem2=l%10;
						sum1=sum1*10+rem2;
						}
					
				}
		}
		
		if(count1==0)
		{
			System.out.println(h+" prime number");
		}
		else
		{
			System.out.println(h+"  not a prime number");
		}
		if(sum==rem)
		{
			System.out.println(sum+" armstrong");
		}
		else
		{
			System.out.println(sum+" not a armstrong");
		}
		if(sum1==rem)
		{
			System.out.println(sum1+" palindrome");
		}
		else
		{
			System.out.println(sum1+" not a palindrome");
		}

	}

}
