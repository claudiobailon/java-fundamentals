package inheritance;


import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test public void testShopConstructor(){
        Shop newShop = new Shop("Ace", "The Helpful Place", 4);
        assertEquals("Ace", newShop.getName());
        assertEquals("The Helpful Place", newShop.getDescription());
        assertEquals(4, newShop.getStars());
    }
    @Test public void testShopString(){
        Shop newShop = new Shop("Ace", "The Helpful Place", 4);
        assertEquals("\n Name: Ace\n Description: The Helpful Place\n Rating: 4 Stars\n", newShop.toString());
        System.out.println(newShop.toString());

    }
    @Test public void testShopAddReview(){
        Review newReview = new Review("Great selection and helpflul people!","Mary N",4);
        Review anotherNewReview = new Review("Poor service and no inventory. Go somewhere else!", "Karen S", 1);
        Shop newShop = new Shop("Ace", "The Helpful Place",4);
        newShop.addReview(newReview);
        newShop.addReview(anotherNewReview);
        assertEquals(3,newShop.getStars());
    }
}


