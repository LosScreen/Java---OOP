class Plane{
    
    int CountSeat = 0;
    int MaxSeat = 10;
    
    Airport AirportInfo;
    Airline AirlineInfo;
    Ticket[] TicketUsed = new Ticket[MaxSeat];
    Passenger[] PassengerInPlane = new Passenger[MaxSeat];
    
    int PlaneParkingNo;
    String PlaneCode = "";
    int PlaneNo;
    String PilotName = "";
    String LocationFlight;
    int FlightTime;
    int BoardingTime;
    
    
    Boolean GasReady = true;
    Boolean PlaneReady = false;
    Boolean WheelReady = true;
    void StartPlane(){
        if(this.GasReady){
            if(!this.PlaneReady){
                this.PlaneReady = true;
            }
        }else{
            this.PlaneReady = false;
            System.out.println("Gas is not ready now");
        }
    }
    
    void ShutdownPlane(){
        if(this.PlaneReady){
            this.PlaneReady = false;
        }
    }
    
    boolean PassengerCheckIn(Passenger passenger,Ticket ticket){
        if(this.CountSeat <= this.MaxSeat){
            PassengerInPlane[this.CountSeat] = passenger;
            TicketUsed[this.CountSeat] = ticket;
            this.CountSeat++;
            return true;
        }else {
            System.out.println("Seat is max!!");
            return false;
        }
    }
    
    boolean PassengerCheckOut(){
        PassengerInPlane[this.CountSeat] = null;
        TicketUsed[this.CountSeat] = null;
        if(this.CountSeat!=0){
            this.CountSeat--;
        }
            
            
        return true;
    }
    
    boolean PlaneTakeOff(){
        if(this.PlaneReady){
            this.Announce("PlaneTakeOff");
            this.WheelReady = false;
            
            return this.AirportInfo.PlaneCheckIn(this);
        }
        return false;
    }
    
    boolean PlaneLanding(){
        if(!this.WheelReady){
            
            this.WheelReady = true;
            
            this.Announce("PlaneLanding");
            return this.AirportInfo.PlaneCheckOut(this);
        }
        return false;
    }
    
    
    
    private void Announce(String Text){
        System.out.println(Text);
    }
    
    
    
}