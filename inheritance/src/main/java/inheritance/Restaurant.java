package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    int stars;
    String priceCategory;
    ArrayList<Review>  reviewList = new ArrayList<>();

    public  Restaurant(String name, int stars, String priceCategory){
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }
    public String toString(){
        String output = String.format("\n Name: %s\n Stars: %d\n Price Category: %s\n", name, stars, priceCategory);
        return output;
    }
    public void addReview(Review newReview){
        reviewList.add(newReview);
        updateStarRating();

    }
    public void updateStarRating(){
        int starsEarned = 0;
        for(int i = 0; i < reviewList.size(); i++){
            starsEarned += reviewList.get(i).stars;
        }
        stars = (int) Math.ceil((double) starsEarned/reviewList.size());
    }

}
