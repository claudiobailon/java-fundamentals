package inheritance;

public class Review {
    String body;
    String author;
    int stars;

    public Review(String body, String author, int stars ){

        this.body = body;
        this.author = author;
        this.stars = stars;
    }
    public String toString(){
        String output = String.format("Reviewer: %s \nReview: %s\n Stars: %d\n", author, body, stars);
        return output;
    }
}
