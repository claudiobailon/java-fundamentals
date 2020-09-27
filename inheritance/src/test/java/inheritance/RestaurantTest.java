package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testSomeLibraryMethod() {
        assertTrue(true);
    }
    @Test public void testRestConstructor(){
        Restaurant newRestaurant = new Restaurant("IHOP", "The International House of Pancakes",4, "$$");
        assertEquals("IHOP", newRestaurant.getName());
        assertEquals(4, newRestaurant.getStars());
        assertEquals("$$", newRestaurant.priceCategory);
    }
    @Test public void testRestString(){
        Restaurant newRestaurant = new Restaurant("IHOP", "The International House of Pancakes",4, "$$");
        assertEquals("\n Name: IHOP\n Description: The International House of Pancakes\n Stars: 4\n Price: $$\n", newRestaurant.toString());
//        "\n Name: %s\n Description: %s\n Stars: %d\n Price: %s",
        System.out.println(newRestaurant.toString());
    }
    @Test public void testRestAddReview(){
        Review newReview = new Review("Pancakes are great, but avoid the BLT","Mary N",4);
        Review anotherNewReview = new Review("Poor service and cold food. Go somewhere else!", "Karen S", 1);
        Restaurant newRestaurant = new Restaurant("IHOP", "The International House of Pancakes",4, "$$");
        newRestaurant.addReview(newReview);
        newRestaurant.addReview(anotherNewReview);
        assertEquals(3,newRestaurant.getStars());
    }
}
