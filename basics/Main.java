public class Main{
  public static void main(String[] args){
    int dogCount =1;
    String dog = pluralize("dog", dogCount);
    System.out.println("I own " + dogCount + " " + dog + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

  }
  public static String pluralize(String word, int num){

    if(num > 1 || num == 0)
    {
      return word + 's';
    }else {
      return word;
    }

  }

}