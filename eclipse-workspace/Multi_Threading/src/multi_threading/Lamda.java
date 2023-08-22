package multi_threading;

public class Lamda
{
	public static void main(String args[])
	{
		Runnable r=()->
		{
			for(int x=0;x<10;x++)
				System.out.println("thread 1");
		};
		Runnable r1=()->
		{
			for(int x=0;x<10;x++)
				System.out.println("thread 2");
		};
		Thread t=new Thread(r);
		Thread t1=new Thread(r1);
		t.start();
		t1.start();
		
	}

}
