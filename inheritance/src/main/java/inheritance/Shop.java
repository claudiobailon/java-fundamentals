package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private int stars;

    public Shop(String name, String description, int stars) {
        this.name = name;
        this.description = description;
        this.stars = stars;
    }
    public String toString() {
        String output = String.format("\n Name: %s\n Description: %s\n Rating: %d Stars\n", name, description, stars);
        return output;
    }

    ArrayList<Review> reviewList = new ArrayList<>();

    public void addReview(Review newReview){
        reviewList.add(newReview);
        updateStarRating();

    }
    public void updateStarRating(){
        int starsEarned = 0;
        for(Review review : reviewList){
            starsEarned += review.stars;//Possibly come back to this
        }
        int newStarRating = (int) Math.ceil((double) starsEarned/reviewList.size());
        this.setStars(newStarRating);
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getStars(){
        return stars;
    }
    public void setStars(int stars){
        this.stars = stars;
    }


}
