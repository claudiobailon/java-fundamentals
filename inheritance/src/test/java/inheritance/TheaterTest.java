package inheritance;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test public void theaterConstructorTest(){
        Theater AMC = new Theater("AMC","America's Hometown Theatres", 4);

        assertEquals("AMC", AMC.getName());
        assertEquals("America's Hometown Theatres", AMC.getDescription());
        assertEquals(4, AMC.getStars());

    }
    @Test public void addMovieTest(){
        Theater AMC = new Theater("AMC","America's Hometown Theatres", 4);

        AMC.addMovie("Tenet");
        AMC.addMovie("New Mutants");
        AMC.addMovie("Unhinged");

        assertEquals("Tenet", AMC.nowShowing.get(0));
        assertEquals("New Mutants", AMC.nowShowing.get(1));
        assertEquals("Unhinged", AMC.nowShowing.get(2));

    }
    @Test public void removeMovieTest(){
        Theater AMC = new Theater("AMC","America's Hometown Theatres", 4);

        AMC.addMovie("Tenet");
        AMC.addMovie("New Mutants");
        AMC.addMovie("Unhinged");

        assertEquals("New Mutants", AMC.nowShowing.get(1));
        assertEquals(3,AMC.nowShowing.size());

        AMC.removeMovie("New Mutants");
        assertEquals("Unhinged", AMC.nowShowing.get(1));//New Mutants should be removed and it's index replaced by Unhinged
        assertEquals(2,AMC.nowShowing.size());//should now be down 1 movie
    }



}
