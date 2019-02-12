import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){

        bus = new Bus("Ocean Terminal", 40);
        person = new Person();

    }

    @Test
    public void hasADestination(){
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(40, bus.getCapacity());
    }

    @Test
    public void canTakePassengersStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

}
