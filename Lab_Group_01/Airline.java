import java.util.*;

public class Airline
{
    String mainAirLine,infoAirLine,mainAirport,supAirport,supAirline,nameCEO,revenue,income
    ,netIncome,propertyValue,totalCapital,webSite;
    
    Airport Airport = new Airport();
    String[] codePlane = new String[10];
    int[] flightTime = {1245,1300,1455,1645,1945,1400,1700,2115,2300,2355};
    int[] BoardingTime = {1245,1300,1455,1645,1945,1400,1700,2115,2300,2355};
    String codeAirLine;
    String[] locationFlight = {"Thailand - Japan","Thailand - Vietnam"
        ,"Thailand - China","Thailand - Korea","Thailand - Hongkong","Japan - Thailand"
        ,"Vietnam - Thailand","China - Thailand","Korea - Thailand","Hongkong - Thailand"};
    int MaxPlane = 10,CountPlane = 0;
    Plane[] Plane = new Plane[this.MaxPlane];
    
    int MaxPassenger = 10,CountPassenger = 0;
    Passenger[] Passenger = new Passenger[this.MaxPassenger];
    
    public void PassInfoPassenger ()
    {
        
        if(this.MaxPassenger > this.CountPassenger){
            Passenger[this.CountPassenger] = new Passenger();
            Passenger[this.CountPassenger].no = this.CountPassenger;
            
            
            this.CountPassenger++;
        }
            
        //ส่งข้อมูลให้ Passenger
    }
    
    public void PassPlane ()
    {
        if(this.CountPlane < this.MaxPlane){
            Plane[this.CountPlane] = new Plane();
            Plane[this.CountPlane].AirlineInfo = this;
            Plane[this.CountPlane].PlaneNo = this.CountPlane;
            Plane[this.CountPlane].PlaneCode = this.codeAirLine + (this.CountPlane+1);
            Plane[this.CountPlane].AirportInfo = this.Airport;
            
            Plane[this.CountPlane].LocationFlight = this.locationFlight[Plane[this.CountPlane].PlaneNo];
            Plane[this.CountPlane].FlightTime = this.flightTime[Plane[this.CountPlane].PlaneNo];
            Plane[this.CountPlane].BoardingTime = this.BoardingTime[Plane[this.CountPlane].PlaneNo];
            
            this.CountPlane++;
        }else{
            //เครื่องบินเต็มสายการบิน
        }
            
        //่งข้อมูลให้ Plane
    }
    
    public int GetFlightTimeOut (int num)
    {
        return this.flightTime[num];
    }
    
    public String GetLocationFlight(int num)
    {
        return this.locationFlight[num];
    }
    
    public void DeletePlane (String codePlane)
    {
        //ในกรณีลดเครื่องบินเข้ามาในสายการบิน
    }
    
    public void GetInfoAirLine ()
    {
        //ข้อมูลของบริษัทของสายการบินนี้
    }
   
    public void CreateCodeAirLine ()
    {
        //สร้างโค้ดสำหรับสายการบินนั้นๆ
    }
    
    public String GetCodeAirLine ()
    {
        return this.codeAirLine;
        //ส่งโค้ดสำหรับสายการบินนั้นๆ
    }
    

}
