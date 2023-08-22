package SERVICE;

import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.ProductDaoFactory;
import DAO.productDao;
import DTO.Bean;

public class serviceImpl implements productService
{

	@Override
	public String addProduct(Bean b) throws ClassNotFoundException, SQLException
	{
		String Status="";
		productDao ProductDao;
		ProductDao=ProductDaoFactory.getProductDao();
	     Status=ProductDao.add(b);
		return Status;
	}

	@Override
	public String updateProduct(Bean b) throws ClassNotFoundException, SQLException 
	{
		String Status="";
	productDao ProductDao;
	ProductDao=ProductDaoFactory.getProductDao();
     Status=ProductDao.update(b);
	return Status;
	}

	@Override
	public ResultSet viewProduct(String pid) throws ClassNotFoundException, SQLException
	{
	productDao ProductDao;
	ProductDao=ProductDaoFactory.getProductDao();
     ResultSet rs=ProductDao.view(pid);
	return rs;
		
	}

	@Override
	public String deleteProduct(String pid) throws ClassNotFoundException, SQLException 
	{
		String Status="";
		productDao ProductDao;
		ProductDao=ProductDaoFactory.getProductDao();
	     Status=ProductDao.delete(pid);
		return Status;
	}

}
