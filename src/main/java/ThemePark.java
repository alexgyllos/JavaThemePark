import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> reviewed;
    private ArrayList<Attraction> attractions;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.reviewed = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addReviewedItem(IReviewed item) {
        this.reviewed.add(item);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewed;
    }

//    public HashMap<String, Integer> returnReviews() {
//        for (item: reviewed){
//        }
//    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addAttraction(attraction);
        attraction.increaseVisitCount();
    }
}
