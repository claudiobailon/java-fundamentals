## Inheritance
### Overview
This includes two classes, one for restaurants and one for reviews.  Each has a constructor and toString method.

<br>Lab07 Update: Added a new super class Shop that restaurants, and a new class theaters, extend from.  Theaters have an addMovie and a removeMovie function to add or remove movies from their nowShowing array list. I also added a new class called theaterReview that extends the Review class with the ability to store the movie that was watched in the review.  Reviews can be added to an ArrayList for the shop, restaurant, or theater they are reviewing.   
### Testing
ReviewTest.java and RestaurantTest.java can be run to test the constructors and toString methods.  ./gradlew test can be run from the terminal to test as well.

<br>Lab07 Update: Added ShopTest.java, TheaterTest.java, and TheaterReviewTest.java.  These test the constructor and toString methods of their respective classes, as well as the updateStarRating, add movie, remove movie, and add review methods.   