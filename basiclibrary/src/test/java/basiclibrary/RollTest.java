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
        @Test public void calcAvg(){
            Roll avg = new Roll();
            int[] arr1 = {1,3,4,9,6};
            int testAvg1= 5;//4.6 rounded to closest integer
            int[] arr2 = {5,7,8,9,10,11};
            int testAvg2= 8;//8.33 rounded to closest integer
            int avg1 = avg.getAverage(arr1);
            int avg2 = avg.getAverage(arr2);

            assertEquals(avg1, testAvg1);
            assertEquals(avg2, testAvg2);
        }

}
