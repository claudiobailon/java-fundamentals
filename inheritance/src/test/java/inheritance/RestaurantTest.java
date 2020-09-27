package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testSomeLibraryMethod() {
        assertTrue(true);
    }
    @Test public void testRestConstructor(){
        Restaurant newRestaurant = new Restaurant("IHOP", 4, "$$");
        assertEquals("IHOP", newRestaurant.name);
        assertEquals(4, newRestaurant.stars);
        assertEquals("$$", newRestaurant.priceCategory);
    }
    @Test public void testRestString(){
        Restaurant newRestaurant = new Restaurant("IHOP", 4, "$$");
        assertEquals("\n Name: IHOP\n Stars: 4\n Price Category: $$\n", newRestaurant.toString());
        System.out.println(newRestaurant.toString());
    }
    @Test public void testRestAddReview(){
        Review newReview = new Review("IHOP",4,"$$", "Pancakes are great, but avoid the BLT", "Mary N");
        Review anotherNewReview = new Review("IHOP",1,"$$", "Poor service and cold food. Go somewhere else!", "Karen S");
        Restaurant newRestaurant = new Restaurant("IHOP", 4, "$$");
        newRestaurant.addReview(newReview);
        newRestaurant.addReview(anotherNewReview);
        assertEquals(3,newRestaurant.stars);
    }
}
