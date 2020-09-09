
class Dice {
    
    // OUTPUT : 654321
    // OUTPUT : 123456
    // OUTPUT : 111111
    // OUTPUT : 666666
    // OUTPUT : 123321
    // OUTPUT : 456654
    
    private static final int MAX_NUMBER = 6;
    private static final int MIN_NUMBER = 1;
    private static final int NO_NUMBER = 0;
    
    private int number;
    
    public static void main(String[] args){
        Dice obj = new Dice();
        int[] cnt;
        
        cnt = obj.Roll01();
        obj.Roll02(cnt);
        
    }
    
    
    public int[] Roll01( ){
        
        String allDice = "";
        int checkLoop = 0,cntAll=0;
        int[] cnt = new int[6];
        
        Dice[] objArr = new Dice[6];
        
        for (int lp=0;lp < 6;lp++) {
            objArr[lp] = new Dice();
        }
        
        while ( checkLoop !=6 ){
            
            allDice = "";
            for (int lp=0;lp < 6;lp++){
                objArr[lp].roll();
                allDice = allDice + objArr[lp].getNumber();
            }
            
            cntAll++;
            if (allDice.equals("654321") && checkLoop == 0) {
                System.out.println("หน้าที่ออก 1. => " + allDice);
                cnt[0]=cntAll;
                cntAll=0;
                checkLoop++;
            }
            else if (allDice.equals("123456") && checkLoop == 1){
                System.out.println("หน้าที่ออก 2. => " + allDice);
                cnt[1]=cntAll;
                cntAll=0;
                checkLoop++;
            }
            else if (allDice.equals("111111") && checkLoop == 2){
                System.out.println("หน้าที่ออก 3. => " + allDice);
                cnt[2]=cntAll;
                cntAll=0;
                checkLoop++;
            }
            else if (allDice.equals("666666") && checkLoop == 3){
                System.out.println("หน้าที่ออก 4. => " + allDice);
                cnt[3]=cntAll;
                cntAll=0;
                checkLoop++;
            }
            else if (allDice.equals("123321") && checkLoop == 4){
                System.out.println("หน้าที่ออก 5. => " + allDice);
                cnt[4]=cntAll;
                cntAll=0;
                checkLoop++;
            }
            else if (allDice.equals("456654")&& checkLoop == 5){
                System.out.println("หน้าที่ออก 6. => " + allDice);
                cnt[5]=cntAll;
                cntAll=0;
                checkLoop++;
                System.out.println("*************************");
            }
        }
        return cnt;
    }
    
    public void Roll02 (int[] cnt) {
        int[] number = {654321,123456,111111,666666,123321,456654};
        
        for (int lp=0;lp<6;lp++) {
            
            String formatted = String.format("หน้าที่ออก %d. => %d จำนวนการทยอย %d ครั้ง คิดเป็น %.20f",lp+1,number[lp],cnt[lp],(double)1/cnt[lp]);
            System.out.println(formatted + " %");
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