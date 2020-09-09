import java.util.*;

public class AirLine
{
    String codePlane,codeAirLine,codeLocation,location,gate;
    boolean flightOut = false;
    boolean flightIn = false;
    
    
    AirPlane[] plane = new AirPlane[100];
    Date startDate = new Date();
    Date endDate = new Date();
    public AirLine()
    {
       
    }
    
    public void GetGate()
    {
        //ข้อมูลของ Gate ที่เครื่องบินต้องจอด เอาข้อมูลมาจากเครื่องบิน
    }
    
    public void CreateDate()
    {
        //คำนวนเวลาของเครื่องที่จะออกและถึง
    }
    
    public void CreateCodeAirLine()
    {
        //สร้างโค้ดสำหรับสายการบินนั้นๆ
    }
    
    public void GetPlane (String codePlane)
    {
        //ข้อมูลของเครื่องบินสำหรับสายการบินนั้นๆ เอาข้อมูลมาจากเครื่องบิน
    }
    
    public void SetPlane (String codePlane)
    {
        //ข้อมูลของเครื่องบินสำหรับสายการบินนั้นๆ เอาข้อมูลมาจากเครื่องบิน
    }
    
    public void GetLocation (String codeLocation)
    {
        //ข้อมูลของเที่ยวบินจากไหนไปไหน เอาข้อมูลมาจากเครื่องบิน
    }
    
    public void StartFlight(boolean PlaneOut) //เช็คเที่ยวบินว่าออกไปรึยัง
    {
        if(PlaneOut)
        {
            flightOut = true;
        }
        else
        {
            flightOut = false;
        }
    }
    
    public void EndFlight(boolean PlaneIn) //เช็คเที่ยวบินว่าถึงรึยัง
    {
        if(PlaneIn)
        {
            flightIn = true;
        }
        else
        {
            flightIn = false;
        }
    }
    

}
