import java.util.*;
public class AirlineBookingSystem
{
    
    
    Airport airport;
    
    
    AirlineBookingSystem(Airport airport){
        this.airport = airport;
    }
    
    
    
    void BuyTicket(String Name){
        for(int i = this.airport.CountAirline;i>=0;i--){
                Passenger passenger = new Passenger();
                passenger.Name = Name;
                
                Ticket ticket = new Ticket();
                ticket.Name = passenger.Name;
                Airline airline = this.airport.AirlineInAirport[i];
                System.out.println(airline.CountPlane);
                for(int j = airline.CountPlane-1; j>=0;j--){
                    Plane plane = airline.Plane[j];
                    ticket.Location =  plane.LocationFlight;
                    ticket.CodeFligth = plane.PlaneCode;
                    ticket.FigthTime = plane.FlightTime;
                    ticket.CodeAirLine = airline.codeAirLine;
                    ticket.BoardingTime = plane.BoardingTime;
                    passenger.BuyTicket(ticket);
                    this.airport.PassengerCheckIn(passenger);
                }
        }
    
    }
    
    
}
