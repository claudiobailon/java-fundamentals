package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;

    public Review(String body, String author, int stars ){

        this.body = body;
        this.author = author;
        this.stars = stars;
    }
    public String toString(){
        String output = String.format("\n Reviewer: %s \n Review: %s\n Stars: %d\n", author, body, stars);
        return output;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public int getStars() {
        return stars;
    }
}
