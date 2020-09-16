package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollTest {
        @Test public void testRollLength() {
            Roll roll = new Roll();
            int[] rolls = roll.roll(5);
            int[] rolls2 = roll.roll(8);
            int arrLen = rolls.length;
            int arrLen2 = rolls2.length;

            assertEquals(arrLen, 5);
            assertEquals(arrLen2, 8);
        }
        @Test public void testRollContent(){
            Roll roll = new Roll();
            int[] rolls = roll.roll(25);

            boolean oneThroughSix = false;
            for(int i = 0; i < rolls.length; i++){
                if(rolls[i] == 1 || rolls[i] == 2 || rolls[i] == 3 || rolls[i] == 4 || rolls[i] == 5 || rolls[i] == 6){
                    oneThroughSix = true;
                }
            }
            assertTrue("All numbers were between 1 and 6",oneThroughSix);
        }

}
