package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(13, 1.50, 20.00);
        visitor2 = new Visitor(11, 1.50, 20.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canCharge() {
        assertEquals(4.50, dodgems.charge(visitor1), 0.1);
    }

    @Test
    public void canChargeDiscounted() {
        assertEquals(2.25, dodgems.charge(visitor2), 0.1);
    }
}
