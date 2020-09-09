import java.util.*;
import java.text.*;
public class Calendars
{
    public Calendars(){
        int check;
        Date target = new Date();
        Calendar run = Calendar.getInstance();
            for (int month=1;month<=12;month++){
                run.set(2019,month,1,0,0,0);
                run.add(Calendar.DATE, -1);
                check = run.get(Calendar.DAY_OF_WEEK);
                   if(check == Calendar.SATURDAY){
                        run.add(Calendar.DATE, -1);
                    }
                    else if (check == Calendar.SUNDAY){
                        run.add(Calendar.DATE, -2);
                    }
                //run.add(Calendar.DAY_OF_MONTH, +1);
                Format formatter =
      new SimpleDateFormat("EEEE dd MMMM พ.ศ.yyyy",
      new Locale("th", "TH"));
               target = run.getTime();
               System.out.println("Date Thai : " + formatter.format(target));
                //System.out.println(target);
                
    }
}
}