
package Res;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        System.out.println("ReSolved Lab07 ~Ali Akef~");
        Resturant resturant = new Resturant("Sharaf Al-Deen" , 5 , 30);
        System.out.println(resturant.toString());
        Review review0 = new Review("Ali" , "Very Good" , 4);
        Review review1 = new Review("Anas" , "Good" , 3);
        Review review2 = new Review("Khalid" , "Excellent" , 5);
        Review review3 = new Review("Fawzi" , "Poor" , 1);
        resturant.addReivew(review0);
        resturant.addReivew(review1);
        resturant.addReivew(review2);
        resturant.addReivew(review3);
        System.out.println(resturant.toString());

//        Shop movieShop = new Shop("Movie Shop" , "Movie Film and Game Store" , 5);
//        Review review4 = new Review("Ali" , "Excellent" , 5);
//        Review review5 = new Review("Ahmad" , "Excellent" , 5);
//        Review review6 = new Review("Batool" , "Very Good" , 4);
//        Review review7 = new Review("Khalid" , "Very Good" , 4);
//        movieShop.addReivew(review4);
//        movieShop.addReivew(review5);
//        movieShop.addReivew(review6);
//        movieShop.addReivew(review7);
//        System.out.println(movieShop.getShopName());

        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        Theater theater = new Theater("Fast" , list);
        System.out.println(theater.toString());
        theater.addTheater("Fouth");
        System.out.println(theater.toString());
        theater.removeTheater("Third");
        System.out.println(theater.toString());
    }
}
