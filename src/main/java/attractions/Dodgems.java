package attractions;

import behaviours.ITicketed;
import people.Visitor;

import java.util.HashMap;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double charge(Visitor visitor) {
        double fee = 4.50;
        if(visitor.getAge() <= 12){
            return (fee / 2);
        } else {
            return fee;
        }
    }
}
