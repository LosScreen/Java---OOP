import javax.swing.*;

public class test
{
    public String Convert(String number){
        int anum=1;
       String bahtTH ="",n;
      String[] numtext = {"ศูนย์", "หนึ่ง", "สอง", "สาม",
          "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า", "สิบ"};
      String[] rank = { "", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน"};
      
      
        for (int i = 0; i < number.length(); i++){
            n = number.substring(i, i + 1);
            int num =Integer.parseInt(n);
                if ((i == ((number.length() - 1)) || (i == (number.length() - 7))) && (num == 1) && (anum !=0 ))
                bahtTH += "เอ็ด";
                else if (((i == (number.length() - 2)) || (i == (number.length() - 8))) && (num == 1))
                bahtTH += "สิบ";
                else if (((i == (number.length() - 2)) || (i == (number.length() - 8))) && (num == 2))
                bahtTH += "ยี่สิบ";
                else if (num == 0)
                bahtTH += "";
                else{
                bahtTH += numtext[Integer.parseInt(n)];
                bahtTH += rank[(number.length() - i) - 1];
            }
            anum = num;
        }
        return (bahtTH);
    }
    
    public test()
    {
      String number;
      String re="";
      number = JOptionPane.showInputDialog(null,"Enter your Number");
      
       re = Convert(number);
      
      System.out.println(re);
    }
}
