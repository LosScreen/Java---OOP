import java.util.*;
import java.text.*;

public class test
{
   public static String ThaiBaht(String txt) {
  String bahtTxt, n, bahtTH = "";
  Double amount;
  try {
   amount = Double.parseDouble(txt);
  } catch (Exception ex) {
   amount = 0.00;
  }

  try {
   DecimalFormat df = new DecimalFormat("####.00");
   bahtTxt = df.format(amount);
   String[] num = { "ศูนย์", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า",
     "หก", "เจ็ด", "แปด", "เก้า", "สิบ" };
   String[] rank = { "", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน" };
   String[] temp = bahtTxt.split("[.]");
   String intVal = temp[0];
   String decVal = temp[1];
   if (Double.parseDouble(bahtTxt) == 0)
    bahtTH = "ศูนย์บาทถ้วน";
   else {
    for (int i = 0; i < intVal.length(); i++) {
 }
}
}
}
}
