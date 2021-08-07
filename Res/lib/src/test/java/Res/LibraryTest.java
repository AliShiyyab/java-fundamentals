/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Res;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testingall() {
        System.out.println("Test Lab07 ~Ali Akef~");
        Resturant resturant = new Resturant("Sharaf Al-Deen" , 5 , 30);
        assertEquals("Restaurant{resName='Sharaf Al-Deen', restStartNumber=5, priceCategory=30}" , resturant.toString());
        Review review0 = new Review("Ali" , "Very Good" , 4);
        Review review1 = new Review("Anas" , "Good" , 3);
        Review review2 = new Review("Khalid" , "Excellent" , 5);
        Review review3 = new Review("Fawzi" , "Poor" , 1);
        resturant.addReivew(review0);
        resturant.addReivew(review1);
        resturant.addReivew(review2);
        resturant.addReivew(review3);
        assertEquals( "Restaurant{resName='Sharaf Al-Deen', restStartNumber=2, priceCategory=30}", resturant.toString());

        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        Theater theater = new Theater("Fast" , list);
        assertEquals("Theater{theaterNane='Fast', theaterList=[First, Second, Third]}" , theater.toString());
        theater.addTheater("Fouth");
        assertEquals("Theater{theaterNane='Fast', theaterList=[First, Second, Third, Fouth]}" , theater.toString());
        theater.removeTheater("Third");
        assertEquals("Theater{theaterNane='Fast', theaterList=[First, Second, Fouth]}" , theater.toString());
    }
}