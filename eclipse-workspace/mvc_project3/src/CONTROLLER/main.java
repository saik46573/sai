package CONTROLLER;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import DTO.Bus_Reservation;
import SERVICE.Bus_Reaservation_Service;
import SERVICE.Service_Connection;
public class main 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Bus_Reaservation_Service BRS=Service_Connection.getService();
		Bus_Reservation Br =new Bus_Reservation();
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("			 Bus_Reservation System");
		System.out.println("");
		System.out.println("----------------------------------------------------");
		System.out.println("|1.Booking |"+"  "+"2.Updating |"+"  "+"3.Viewing |"+"  "+"4.Deleting |");
		System.out.println("----------------------------------------------------");
		System.out.println("enter the requried option");
		 int n=sc.nextInt();
	
		switch(n)
		{
		case 1:
		{
			System.out.println("enter the Reservation_id");
			int Reservation_id=sc.nextInt();
			System.out.println("enter the Bus_No");
			String Bus_No=sc.next();
			System.out.println("enter the Passenger_name");
			String Passenger_name=sc.next();
			System.out.println("enter the Mobile_no");
			String Mobile_no=sc.next();
			System.out.println("enter the FromLocation");
			String FromLocation=sc.next();
			System.out.println("enter the ToLocation");
			String ToLocation=sc.next();
			System.out.println("enter the Ticket_No");
			int Ticket_No=sc.nextInt();
			System.out.println("enter the Ticket_Price");
			Double Ticket_Price=sc.nextDouble();
			Br.setReservation_id(Reservation_id);
			Br.setBus_No(Bus_No);
			Br.setPassenger_name(Passenger_name);
			Br.setMobile_no(Mobile_no);
			Br.setFromLocation(FromLocation);
			Br.setToLocation(ToLocation);
			Br.setTicket_No(Ticket_No);
			Br.setTicket_Price(Ticket_Price);
			int rows=BRS.insertService(Br);
			System.out.println();
			if(rows>0)
			{
				System.out.println("Query ok  "+rows+"  rows affected");
				System.out.println();
			}
			break;
		}
		case 2:
		{
			System.out.println("enter the Bus_No");
			String Bus_No=sc.next();
			System.out.println("enter the Passenger_name");
			String Passenger_name=sc.next();
			System.out.println("enter the Mobile_no");
			String Mobile_no=sc.next();
			System.out.println("enter the FromLocation");
			String FromLocation=sc.next();
			System.out.println("enter the ToLocation");
			String ToLocation=sc.next();
			System.out.println("enter the Ticket_No");
			int Ticket_No=sc.nextInt();
			System.out.println("enter the Ticket_Price");
			Double Ticket_Price=sc.nextDouble();
			System.out.println("to update the list enter the Reservation_id avalable ");			
					ResultSet rs=BRS.showService(Br);
					while(rs.next())
						{
						System.out.println(rs.getInt(1));
						}			
			System.out.println("enter the Reservation_id");
			int Reservation_id=sc.nextInt();
			Br.setBus_No(Bus_No);
			Br.setPassenger_name(Passenger_name);
			Br.setMobile_no(Mobile_no);
			Br.setFromLocation(FromLocation);
			Br.setToLocation(ToLocation);
			Br.setTicket_No(Ticket_No);
			Br.setTicket_Price(Ticket_Price);
			Br.setReservation_id(Reservation_id);
			int rows=BRS.updateService(Br);
			
			System.out.println();
			
			if(rows>0)
			{
				System.out.println("Query ok  "+rows+"  rows affected");
				System.out.println();
			}
			break;
		}
		case 3:
		{
			ResultSet rs=BRS.viewService(Br);
			 System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			 System.out.printf("|%-10s | %-15s | %-20s | %-10s | %-12s | %-12s | %-10s | %-10s|%n","Reservation_id","Bus_No","Passenger_name","Mobile_no","FromLocation","ToLocation","Ticket_No","Ticket_Price");
			 System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			 while(rs.next())
			 {
				 int Reservation_id1=rs.getInt(1);
				 String Bus_No1= rs.getString(2);
				 String Passenger_name1=rs.getString(3);
				 String Mobile_no1= rs.getString(4);
				 String FromLocation1= rs.getString(5);
				 String ToLocation1=rs.getString(6);
				 int Ticket_No1=rs.getInt(7);
				 Double Ticket_Price1=rs.getDouble(8);
			
				 System.out.printf("|%-14s | %-15s | %-20s | %-10s | %-12s | %-12s | %-10s | %-12s|%n",Reservation_id1,Bus_No1,Passenger_name1,Mobile_no1,FromLocation1,ToLocation1,Ticket_No1,Ticket_Price1);
				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
				 System.out.println();
			 }
			 
				break;
		}
		case 4:
		{
//			System.out.println("enter the Reservation_id");
			System.out.println("To delete the list enter the Reservation_id available ");			
				ResultSet rs=BRS.showService(Br);
				while(rs.next())
				{
				System.out.println(rs.getInt(1));
				}		
			int Reservation_id=sc.nextInt();
			Br.setReservation_id(Reservation_id);
			int rows=BRS.deleteService(Br);
			if(rows>0)
			{
				System.out.println("Query ok  "+rows+"  rows affected");
				System.out.println();
			}
				break;	
		}			
			
		}
		}
		

	}

}
