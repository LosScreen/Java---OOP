import javax.swing.*;

public class HiLO
{
    public void start ()
    {
        int answer;
        
        describeRules();
        
        answer = prompt("Do you want to play a Hi-Lo game ?");
        
        while (answer == JOptionPane.YES_OPTION) 
        {
            generateSecretNumber ();
            
            playGame();
            
            answer = prompt ("Do you want to olat another Hi-Lo game ?");
        }
    }
    
    private int prompt(String question)
    {
        int reply;
        
        reply = JOptionPane.showConfirmDialog(null,question,"Confirmmation",JOptionPane.YES_NO_OPTION);
        
        return reply;
    }
    
    private void describeRules()
    {
        System.out.println("Inside describeRules");
    }
    
    private void generateSecretNumber()
    {
        System.out.println("Inside generateSecretNimber");
    }
    
    private void playGame()
    {
        System.out.println("Inside playGame");
    }
}
