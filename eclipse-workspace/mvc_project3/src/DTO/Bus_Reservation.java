package DTO;

public class Bus_Reservation
{
	private int Reservation_id;
	private String Bus_No;
	private String Passenger_name;
	private String mobile_no;
	private String FromLocation;
	private String ToLocation;
	private int Ticket_No;
	private double Ticket_Price;
	public int getReservation_id()
	{
		return Reservation_id;
	}
	public void setReservation_id(int reservation_id) 
	{
		Reservation_id = reservation_id;
	}
	public String getBus_No()
	{
		return Bus_No;
	}
	public void setBus_No(String bus_No) 
	{
		Bus_No = bus_No;
	}
	public String getPassenger_name() 
	{
		return Passenger_name;
	}
	public void setPassenger_name(String passenger_name) 
	{
		Passenger_name = passenger_name;
	}
	public String getMobile_no() 
	{
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) 
	{
		this.mobile_no = mobile_no;
	}
	public String getFromLocation()
	{
		return FromLocation;
	}
	public void setFromLocation(String fromLocation) 
	{
		FromLocation = fromLocation;
	}
	public String getToLocation()
	{
		return ToLocation;
	}
	public void setToLocation(String toLocation) 
	{
		ToLocation = toLocation;
	}
	public int getTicket_No()
	{
		return Ticket_No;
	}
	public void setTicket_No(int ticket_No) 
	{
		Ticket_No = ticket_No;
	}
	public double getTicket_Price()
	{
		return Ticket_Price;
	}
	public void setTicket_Price(double ticket_Price) 
	{
		Ticket_Price = ticket_Price;
	}
}