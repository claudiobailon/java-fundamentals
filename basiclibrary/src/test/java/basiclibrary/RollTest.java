package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class RollTest {
        @Test public void testRollLength() {
            Roll roll = new Roll();
            int rollNum1 = 5;
            int rollNum2 = 8;
            int[] rolls = roll.roll(rollNum1);
            int[] rolls2 = roll.roll(rollNum2);
            int arrLen = rolls.length;
            int arrLen2 = rolls2.length;

            assertEquals(arrLen, rollNum1);
            assertEquals(arrLen2, rollNum2);
        }
        @Test public void testRollContent(){
            Roll roll = new Roll();
            int[] rolls = roll.roll(25);
            boolean oneThroughSix = false;

            for(int i = 0; i < rolls.length; i++){
                if(rolls[i] > 0 && rolls[i] < 7){
                    oneThroughSix = true;

                }else{
                    oneThroughSix = false;
                    break;
                }
            }
            assertTrue("All numbers were between 1 and 6", oneThroughSix);
        }
        @Test public void testIfDupes(){
            Roll roll = new Roll();
            int[] rolls = roll.roll(7);//minimum amount to insure a duplicate
            int[] rolls2 = roll.roll(1);//cannot produce duplicate
            boolean areDupes = roll.containsDuplicates(rolls);
            boolean areDupes2 = roll.containsDuplicates(rolls2);
            assertTrue(areDupes);
            assertFalse(areDupes2);
        }

}
