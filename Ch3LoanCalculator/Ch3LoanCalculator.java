import javax.swing.*;
import java.text.*;

public class Ch3LoanCalculator
{
    private Loan Loanobj = new Loan();
    
    public static void main (String[] args)
    {
        Ch3LoanCalculator loanCal = new Ch3LoanCalculator();
        
        loanCal.start();
        
    }
    
    public void start()
    {
        describeProgram ();
        getInput ();
        displayOutput ();
    }
    
    private void describeProgram () 
    {
        System.out.println("This program computes the monthly and total");
        System.out.println("payments for a given loan amount annual ");
        System.out.println("interest rate, and loan period.");
        System.out.println("Loan amount in dollars and cents, e.g., ");
        System.out.println("Annual interest rate in percentage, e.g., 12.75");
        System.out.println("Loan period in number of years, e.g., 15");
        System.out.println("\n");
    }
    
    private void getInput () 
    {
        double loanAmount, annualInterestRate;
        int loanPeriod;
        String inputStr;
        
        inputStr = JOptionPane.showInputDialog(null, "Loan Amount (Dollar+Cents):");
        loanAmount = Double.parseDouble(inputStr);
        
        inputStr = JOptionPane.showInputDialog(null, "Annual Interest Rate (e.g.,):");
        annualInterestRate = Double.parseDouble(inputStr);
        
        inputStr = JOptionPane.showInputDialog(null, "Loan Period - # of years:");
        loanPeriod = Integer.parseInt(inputStr);
        
        Loanobj.setAmount(loanAmount);
        Loanobj.setRate(annualInterestRate);
        Loanobj.setPeriod(loanPeriod);
    }
    
    private void displayOutput () 
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Loan Amount: $" + Loanobj.getAmount());
        System.out.println("Annual Interest Rate:" + Loanobj.getRate() + "%");
        System.out.println("Loan Period (years): " + Loanobj.getPeriod());
        
        System.out.println("Monthly payment is $ " + df.format(Loanobj.getMonthlyPayment(0.00)));
        System.out.println("  Total payment is $ " + df.format(Loanobj.getTotalPayment()));
        
        
    }
    
    
    public void TempCode () {
        final int MONTHS_IN_YEAR = 12;
        double loanAmount, annualInterestRate, monthlyPayment, totalPayment;
        double monthlyInterestRate;
        int loanPeriod, numberOfPayments;
        String inputStr;
        DecimalFormat df = new DecimalFormat("0.00");
        
        
        
        
        
        /*monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / 100;
        numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1/(1 + monthlyInterestRate),
        numberOfPayments ) );
        totalPayment = monthlyPayment * numberOfPayments;*/
        
        
        /*System.out.println("Loan Amount : $" + loanAmount);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Loan Period (years): " + loanPeriod);
        System.out.println("\n");
        System.out.println("Monthly payment is $ " + df.format(monthlyPayment));
        System.out.println(" TOTAL payment is $ " + df.format(totalPayment));*/
    }
}
