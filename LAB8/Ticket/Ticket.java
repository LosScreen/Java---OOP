package Ticket;

import java.util.*;

public class Ticket
{
    String[] PassengerName;
    String[] From;
    String[] To;
    String[] Class;
    String[] Seat;
    String[] FlightNumber;
    String[] Gate;
    String[] AirlineName;
    Date[] TravelDate;
    Date[] BoardingTime;
    int i;
    
    AirlineBookingSystem PassengerName = new AirlineBookingSystem;
    
    public Ticket()
    {
        
    }
    
    public void GetFlightInfo(String PassengerName,String Airline,String From,String To,String Class,String Seat,String FlightNumber,String Gate,String AirlineName,Date TravelDate,Date BoardingTime)
    {
        for(i=0;i<=10;i++)
        {
            PassengerName[i]=PassengerName.GetPassengerInfo();
            AirlineName[i]=Airline.GetAirline();
            Class[i]=Class.ChooseFlight();
            Seat[i]=Seat.ChooseFlight();
            From[i]=From.GetTime();
            To[i]=To.GetTime();
            TravelDate[i]=TravelDate.GetTime();
            BoardingTime[i]=Time.GetTime();
        }
    }
    
    public void PrintTicket()
    {
        system.out.println("Passenger : " + PassengerName);
        system.out.println("Airline : " + AirlineName);
        system.out.println("Class : " + Class);
        system.out.println("Seat Number : " + Seat);
        system.out.println("From : " + From);
        system.out.println("To : " + To);
        
        system.out.println("Date : " + TravelDate);
        system.out.println("Time : " + BoardingTime);
    }
}
