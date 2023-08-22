package DAO;
import DAO.ProductDaoimpl;
import DAO.productDao;

public class ProductDaoFactory 
{
	static productDao productdao;
	static
	{
		productdao=new ProductDaoimpl();
	}
	public static productDao getProductDao()
	{
		return productdao ;
		
	}

}
