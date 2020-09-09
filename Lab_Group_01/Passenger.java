import java.util.*;
public class Passenger
{
    String Name;
    String Location;
    String Codefigth;
    String FigthTime;
    
    Ticket Ticket;
    int no;
    
    
    
    boolean arrived = false;
    
    boolean CheckArrived (){
        
        return true;
    }
    
    void BuyTicket (Ticket ticket){
        this.Ticket = ticket;
        
    }
    
    

}
