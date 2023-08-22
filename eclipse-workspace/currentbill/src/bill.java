public class bill 
{

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name");
			String name=sc.nextLine();
			System.out.println("enter the number of units");
			double units=sc.nextInt();
			double amount;
			if(units<100)
				{
				amount=units*2;

				System.out.println("total amount=="+amount);
				}
		       else if(units<300)
				{
				amount=100*2+(units-100)*3.5;
				}
			
		
	}

}
