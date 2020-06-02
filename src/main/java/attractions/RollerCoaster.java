package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() > 12 && visitor.getHeight() > 1.45);
    }

    @Override
    public double charge(Visitor visitor) {
        double fee = 8.40;
        if(visitor.getHeight() > 2.00){
            return (fee * 2);
        } else {
            return fee;
        }
    }
}
