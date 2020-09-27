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
        assertEquals("\n Name: Ace\n Description: The Helpful Place\n Rating: 4\n", newShop.toString());
        System.out.println(newShop.toString());

    }
}


