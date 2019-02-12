import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){

        busStop = new BusStop("Princes Street");
        person = new Person();

    }


    @Test
    public void hasAName(){
        assertEquals("Princes Street", busStop.getName());
    }

    @Test
    public void hasQueueStartsEmpty(){
        assertEquals(0, busStop.queueLength());
    }

    @Test
    public void canAddAPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueLength());
    }

}
