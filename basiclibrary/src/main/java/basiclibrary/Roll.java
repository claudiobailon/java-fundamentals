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
}
