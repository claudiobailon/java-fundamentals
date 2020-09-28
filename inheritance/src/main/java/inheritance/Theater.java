package inheritance;

import java.util.ArrayList;

public class Theater extends Shop{


    public Theater(String name, String description, int stars) {
        super(name, description, stars);
    }
    ArrayList<String> nowShowing = new ArrayList<>();

    public String toString(){
        String output = String.format("\n Name: %s\n Description: %s\n Rating: %d Stars\n Now Showing: %s\n",
                this.getName(), this.getDescription(), this.getStars(), this.nowShowing.toString());
        return output;
    }

    public void addMovie(String movie){
        nowShowing.add(movie);
    }
    public void removeMovie(String movie){
        nowShowing.remove(movie);
    }
    public void addMovieReview(TheaterReview addReview){
        reviewList.add(addReview);
        updateStarRating();
    }



}
