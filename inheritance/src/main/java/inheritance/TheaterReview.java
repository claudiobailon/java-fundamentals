package inheritance;

public class TheaterReview extends Review{
    private String movie;

    public TheaterReview(String body, String author, int stars, String movie) {
        super(body, author, stars);
        this.movie = movie;
    }

    @Override public String toString(){
        String output= String.format("\n Reviewer: %s \n Movie Watched: %s\n Review: %s\n Stars: %d\n", getAuthor(), getMovie(), getBody(), getStars());
        return output;
    }
    public String getMovie() {
        return movie;
    }

}
