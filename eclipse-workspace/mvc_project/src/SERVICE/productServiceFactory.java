package SERVICE;

public class productServiceFactory 
{
	static productService Service=new serviceImpl();
	public static productService getProductService()
	{
		return Service;
	}

}
