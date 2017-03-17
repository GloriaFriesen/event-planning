import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(20);
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void getGuest_createEventWithGuest_20(){
    Event testEvent = new Event(20);
    assertEquals(20, testEvent.getGuest());
  }
}
