package inheritance;

public class Review {
    String body;
    String author;
    int stars;

    public Review(String body, String author, int stars){
        this. body = body;
        this.author = author;
        this.stars = stars;
    }
    public String toString(){
        String output = String.format("\nBody: %s\n By: %s\n Stars: %d\n", body, author, stars);
        return output;
    }
}
