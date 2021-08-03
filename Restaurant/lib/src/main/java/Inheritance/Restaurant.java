package Inheritance;

import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant extends Review implements toStringInterFace,outPutInterFace {
    private String resName;
    private int restStartNumber;
    private int priceCategory;
    private HashMap<String, HashMap<String,ArrayList<String>>> all;
    HashMap<String, ArrayList<String>> resturantMap =new HashMap<>();
    ArrayList<String> resturantList = new ArrayList<>();

    /*public Restaurant(String resName , int restStartNumber , int priceCategory){
        this.resName = resName;
        this.restStartNumber = restStartNumber;
        this.priceCategory = priceCategory;
    }*/

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

    public Restaurant(String body, String author, int stars) {
        super(body,author, stars );
        this.all=all;
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

        resturantList.add(review.getauthor());
        resturantList.add(review.getbody());
        resturantList.add(String.valueOf(review.getStar()));
        resturantList.add("-->");
        OutPut();
    }

    @Override
    public void OutPut() {

    }
}
