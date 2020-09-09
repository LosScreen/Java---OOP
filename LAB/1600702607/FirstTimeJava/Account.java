

public class Account
{
    private double currentBalance;
    private double minimumBalance;

    public Account()
    {
        minimumBalance = 100;
    }
    
    public void setCurrentBalance(double pNewBalance)
    {
        currentBalance = pNewBalance;
    }

    public double getCurrentBalance()
    {
        return currentBalance;
    }
}
