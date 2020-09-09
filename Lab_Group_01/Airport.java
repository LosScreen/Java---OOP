class Airport{
    
    String Name;
    int CountAirline = 0;
    int MaxAirline = 5;
    int CountPlane = 0;
    int MaxPlane = 10;
    int CountPassenger = 0;
    int MaxPassenger = 1000000;
    Airline[] AirlineInAirport = new Airline[this.MaxAirline];
    Plane[] PlaneInAirport = new Plane[MaxPlane];
    Passenger[] PassengerInAirport = new Passenger[this.MaxPassenger];
    AirlineBookingSystem Booking = new AirlineBookingSystem(this);
    
    boolean RegisterAirline(String AirlineName){
        if(this.CountAirline < this.MaxAirline){
           AirlineInAirport[this.CountAirline] = new Airline();
           AirlineInAirport[this.CountAirline].codeAirLine = AirlineName;
           AirlineInAirport[this.CountAirline].Airport = this;
           this.CountAirline++;
           return true; 
        }
        
        return false;
    }
    
    boolean PlaneCheckIn(Plane planeLanding){
        if(this.CountPlane < this.MaxPlane){
            planeLanding.PlaneParkingNo = this.CountPlane;
            this.PlaneInAirport[this.CountPlane] = planeLanding;
            this.CountPlane++;
        }
        return true;
    }
    
    boolean PlaneCheckOut(Plane planeTakeOff){
        this.PlaneInAirport[planeTakeOff.PlaneParkingNo] = null;
        if(this.CountPlane != 0){
            if(this.CountPlane > 0){
                for(int i = this.CountPlane;i<this.MaxPlane;i++){
                    this.PlaneInAirport[i] = this.PlaneInAirport[i+1];
                    this.PlaneInAirport[i].PlaneParkingNo = i;
                }
            }
            this.CountPlane--;
        }
        return true;
    }
    
    boolean PassengerCheckIn(Passenger passengerIn){
        if(this.CountPassenger < this.MaxPassenger){
            this.PassengerInAirport[this.CountPassenger] = passengerIn;
            this.CountPassenger++;
        }
        return true;
    }
    
    boolean PssengerCheckOut(Passenger passengerOut){
        return this.PssengerCheckOut(passengerOut.Name);
    }
    
    boolean PssengerCheckOut(String Name){
        int position;
        boolean result = false;
        for(int i = this.CountPassenger;i>=0;i--){
            if(this.PassengerInAirport[i].Name == Name){
                this.PassengerInAirport[i] = null;
                position = i;
                result = this.PssengerCheckOut(position);
            }
        }
        
        return result;
    }
    
    boolean PssengerCheckOut(int position){
        if(this.CountPassenger != 0){
            if(this.CountPassenger > 0){
                for(int i = position;i<this.MaxPassenger;i++){
                    this.PassengerInAirport[i] = this.PassengerInAirport[i+1];
                }
            }
            this.CountPassenger--;
        }
        return true;
    }
    
    Passenger getPassengerInfo(String Name){
        Passenger result = null;
        for(int i = this.CountPassenger-1;i>=0;i--){
            if(this.PassengerInAirport[i].Name == Name){
                result = this.PassengerInAirport[i];
            }
        }
        return result;
    }
    
    void SearchTicketInfo(String passengerName){
        Passenger passenger = this.getPassengerInfo(passengerName);
        Ticket ticket = passenger.Ticket;
        
        System.out.println(passenger.Name + " " + ticket.Location);
        System.out.println(ticket.CodeFligth + " " + "20.03.2019" + " " + ticket.CodeAirLine);
        System.out.println("21.03.2019" + ticket.FigthTime + " " + ticket.CodeFligth + "01");
        
        
        
        
    }
    
}