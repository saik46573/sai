package jdbc1;

public class preparedStatement
{

	public static void main(String[] args) throws Exception 
	{
		bean o=new bean();
		o.setPid(0);
		o.setPname("1");
		o.setQuantity(11);
		o.setSalary(123.1);
		DAO.data(o);

	}
}
