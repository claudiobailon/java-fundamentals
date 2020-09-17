package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;

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
        @Test public void calcLowAvg(){
            Roll lowAvg = new Roll();
            int[][] weeklyMonthTemperatures = {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}
            };
            int[] lowestAvgArr = {55, 54, 60, 53, 59, 57, 61};
            int[] calcedLowArr = lowAvg.lowAvgArr(weeklyMonthTemperatures);
            assertArrayEquals(lowestAvgArr,calcedLowArr);

        }
        @Test public void showTemps(){
            Roll temps = new Roll();
            int[][] octMonthTemps= {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}
            };
            String expectedString = "High: 72\n" +
                    "Low: 51\n" +
                    "Never saw temperature: 63\n" +
                    "Never saw temperature: 67\n" +
                    "Never saw temperature: 68\n" +
                    "Never saw temperature: 69\n";
            String answer = temps.highLowNever(octMonthTemps);

            assertEquals(expectedString, answer);

        }
        @Test public void tallyTest(){
            Roll finalTally= new Roll();
            ArrayList<String> votes = new ArrayList<>();
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Shrub");
            votes.add("Hedge");
            votes.add("Shrub");
            votes.add("Bush");
            votes.add("Hedge");
            votes.add("Bush");

            String winner = "Bush received the most votes!";
            assertEquals(winner, finalTally.tally(votes));
        }
}
