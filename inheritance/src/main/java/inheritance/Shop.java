package inheritance;

public class Shop {
    String name;
    String description;
    String price;

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String toString(){
        String output = String.format("\n Name: %s\n Description: %s\n Price: %s\n", name, description, price);
        return output;
    }

}
