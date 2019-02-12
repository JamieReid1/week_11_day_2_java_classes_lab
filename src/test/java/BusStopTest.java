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

}
