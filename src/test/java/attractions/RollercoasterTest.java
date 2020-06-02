package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 1.30, 20.00);
        visitor2 = new Visitor(18, 2.50, 20.00);
        visitor3 = new Visitor(13, 1.30, 20.00);
        visitor4 = new Visitor(10, 1.50, 20.00);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorUnder145AndUnderAge() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void visitorUnder145AndOverAge() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void visitorOver145AndUnderAge() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void visitorOver145AndOverAge() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canCharge() {
        assertEquals(8.40, rollerCoaster.charge(visitor1), 0.1);
    }

    @Test
    public void canChargeDouble() {
        assertEquals(16.80, rollerCoaster.charge(visitor2), 0.1);
    }

}
