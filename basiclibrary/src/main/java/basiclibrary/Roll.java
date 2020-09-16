package basiclibrary;

import java.util.Arrays;

public class Roll {
    public int[] roll(int rollNum) {
        int[] diceRolls = new int[rollNum];
        for ( int i = 0; i < rollNum; i++){
            int diceSide = (int) (Math.random() * (7 - 1) )+ 1;//https://stackoverflow.com/questions/5271598/java-generate-random-number-between-two-given-values
            diceRolls[i] = diceSide;
        }
        System.out.println(Arrays.toString(diceRolls));
        return diceRolls;
    }
    public boolean containsDuplicates(int[] lookForDupe) {
        boolean areThereDupes = false;
        int dupes = 0;
        for(int i = 0; i < lookForDupe.length; i++){
            dupes = lookForDupe[i];
            for(int j = 0; j < lookForDupe.length; j++){
                if(dupes == lookForDupe[j + 1]){
                    areThereDupes = true;
                    System.out.println("working");
                    break;
                }else{
                    areThereDupes = false;
                }
            }
        }
        System.out.println("Were there duplicates? " + areThereDupes);
        return areThereDupes;
    }
}
