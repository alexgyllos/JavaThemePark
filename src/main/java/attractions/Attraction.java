package attractions;

import behaviours.IReviewed;

import java.util.HashMap;

public abstract class Attraction implements IReviewed {
    private String name;
    private int rating;
    private int visitCount;
    private HashMap<String, Integer> review;


    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
        review = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void increaseVisitCount() {
        this.visitCount += 1;
    }

    @Override
    public HashMap<String, Integer> review(String name, int rating) {
        review.put(name, rating);
        return review;
    }

}
