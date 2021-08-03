package Inheritance;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop extends Review implements outPutInterFace,toStringInterFace{
    private String shopName;
    private String shopDescribe;
    private String numOfDollar;

    //Constructor
    public Shop(String shopName , String shopDescribe , String numOfDollar){
        super();
        this.shopName = shopName;
        this.shopDescribe = shopDescribe;
        this.numOfDollar = numOfDollar;
    }

    //Default constructor
    public Shop(){
        this.shopName = "Cake Shop";
        this.shopDescribe = "Very Good";
        this.numOfDollar = "5";
    }

    //Constructor
    private HashMap<String,HashMap<String,ArrayList<String>>> all;
    HashMap<String, ArrayList<String>> shopMap=new HashMap<>();
    ArrayList<String> shopList= new ArrayList<>();
    public Shop(String author , String body , int stars , HashMap all){
        super(author, body, stars, all);
        this.all=all;
    }



    //getter
    public String getNumOfDollar() {
        return numOfDollar;
    }

    public String getShopDescribe() {
        return shopDescribe;
    }

    public String getShopName() {
        return shopName;
    }

    //setter
    public void setNumOfDollar(String numOfDollar) {
        this.numOfDollar = numOfDollar;
    }

    public void setShopDescribe(String shopDescribe) {
        this.shopDescribe = shopDescribe;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    @Override
    public void OutPut() {
        shopMap.put(getShopName(),shopList);
        System.out.println();
        all.put("Shop",shopMap);
        System.out.println(all.get("Shop"));
    }

    @Override
    public String tostring() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shopDescribe='" + shopDescribe + '\'' +
                ", numOfDollar=" + numOfDollar +
                '}';
    }
    public void addReview(Review review){
        shopList.add(review.getauthor());
        shopList.add(String.valueOf(review.getStar()));
        shopList.add(review.getbody());
        OutPut();
    }
}
