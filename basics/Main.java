import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main{
    public static String pluralize(String animalName , int numberOfAnimal){
        if (numberOfAnimal == 1){
            return animalName;
        }
        else{
            return animalName + "s";
        }
    }

    public static void flipNHeads(int n){
        int headsNumRow = 0 ;
        int NUM = 0 ;
        while(headsNumRow<n){
            NUM++;
            if(Math.random() < 0.5){
                System.out.println("tails");
                headsNumRow = 0;
            }
            else{
                System.out.println("heads");
                headsNumRow ++ ;
            }
        }
        String FLIP = " flips" ;
        String HEAD = " heads";
        if(NUM<=1) {
            FLIP = " flip";
            HEAD = " head";
        }
        System.out.println("It took " + NUM + FLIP + " to flip " + n + HEAD + " in a row.");
    }

    public static void clock(){
        int currentSec = 0 ;
        for(int i = 0 ; i>=0 ; i++) {
            LocalDateTime now = LocalDateTime.now();
            int second = now.getSecond();
            if(currentSec != second){
                currentSec = second ;
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Hello World!");
        flipNHeads(2);
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        clock();
    }
}