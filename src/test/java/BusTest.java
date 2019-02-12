import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){

        bus = new Bus("Ocean Terminal", 2);
        person = new Person();
        busStop = new BusStop("Princes Street");

    }

    @Test
    public void hasADestination(){
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bus.getCapacity());
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

    @Test
    public void canOnlyAddPassengersIfEnoughSpace(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canPickUpPerson(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        assertEquals(2, busStop.queueLength());
        busStop.removePerson();
        assertEquals(1, busStop.queueLength());
        bus.pickUpPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

}
