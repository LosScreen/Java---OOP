class Dice {
    
    // OUTPUT : 654321
    
    private static final int MAX_NUMBER = 6;
    private static final int MIN_NUMBER = 1;
    private static final int NO_NUMBER = 0;
    
    private int number;
    
    public static void main(String[] args){
        Dice obj = new Dice();
        int check=99;
        while (check != 1){
        
        obj.roll();
        if(obj.number == 6 && check == 99){
            System.out.print(obj.number);
            check = obj.number;
        }
            else if (check == 6 && obj.number == 5){
                System.out.print(obj.number);
            check = obj.number;
            }
            else if (check == 5 && obj.number == 4){
                System.out.print(obj.number);
            check = obj.number;
            }
            else if (check == 4 && obj.number == 3){
                System.out.print(obj.number);
            check = obj.number;
            }
            else if (check == 3 && obj.number == 2){
                System.out.print(obj.number);
            check = obj.number;
            }
            else if (check == 2 && obj.number == 1){
                System.out.print(obj.number);
            check = obj.number;
            }
        
    }
    }
    
    public Dice( ) {
        number = NO_NUMBER;
    }
    //Rolls the dice
    public void roll( ) {
        number = (int) (Math.floor(Math.random() *
        (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER);
    }
    //Returns the number on this dice
    public int getNumber( ) {
        return number;
    }
}