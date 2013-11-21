import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LotTest {

    Lot lot;
    Car car = new Car(1);

    @Test
    public void shouldParkTheCar() {
        lot = new Lot(10);
        assertTrue(lot.isCarParked(car));
    }

    @Test
    public void shouldNotParkTheCarIfNoFreeSpace() {
        lot = new Lot(0);
        assertFalse(lot.isCarParked(car));
    }

    @Test
    public void shouldNotParkTheSameCarTwice(){
        lot = new Lot(3);
        if(lot.isCarParked(car)){
            assertFalse(lot.isCarParked(car));
        }
    }

}
