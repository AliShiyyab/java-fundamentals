package Inheritance;

import java.lang.*;
import java.util.ArrayList;

public class Restaurant {
    private String resName;
    private int restStartNumber;
    private int priceCategory;
    private ArrayList<Review> arr;

    public Restaurant(String resName , int restStartNumber , int priceCategory){
        this.resName = resName;
        this.restStartNumber = restStartNumber;
        this.priceCategory = priceCategory;
        this.arr = new ArrayList<Review>();
    }

    public String getName(){
        return resName;
    }

    public int getStar(){
        return restStartNumber;
    }

    public int getPrice(){
        return priceCategory;
    }

    public void setName(String resName){
        this.resName = resName;
    }

    public void setPrice(int priceCategory){
        this.priceCategory = priceCategory;
    }

    public void setStar(int restStartNumber){
        if (restStartNumber >= 0 && restStartNumber <= 5){
            this.restStartNumber = restStartNumber;
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "resName='" + resName + '\'' +
                ", restStartNumber=" + restStartNumber +
                ", priceCategory=" + priceCategory +
                '}';
    }

    public void addReview(Review review){
        this.arr.add(review);
    }

}
