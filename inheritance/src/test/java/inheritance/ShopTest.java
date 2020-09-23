package inheritance;


import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test public void testShopConstructor(){
        Shop newShop = new Shop("Ace", "The Helpful Place", "$$");
        assertEquals("Ace", newShop.name);
        assertEquals("The Helpful Place", newShop.description);
        assertEquals("$$", newShop.price);
    }
    @Test public void testShopString(){
        Shop newShop = new Shop("Ace", "The Helpful Place", "$$");
        assertEquals("\n Name: Ace\n Description: The Helpful Place\n Price: $$\n", newShop.toString());
        System.out.println(newShop.toString());

    }
}



