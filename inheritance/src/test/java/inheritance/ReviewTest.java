package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testSomeLibraryMethod() {
        assertTrue(true);
    }

    @Test public void testRevConstructor(){
        Review newReview = new Review("IHOP",4,"$$", "Pancakes are great, but avoid the BLT", "Mary N");
        assertEquals("Pancakes are great, but avoid the BLT", newReview.body);
        assertEquals("Mary N", newReview.author);
        assertEquals(4, newReview.stars);

    }
    @Test public void testRevString(){
        Review newReview = new Review("IHOP",4,"$$", "Pancakes are great, but avoid the BLT", "Mary N");
        assertEquals("\nReview for: IHOP By: Mary N \nBody: Pancakes are great, but avoid the BLT\n Stars: 4\n Price: $$\n", newReview.toString());
        System.out.println(newReview.toString());

    }
}
