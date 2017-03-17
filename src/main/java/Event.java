import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Event {
  private int mGuest;


  public Event(int guest){
    mGuest = guest;
  }

  public int getGuest() {
    return mGuest;
  }

  public Integer getPrice(int index) {
    Integer partyPrice = 0;
    Integer foodPrice = 0;
    String[] foodOptions = {"burrito bar", "pizza party", "ice cream sundaes"};

    if ( foodOptions[index].equals("burrito bar") ) {
      return foodPrice = mGuest * 8;
    } else if ( foodOptions[index].equals("pizza party") ) {
      return foodPrice = mGuest * 10;
    } else if ( foodOptions[index].equals("ice cream sundaes") ) {
      return foodPrice = mGuest * 6;
    }
    return partyPrice += foodPrice;
  }
}
