package behaviours;

import people.Visitor;

import java.util.HashMap;

public interface IReviewed {

    public HashMap<String, Integer> review(String name, int rating);
}
