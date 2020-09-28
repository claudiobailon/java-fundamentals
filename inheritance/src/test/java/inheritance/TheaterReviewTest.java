package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterReviewTest {
    @Test
    public void theaterReviewTest(){
        Theater AMC = new Theater("AMC","America's Hometown Theatres", 4);

        AMC.addMovie("Tenet");
        AMC.addMovie("New Mutants");
        AMC.addMovie("Unhinged");

        TheaterReview newTheaterReview = new TheaterReview("Groundbreaking movie and great theater experience!",
                "Jon W", 5, "Tenet");
        Review newReview = new Review("Best popcorn in town but worse seats",
                "Amy C", 3);

        AMC.addMovieReview(newTheaterReview);
        AMC.addReview(newReview);

        assertEquals("Tenet",newTheaterReview.getMovie());
        assertEquals(2, AMC.reviewList.size());//adding a movieReview and review both go to reviewList
        assertEquals(4, AMC.getStars());

    }
    @Test public void testMovieRevString(){
        TheaterReview newTheaterReview = new TheaterReview("Groundbreaking movie and great theater experience!",
                "Jon W", 5, "Tenet");
        Review newReview = new Review("Best popcorn in town but worse seats",
                "Amy C", 3);

        assertEquals("\n Reviewer: Jon W \n Movie Watched: Tenet\n " +
                "Review: Groundbreaking movie and great theater experience!\n Stars: 5\n",
                newTheaterReview.toString());
        assertEquals("\n Reviewer: Amy C \n " +
                        "Review: Best popcorn in town but worse seats\n Stars: 3\n",
                newReview.toString());

    }
}
