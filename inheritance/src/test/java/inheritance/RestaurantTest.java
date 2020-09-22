package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testSomeLibraryMethod() {
        assertTrue(true);
    }
    @Test public void testRestConstructor(){
        Restaurant newRestaurant = new Restaurant("IHOP", 4, 2);
        assertEquals("IHOP", newRestaurant.name);
        assertEquals(4, newRestaurant.stars);
        assertEquals(2, newRestaurant.priceCategory);
    }
    @Test public void testRestString(){
        Restaurant newRestaurant = new Restaurant("IHOP", 4, 2);
        assertEquals("\n Name: IHOP\n Stars: 4\n Price Category: 2\n", newRestaurant.toString());
        System.out.println(newRestaurant.toString());

    }
}
