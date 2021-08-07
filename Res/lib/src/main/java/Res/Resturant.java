package Res;
import java.lang.*;
import java.util.ArrayList;

public class Resturant implements AddReview{
    private String resName;
    private int restStartNumber;
    private int priceCategory;
    private ArrayList<Review> arr;

    public Resturant(String resName , int restStartNumber , int priceCategory){
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

    public ArrayList<Review> getReview(){
        return arr;
    }


    @Override
    public void addReivew(Review review) {
        this.restStartNumber = ((this.restStartNumber * arr.size()) + review.getStar()) / (arr.size()+1);
        arr.add(review);
    }
}
