package inheritance;

public class Restaurant {
    String name;
    int stars;
    int priceCategory;

    public  Restaurant(String name, int stars, int prceCategory){
        this.name = name;
        this.stars = stars;
        this.priceCategory = prceCategory;
    }
    public String toString(){
        String output = String.format("\n Name: %s\n Stars: %d\n Price Category: %d\n", name, stars, priceCategory);
        return output;
    }
}
