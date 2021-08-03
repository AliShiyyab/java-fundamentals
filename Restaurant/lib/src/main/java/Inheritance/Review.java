package Inheritance;

import java.util.HashMap;

public class Review implements toStringInterFace{
    //should have a body, an author, and a number of stars.
    private String author;
    private String body;
    private int stars;
    private HashMap all;

    public Review(String author , String body , int stars , HashMap all){
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.all = all;
    }

    public Review(){
        this.author = "Ali";
        this.body = "Good";
        this.stars = 4;
    }

    public Review(String author , String body , int stars ){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public String getbody(){
        return body;
    }

    public int getStar(){
        return stars;
    }

    public String getauthor(){
        return author;
    }

    public void setName(String body){
        this.body = body;
    }

    public void setPrice(String author){
        this.author = author;
    }

    public void setStar(int restStartNumber){
        if (restStartNumber >= 0 && restStartNumber <= 5){
            this.stars = restStartNumber;
        }
    }

    @Override
    public String tostring() {
        String result = "the Customers "+this.author + " voted " +this.stars +" stars " + this.body;
        return result;
    }
}
