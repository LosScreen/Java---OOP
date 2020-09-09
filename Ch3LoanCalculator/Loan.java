
public class Loan
{
    final int MONTHS_IN_YEAR = 12;
    double loanAmount, annualInterestRate;
    double monthlyPayment, totalPayment;
    double monthlyInterestRate;
    int loanPeriod, numberOfPayments;
    
    public void setAmount(double amount)
    {
        loanAmount = amount;
    }
    
    public void setRate(double annualRate)
    {
        monthlyInterestRate = annualRate / MONTHS_IN_YEAR / 100;
    }
    
    public void setPeriod(int periodInYears)
    {
        numberOfPayments = periodInYears * MONTHS_IN_YEAR;
    }
    
    public double getAmount()
    {
        return loanAmount;
    }
    
    public int getPeriod()
    {
        return numberOfPayments / MONTHS_IN_YEAR;
    }
    
    public double getRate()
    {
        return monthlyInterestRate * MONTHS_IN_YEAR * 100;
    }
    
    public double getMonthlyPayment(double interestRatePlus)
    {
        double monthlyPayment = 0.00;
        monthlyInterestRate = monthlyInterestRate + interestRatePlus; //ถ้าดอกเบี้ยเป็น 0 ก็จะเป็น 0
        if (monthlyInterestRate == 0.00){ // ถ้าเงินดอกเบี้ยเท่ากับ 0 ไม่ต้องคิดดอกเบี้ย
            
            monthlyPayment = loanAmount/numberOfPayments; //ให้นำ จำนวนเงินมา หารกับ จำนวนเดือนที่จ่าย
            
        }
        
        else // ถ้าเงินดอกเบี้ยไม่เท่ากับ 0 ต้องคิดดอกเบี้ย
        {
            
            monthlyPayment = (loanAmount * monthlyInterestRate)/
            (1 - Math.pow(1/(1 + monthlyInterestRate),numberOfPayments ) ) ; // คิดเงินที่ต้องจ่ายต่อเดือนปกติ
            
        }
        return monthlyPayment;
    }
    
    public double getTotalPayment()
    {
        double totalPayment;
        double interestRatePlus = 0.00;
        if(numberOfPayments>36) // ถ้าจำนวนเดือนเกิน 3 เดือนจะมาเข้าตรงนี้
        {
            totalPayment = getMonthlyPayment(interestRatePlus) * 36; // ทำไว้เพื่อนจะไม่คิดดอกเบี้ย 3 ปีแรก
            numberOfPayments = numberOfPayments - 36; // ตัด 3 ปี แรกทิ้งเพราะฟรีดอกเบี้ย
            loanAmount = loanAmount - totalPayment; //นำเงิน 3 ปีแรกออกจากการคำนวนปีที่ 4
            while(numberOfPayments>0)
            {
                interestRatePlus = interestRatePlus+0.5; // เพิ่มดอกเบี้ย 0.5
                totalPayment += getMonthlyPayment(interestRatePlus)+12; // คิดดอกเบี้ยของปีนั้นๆ
                numberOfPayments = numberOfPayments - 12; // ลบจำนวนปีที่ต้องจ่ายออกของปีนั้นๆ
                loanAmount = loanAmount - totalPayment; //เป็นการตัดเงินออกทุกๆ 12 เดือนที่คิด
            }
        }else // ถ้าไม่เกิน 3 เดือนจะมาเข้าตรงนี้
        {
            totalPayment = getMonthlyPayment(interestRatePlus) * numberOfPayments; //คำนวนปกติ แบบไม่มีดอกเบี้ย
        }
        
        return totalPayment;
    }

}
