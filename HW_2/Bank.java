import javax.swing.*;
public class Bank
{
  
    public Bank()
    {
      int anum=1;
      String number,bahtTH ="",n,fnum,lnum;
      String[] numtext = {"ศูนย์", "หนึ่ง", "สอง", "สาม",
          "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า", "สิบ"};
      String[] rank = { "", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน"};
      
      number = JOptionPane.showInputDialog(null,"Enter your Number");
      
      fnum = number.substring(0, number.indexOf("."));
      number = number.substring(number.indexOf(".")+1, number.length());
      
      lnum = number.substring(0, number.length());
      
      int cfnum = Integer.parseInt(fnum);
      int clnum = Integer.parseInt(lnum);
      
      if (cfnum != 0){
        for (int i = 0; i < fnum.length(); i++){
            n = fnum.substring(i, i + 1);
            int num = Integer.parseInt(n);
                if ((i == ((fnum.length() - 1)) || (i == (fnum.length() - 7))) && (num == 1) && (anum != 0) )
                bahtTH += "เอ็ด";
                else if (((i == (fnum.length() - 2)) || (i == (fnum.length() - 8))) && (num == 1))
                bahtTH += "สิบ";
                else if (((i == (fnum.length() - 2)) || (i == (fnum.length() - 8))) && (num == 2))
                bahtTH += "ยี่สิบ";
                else if (num == 0)
                bahtTH += "";
                else{
                bahtTH += numtext[Integer.parseInt(n)];
                bahtTH += rank[(fnum.length() - i) - 1];
            }
            anum = num;
        }
        bahtTH += "บาท";
    }
    
    if (clnum != 0){
        for (int i = 0; i < lnum.length(); i++){
            n = lnum.substring(i, i + 1);
            int num = Integer.parseInt(n);
                if ((i == ((lnum.length() - 1)) || (i == (lnum.length() - 7))) && (num == 1) && (anum != 0) )
                bahtTH += "เอ็ด";
                else if (((i == (lnum.length() - 2)) || (i == (lnum.length() - 8))) && (num == 1))
                bahtTH += "สิบ";
                else if (((i == (lnum.length() - 2)) || (i == (lnum.length() - 8))) && (num == 2))
                bahtTH += "ยี่สิบ";
                else if (num == 0)
                bahtTH += "";
                else{
                bahtTH += numtext[Integer.parseInt(n)];
                bahtTH += rank[(lnum.length() - i) - 1];
            }
            anum = num;
        }
        bahtTH += "สตางค์";
    }
        System.out.println(bahtTH);
    }

}
