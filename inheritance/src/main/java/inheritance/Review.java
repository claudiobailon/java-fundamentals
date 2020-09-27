package inheritance;

public class Review  extends Restaurant{
    String body;
    String author;

    public Review(String name, int stars, String priceCategory, String body, String author){

        super(name,stars, priceCategory);
        this. body = body;
        this.author = author;
    }
    public String toString(){
        String output = String.format("\nReview for: %s By: %s \nBody: %s\n Stars: %d\n Price: %s\n", name, author, body, stars, priceCategory);
        return output;
    }
}
