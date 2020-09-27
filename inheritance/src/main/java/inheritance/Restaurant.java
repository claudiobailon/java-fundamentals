package inheritance;

import java.util.ArrayList;

public class Restaurant extends Shop {

    String priceCategory;

    public  Restaurant(String name, String description, int stars, String priceCategory){
        super(name,description,stars);
        this.priceCategory = priceCategory;
    }
    public String toString(){
        String output = String.format("\n Name: %s\n Description: %s\n Rating: %d Stars\n Price: %s\n", this.getName(), this.getDescription(), this.getStars(), priceCategory);
        return output;
    }
    public String getPriceCategory(){
        return priceCategory;
    }
    public void setPriceCategory(String priceCategory){
        this.priceCategory = priceCategory;
    }

}
