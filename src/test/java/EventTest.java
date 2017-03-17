import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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

  @Test
  public void getFoodPrice_changePriceFoodChoice_Integer(){
    Event testEvent = new Event(20);
    Integer expectedOutput = 20 * 10;
    assertEquals(expectedOutput, testEvent.getFoodPrice(1));
  }

  @Test
  public void getDrinkPrice_changeDrinkPriceChoice_Integer(){
    Event testEvent = new Event(20);
    Integer expectedOutput = 20 * 12;
    assertEquals(expectedOutput, testEvent.getDrinkPrice(1));
  }
}
