import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// import java.time.*;

public class Main{
  public static void main(String[] args){
    ////////Plurzlize function calls//////
    int dogCount =1;
    String dog = pluralize("dog", dogCount);
    System.out.println("I own " + dogCount + " " + dog + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    //////flipNHeads function call/////
    flipNHeads(3);
    //////clock function call/////
    clock();
  }
//////////// Pluralize Function///////////////////
  public static String pluralize(String word, int num){
    if(num > 1 || num == 0){
      return word + 's';
    }else{
      return word;
    }

  }
/////////////// FlipNHeads Function////////
  public static int flipNHeads(int n){
    int attempts = 0;
    int inARow = 0;

    while (inARow < n){
      
      int num = (Math.random() <= 0.5)? 0: 1; //David Dicken help figured this out
      if (num == 0){
        System.out.println("Tails");
        attempts ++;
        inARow = 0;
      }else{
        System.out.println("Heads");
        attempts ++;
        inARow ++;

      }
      
    }
    if (inARow == n){
      System.out.println("It took " + attempts + " flips to flip " + n + " heads in a row.");
    }
    return attempts;
  }
////////////Command Line Clock//////////
  public static void clock(){
    int num = 0;
    LocalDateTime now = LocalDateTime.now();
    String time = now.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    String newTime = now.format(DateTimeFormatter.ofPattern("hh:mm:ss"));

    while(num == 0){
      now = LocalDateTime.now();
      newTime = now.format(DateTimeFormatter.ofPattern("hh:mm:ss"));

      if(!time.equals(newTime)){
        time = now.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println(time);
      }
    }
  }
}