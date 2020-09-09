public class Calculate
{
    public Calculate()
    {
        double price = 120,
        rateVat = 7
        ,rateTax = 10;
	price = calculate(price,rateVat,rateTax);
	System.out.println(price);
    }
    
    public double calculate (double price,double rateVat,double rateTax)
    {
        double vat=0,result=0,tax=0,resultVat=0,resultPrice=0;
        vat = price*rateVat/100;
        resultVat = price+vat;
        tax = resultVat*rateTax/100;
        resultPrice = resultVat+tax;
        return (resultPrice);
    }

}
