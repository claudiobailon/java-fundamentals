package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testSomeLibraryMethod() {
        assertTrue(true);
    }
    @Test public void testRevConstructor(){
        Review newReview = new Review("Pancakes are great, but avoid the BLT", "Mary N",4);
        assertEquals("Pancakes are great, but avoid the BLT", newReview.body);
        assertEquals("Mary N", newReview.author);
        assertEquals(4, newReview.stars);
    }
    @Test public void testRevString(){
        Review newReview = new Review("Pancakes are great, but avoid the BLT", "Mary N",4);
        assertEquals("\nBody: Pancakes are great, but avoid the BLT\n By: Mary N\n Stars: 4\n", newReview.toString());
        System.out.println(newReview.toString());

    }
}
