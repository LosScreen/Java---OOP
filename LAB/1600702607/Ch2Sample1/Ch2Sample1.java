import javax.swing.*;

public class Ch2Sample1
{
    public static void main(String[ ] args) {
           JFrame myWindow;
           
           myWindow = new JFrame( );

           myWindow.setSize(300, 200);
           myWindow.setTitle("My First Java Program");
           myWindow.setVisible(true);
           JOptionPane.showMessageDialog(null, "I Love Java");
        }
}