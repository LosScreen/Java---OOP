import java.util.*;
import java.text.*;

public class DateDemo
{
    public DateDemo()
    {
      Date toDay = new Date();
      System.out.println(toDay.toString());
      
      Date today = new Date();
      SimpleDateFormat sdf1, sdf2;
      sdf1 = new SimpleDateFormat("MM/dd/yy");
      sdf2 = new SimpleDateFormat("MMMM dd, yyyy");
      
      System.out.println(sdf1.format(toDay));
      System.out.println(sdf2.format(toDay));
      try{
      String sDate = "2019-01-23";
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      Date date = df.parse(sDate);
      
      Format formatter =
      new SimpleDateFormat("EEEE dd MMMM พ.ศ.yyyy",
      new Locale("th", "TH"));
      
      System.out.println("Date Thai : " + formatter.format(date));
      
      Date dt = new Date();
      Calendar c = Calendar.getInstance();
      for(int lp=1;lp<=12;lp++)
      {
          c.set(2019, lp, 1, 0, 0);
          c.add(Calendar.DATE, -1);
          dt = c.getTime();
          System.out.println(dt);
          /*c.setTime(dt);
           * c.add(Calendar.DATE, -1);
           * dt = c.getTime();*/
      }
      
      System.out.println(dt);
      
    }catch(Exception ex)
    {
    }
}
}
