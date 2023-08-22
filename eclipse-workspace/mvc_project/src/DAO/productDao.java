package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.*;
import com.mysql.cj.protocol.Resultset;

import DTO.Bean;

public interface productDao 
{
	public String add(Bean b) throws ClassNotFoundException, SQLException;
	public String update(Bean b) throws ClassNotFoundException, SQLException;
	public ResultSet view(String pid) throws ClassNotFoundException, SQLException;
	public String delete(String pid) throws ClassNotFoundException, SQLException;

}
