package Res;

import java.util.ArrayList;

public class Shop implements AddReview{
    private String shopName;
    private String shopdescripe;
    private int numberOfDollarSign;

    public Shop(){}
    public Shop(String shopName ,String shopdescripe , int numberOfDollarSign ){
        this.numberOfDollarSign = numberOfDollarSign;
        this.shopdescripe = shopdescripe;
        this.shopName= shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public int getNumberOfDollarSign() {
        return numberOfDollarSign;
    }

    public String getShopdescripe() {
        return shopdescripe;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setNumberOfDollarSign(int numberOfDollarSign) {
        this.numberOfDollarSign = numberOfDollarSign;
    }

    public void setShopdescripe(String shopdescripe) {
        this.shopdescripe = shopdescripe;
    }

    private int numStars;
    private ArrayList<Review> arr;

    public int getNumStars() {
        return numStars;
    }


    public ArrayList<Review> getArr() {
        return arr;
    }
    @Override
    public void addReivew(Review review) {
        this.numStars = ((this.numStars * arr.size()) + review.getStar()) / (arr.size()+1);
        arr.add(review);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shopdescripe='" + shopdescripe + '\'' +
                ", numberOfDollarSign=" + numberOfDollarSign +
                ", numStars=" + numStars +
                ", arr=" + arr +
                '}';
    }
}
