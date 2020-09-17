package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

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
            for(int j = i+1; j < lookForDupe.length; j++){
                if(dupes == lookForDupe[j]){
                    areThereDupes = true;
                    break;
                }
            }
        }
        System.out.println("Were there duplicates? " + areThereDupes);
        return areThereDupes;
    }

    public int getAverage(int[] calcAvgArr) {
        int sum = 0;
        for( int i = 0; i < calcAvgArr.length; i++){
            sum += calcAvgArr[i];
        }
        int avg = (int) Math.round((double) sum/calcAvgArr.length);
        return avg;
    }
    public int[] lowAvgArr(int[][] testArr){//learned this from https://stackoverflow.com/questions/4781100/how-to-make-an-array-of-arrays-in-java
        Roll newAvg = new Roll();
        int lowestAvg = newAvg.getAverage(testArr[0]);//sets lowest average to the first array
        int lowIndex = 0;//sets index of array with lowest average to the first array
        for (int i = 1; i < testArr.length; i++) {
            if (newAvg.getAverage(testArr[i]) < lowestAvg) {//if the average of the current array is less than the lowestAvg
                lowIndex = i;//then the low index is set to the current index
                lowestAvg = newAvg.getAverage(testArr[i]);// and lowestAvg is set to the avg of current array
            }
        }
        return testArr[lowIndex];
    }
    public String highLowNever(int[][] octWeath) {
        HashSet<Integer> octTemps = new HashSet<>();
        int high = octWeath[0][0];
        int low = octWeath[0][0];
        for(int i = 0; i < octWeath.length; i++){
            for(int j = 0; j < octWeath[i].length; j++){
                octTemps.add(octWeath[i][j]);
                if(octWeath[i][j] > high){
                    high = octWeath[i][j];
                }else if(octWeath[i][j] < low){
                    low = octWeath[i][j];
                }
            }
        }
        String returnTemps = "High: " + high + "\nLow: " + low + "\n";

        for(int i = low; i < high; i++){
            if(!octTemps.contains(i)){
                returnTemps += "Never saw temperature: " + i + "\n";
            }
        }

//        String High = "High: 72\n" +
//                "Low: 51\n" +
//                "Never saw temperature: 63\n" +
//                "Never saw temperature: 67\n" +
//                "Never saw temperature: 68\n" +
//                "Never saw temperature: 69";

        System.out.println(returnTemps);
        return returnTemps;
    }
    public String tally(ArrayList<String> plants){
        int count = 0;
        HashMap<String, Integer> votes = new HashMap<>();
        for(String plant : plants){
            if (votes.containsKey(plant)){
                count = votes.get(plant);
            } else{
                count = 0;
            }
            votes.put(plant, count + 1);
        }
        int mostVotes = 0;
        String winner = " ";
        for(String countVotes : votes.keySet()){
            if(votes.get(countVotes) > mostVotes){
                winner = countVotes;
                mostVotes = votes.get(countVotes);
            }
        }
        String returnString = winner + " received the most votes!";
        return returnString;

    }

}
