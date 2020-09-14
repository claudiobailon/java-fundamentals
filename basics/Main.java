public class Main{
  public static void main(String[] args)
  {
    ////////Plurzlize function calls//////
    int dogCount =1;
    String dog = pluralize("dog", dogCount);
    System.out.println("I own " + dogCount + " " + dog + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    //////flipNHeads function call/////
    flipNHeads(5);
  }
//////////// Pluralize Function///////////////////
  public static String pluralize(String word, int num)
  {
    if(num > 1 || num == 0)
    {
      return word + 's';
    }else {
      return word;
    }

  }

  public static int flipNHeads(int n)
  {
    int attempts = 0;
    int inARow = 0;

    while (inARow < n){
      
      int num = (Math.random() <= 0.5)? 0: 1; //David Dicken help figured this out
      if (num == 0)
      {
        System.out.println("Tails");
        attempts ++;
        inARow = 0;
      }else
      {
        System.out.println("Heads");
        attempts ++;
        inARow ++;

      }
      
    }
    if (inARow == 5)
    {
      System.out.println("It took " + attempts + " flips to flip " + n + " heads in a row.");
    }
    return attempts;
  }


}