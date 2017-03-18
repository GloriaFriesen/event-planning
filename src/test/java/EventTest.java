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
  public void getFoodPrice_findFoodPrice_Integer(){
    Event testEvent = new Event(20);
    Integer expectedOutput = 20 * 8;
    assertEquals(expectedOutput, testEvent.getFoodPrice(0));
  }

  @Test
  public void getDrinkPrice_findDrinkPrice_Integer(){
    Event testEvent = new Event(20);
    Integer expectedOutput = 20 * 12;
    assertEquals(expectedOutput, testEvent.getDrinkPrice(1));
  }

  @Test
  public void getEntertainmentPrice_findEntertainmentPrice_Integer(){
    Event testEvent = new Event(20);
    Integer expectedOutput = 600;
    assertEquals(expectedOutput, testEvent.getEntertainmentPrice(3));
  }

  @Test
  public void getPartyPrice_findPartyPrice_Integer(){
    Event testEvent = new Event(20);
    Integer expectedOutput = 1000;
    assertEquals(expectedOutput, testEvent.getPartyPrice(0, 1, 3));
  }

  @Test
  public void getCoupon_findCouponValue_Integer(){
    Event testEvent = new Event(20);
    Integer expectedOutput = -50;
    assertEquals(expectedOutput, testEvent.getCoupon("iHaveACoupon"));
  }

  @Test
  public void getCoupon_findSecondCouponValue_Integer() {
    Event testEvent = new Event(75);
    Integer expectedOutput = -150;
    assertEquals(expectedOutput, testEvent.getCoupon("letsgetthispartystarted"));
  }

  @Test
  public void calculateDiscountedPrice_findPartyPricewithCoupon_Integer(){
    Event testEvent = new Event (20);
    Integer expectedOutput = 990;
    assertEquals(expectedOutput, testEvent.calculateDiscountedPrice(1, 1, 3, "iHaveACoupon"));
  }
}
