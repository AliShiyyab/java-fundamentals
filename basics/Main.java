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
        int flipsNum = 0 ;
        while(headsNumRow<n){
            flipsNum++;
            if(Math.random() < 0.5){
                System.out.println("tails");
                headsNumRow = 0;
            }
            else{
                System.out.println("heads");
                headsNumRow ++ ;
            }
        }
        String wordFlip = " flips" ;
        String wordHead = " heads";
        if(flipsNum<=1) {
            wordFlip = " flip";
            wordHead = " head";
        }
        System.out.println("It took " + flipsNum + wordFlip + " to flip " + n + wordHead + " in a row.");
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
    }
}