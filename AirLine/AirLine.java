import java.util.*;

public class AirLine
{
    String codeAirLine = "SE",mainAirLine,infoAirLine,mainAirport,supAirport,supAirline,nameCEO,revenue,income
    ,netIncome,propertyValue,totalCapital,webSite;
    
    String[] codePlane = new String[10];
    int[] flightTime = {1245,1300,1455,1645,1945,1400,1700,2115,2300,2355};
    String[] locationFlight = {"Thailand - Japan","Thailand - Vietnam"
        ,"Thailand - China","Thailand - Korea","Thailand - Hongkong","Japan - Thailand"
        ,"Vietnam - Thailand","China - Thailand","Korea - Thailand","Hongkong - Thailand"};
    int MaxPlane = 10,CountPlane = 0;
    Plane[] Plane = new Plane[this.MaxPlane];
    
    public void CreatePlane (String codePlane)
    {
        if(this.MaxPlane > this.CountPlane){
            Plane[this.CountPlane] = new Plane();
            Plane[this.CountPlane].AirlineInfo = this;
            Plane[this.CountPlane].PlaneNo = this.CountPlane;
            Plane[this.CountPlane].PlaneCode = this.codeAirLine + (this.CountPlane+1);
            this.CountPlane++;
        }else{
            //เครื่องบินเต็มสายการบิน
        }
            
        //ในกรณีเพิ่มเครื่องบินเข้ามาในสายการบิน
    }
    
    public int GetFlightTimeOut (int num)
    {
        return this.flightTimeOut[num];
    }
    
    public int GetFlightTimeIn (int num)
    {
        return this.flightTimeIn[num];
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
