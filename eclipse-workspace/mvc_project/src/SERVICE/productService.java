package SERVICE;

import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Bean;

public interface productService 
{
	public String addProduct(Bean b) throws ClassNotFoundException, SQLException;
	public String updateProduct(Bean b) throws ClassNotFoundException, SQLException;
	public ResultSet viewProduct(String pid) throws ClassNotFoundException, SQLException;
	public String deleteProduct(String pid) throws ClassNotFoundException, SQLException;

}
