import javax.swing.*;

public class EntryPoint
{
    static void main(String[] arg){
        
        Airport airport = new Airport();
        airport.Name = "AirportJaa";
        airport.RegisterAirline("SE1");
        airport.AirlineInAirport[0].PassPlane();
        airport.RegisterAirline("SE2");
        airport.AirlineInAirport[1].PassPlane();
        airport.Booking.BuyTicket("A");
        airport.SearchTicketInfo("A");
        
        
    }
}
