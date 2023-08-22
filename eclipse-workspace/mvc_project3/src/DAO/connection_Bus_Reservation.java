package DAO;

public class connection_Bus_Reservation 
{
	static Bus_Reservation_Impl Br=new Bus_Reservation_Impl();
  public static Bus_Reservation_Impl getConnection()
  {
	return Br ;
	  
  }


}
