package Inheritance;

import java.util.ArrayList;
import java.util.HashMap;

public class Theater extends Review implements toStringInterFace,outPutInterFace {

    private String theaterName;
    private String movie ;
    private boolean isShow;
    HashMap<Boolean,String> onTheShow = new HashMap<>() ;

    public Theater(){}

    public Theater(String name , String movie , boolean show){
        this.theaterName = name;
        this.movie = movie;
        this.isShow = show;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public String getMovie() {
        return movie;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    ArrayList<String> allMovie = new ArrayList<>();
    private HashMap<String,HashMap<String,ArrayList<String>>> all;
    HashMap<String, ArrayList<String>> movieMap=new HashMap<>();
    /*private String author;
    private String body;
    private int stars;
    private HashMap all;*/
    public Theater(String body, String author, int stars,String movie,HashMap all) {
        super(body,author, stars,all );
        this.all=all;
        this.movie=movie;
        allMovie.add(movie);
    }

    public Theater(String movie,boolean isOnShow){
        this.movie=movie;
        this.onTheShow.put(isOnShow,movie);
        if(!allMovie.contains(movie)){allMovie.add(movie);};
    }

    public void addMovie(String movie,boolean onSecreen){

        if(onTheShow.isEmpty() || !allMovie.contains(movie)){
            allMovie.add(movie);
            onTheShow.put(onSecreen,movie);
        }
        else {
            allMovie.add(movie);
            onTheShow.put(onSecreen,movie);
        }
    }

    public void whichMovieOnSecreen(){
        System.out.println( "the movie on the show is : " +onTheShow.get(true));
    }

    public void removeMovie(String movie){
        if(allMovie.contains(movie)){
            allMovie.remove(movie);
            onTheShow.put(false,movie);

        }
        else {
            System.out.println(movie + "Does not exisit");
        }

    }

    @Override
    public String tostring(){
        for (int i=0;i< allMovie.size();i++){
            System.out.println(allMovie.get(i));
        }
        return "";
    }

    public void addReview(Review review){
        allMovie.add(review.getauthor());
        allMovie.add(review.getbody());
        allMovie.add(String.valueOf(review.getStar()));
        OutPut();
    }

    @Override
    public void OutPut() {
        movieMap.put(getMovie(),allMovie);
        System.out.println("");
        all.put("Movie", movieMap);
        System.out.println(all.get("Movie"));
    }
}
