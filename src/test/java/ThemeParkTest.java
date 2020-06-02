import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

public class ThemeParkTest {

    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    Visitor visitor;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;
    ThemePark themePark;

    @Before
    public void setUp() {
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor = new Visitor(14, 1.2, 40.0);

        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollerCoaster);

        themePark.addReviewedItem(dodgems);
        themePark.addReviewedItem(park);
        themePark.addReviewedItem(playground);
        themePark.addReviewedItem(rollerCoaster);
        themePark.addReviewedItem(candyflossStall);
        themePark.addReviewedItem(iceCreamStall);
        themePark.addReviewedItem(tobaccoStall);
    }

}
