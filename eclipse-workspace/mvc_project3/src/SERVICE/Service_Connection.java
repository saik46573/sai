package SERVICE;

public class Service_Connection 
{
	static Bus_Reaservation_Service Service=new Service_Bus_Reservation_Impl();
	public static Bus_Reaservation_Service getService()
	{
		return Service;
	}

}
