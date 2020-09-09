import javax.swing.*;

public class TravelTrip
{
    private Traval obj = new Traval();
    
    public static void main(String[] args){
        TravelTrip tripobj = new TravelTrip();
        
        tripobj.start();
    }
    
    private void start(){
        getInput();
        obj.CheckCondition();
        obj.CheckInput();
        obj.ComputePrice();
        getOutput ();
    }
    
    private void getInput(){
        String destination,answer;
        
        String question = "Choose your travel destination:::\r\n";
        question += "---------------------------------\r\n";
        question += "1. Japan Enter : J\r\n";
        question += "2. Hongkong Enter : H\r\n";
        question += "3. China Enter : C\r\n";
        question += "4. Thailand Enter : T\r\n";
        question += "5. Austria Enter : A\r\n";
        question += "6. England Enter : E\r\n";
        question += "---------------------------------";

        destination = JOptionPane.showInputDialog(question);  
        obj.setDestination(destination);
        
        question = "Enter number persons for your trip:::\r\n";
        question += "---------------------------------\r\n";
        question += "Only 1 - 50";
        question += "---------------------------------";

        answer = JOptionPane.showInputDialog(question);  
        obj.setAnswer(answer);
    }
    
    private void getOutput (){
        System.out.println("Destination your trip is : " + obj.desName);
        System.out.println("Number person(s) for your trip : " + obj.countForTravel);
        System.out.println("Air Travel by : " + obj.airplaneName);
        System.out.println("Price for trip : " + obj.allPrice);
        System.out.println("---------------------------------");
        System.out.println("::TRIP LIST::");
        obj.LoopDisplay();
    }
}