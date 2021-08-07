package Res;

import java.util.ArrayList;

public class Theater implements AddReview{
    private String theaterNane;
    private int numOfStar;
    private ArrayList<String> theaterList;
    private ArrayList<Review> reviewTheater;

    public Theater(String name, ArrayList<String> moviesList) {
        this.theaterNane = name;
        this.theaterList = moviesList;
    }

    public String getTheaterNane() {
        return theaterNane;
    }

    public int getNumOfStar() {
        return numOfStar;
    }

    public ArrayList<Review> getReviewTheater() {
        return reviewTheater;
    }

    public ArrayList<String> getTheaterList() {
        return theaterList;
    }

    public void setNumOfStar(int numOfStar) {
        this.numOfStar = numOfStar;
    }

    public void setReviewTheater(ArrayList<Review> reviewTheater) {
        this.reviewTheater = reviewTheater;
    }

    public void setTheaterList(ArrayList<String> theaterList) {
        this.theaterList = theaterList;
    }

    public void setTheaterNane(String theaterNane) {
        this.theaterNane = theaterNane;
    }

    //Add Movies
    public void addTheater(String theaterName){
        theaterList.add(theaterName);
    }

    //remove
    public void removeTheater(String name){
        theaterList.remove(name);
    }

    @Override
    public void addReivew(Review review) {
        this.numOfStar = (this.numOfStar * reviewTheater.size() + review.getStar()) / reviewTheater.size()+1;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "theaterNane='" + theaterNane + '\'' +
                ", theaterList=" + theaterList +
                '}';
    }
}
