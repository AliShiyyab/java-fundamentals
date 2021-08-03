import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        Library classUnderTest = new Library();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void testWeatherData(){
        int[][] weeklyMonthTemperatures = {{18,20,16,17,21,22}};
        //
        List<String> stringArray= null;
        stringArray= Collections.singletonList("Never saw temperature: 19");
        assertEquals(stringArray, Library.weatherData(weeklyMonthTemperatures));

        int[][] weeklyMonthTemperatures2 = {{80,84,79,86,81,83,85}};
        //
        List<String> stringArray2= null;
        stringArray2= Collections.singletonList("Never saw temperature: 82");
        assertEquals(stringArray2, Library.weatherData(weeklyMonthTemperatures2));
    }

    @Test public  void tally(){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String result ="";
        //the expecting result
        result="Bush";
        assertEquals(result, Library.tally(votes));
        List<String> votes2 = new ArrayList<>();
        votes2.add("Ali");
        votes2.add("sama");
        votes2.add("Ali");
        votes2.add("ahmad");
        votes2.add("yazan");
        votes2.add("yazan");
        votes2.add("tareq");
        votes2.add("Ali");
        votes2.add("Ali");
        String result2 ="";
        result="Ali";
        assertEquals(result, Library.tally(votes2));
    }
}