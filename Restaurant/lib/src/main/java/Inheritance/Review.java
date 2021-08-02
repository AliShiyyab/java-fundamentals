package Inheritance;

public class Review{
    //should have a body, an author, and a number of stars.
    private String author;
    private String body;
    private int stars;
    private Restaurant restaurant;

    public Review(String author , String body , int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public Review(String author , String body , int stars , Restaurant restaurant){
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.restaurant = restaurant;
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
    public String toString(){
        String result = "the Customers "+this.author + " voted " +this.stars +" stars " + this.body;
        return result;
    }

}
