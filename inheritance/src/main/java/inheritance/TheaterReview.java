package inheritance;

public class TheaterReview extends Review{
    String movie;

    public TheaterReview(String body, String author, int stars, String movie) {
        super(body, author, stars);
        this.movie = movie;
    }
    public String toString(){
        String output= String.format("Reviewer: %s \nMovie Watched: %s\n Review: %s\n Stars: %d\n", author, movie, body, stars);
        return output;
    }
}
