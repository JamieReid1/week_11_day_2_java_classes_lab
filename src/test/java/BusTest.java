import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;

    @Before
    public void before(){

        bus = new Bus("Ocean Terminal", 40);

    }

    @Test
    public void hasADestination(){
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(40, bus.getCapacity());
    }

}
