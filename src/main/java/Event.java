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

  public Integer getFoodPrice(int foodIndex) {
    Integer foodPrice = 0;
    String[] foodOptions = {"burrito bar", "pizza party", "ice cream sundaes"};

    if ( foodOptions[foodIndex].equals("burrito bar") ) {
      return foodPrice += mGuest * 8;
    } else if ( foodOptions[foodIndex].equals("pizza party") ) {
      return foodPrice += mGuest * 10;
    } else if ( foodOptions[foodIndex].equals("ice cream sundaes") ) {
      return foodPrice += mGuest * 6;
    }
    return foodPrice;
  }

  public Integer getDrinkPrice(int drinkIndex) {
    Integer drinkPrice = 0;
    String[] drinkOptions = {"coffee and tea", "beer and wine", "cocktails"};

    if ( drinkOptions[drinkIndex].equals("coffee and tea") ) {
      return drinkPrice += mGuest * 4;
    } else if ( drinkOptions[drinkIndex].equals("beer and wine") ) {
      return drinkPrice += mGuest * 12;
    } else if ( drinkOptions[drinkIndex].equals("cocktails") ) {
      return drinkPrice += mGuest * 18;
    }
    return drinkPrice;
  }

}
