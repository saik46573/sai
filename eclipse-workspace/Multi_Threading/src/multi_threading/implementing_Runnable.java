package multi_threading;

public class implementing_Runnable 
{

	public static void main(String[] args) 	{
		test t=new test();
		Thread t1=new Thread(t);
		t1.setName("sai");
		Thread t2=new Thread(t);
		t2.setName("hello");
		t1.start();
		t2.start();
		try
		{
		t1.join(1000);
		}
		catch(Exception e)
		{
			System.out.println("exception has caught");
		}
		for(int x=0;x<10;x++)
			System.out.println("thread 2");
	}

}
class test implements Runnable
{
	public void run()
	{
		
		for(int x=0;x<10;x++)
			System.out.println(Thread.currentThread().getName());
	}
}
