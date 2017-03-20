import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Event {
  private int mGuest;
  private Integer mFoodPrice;
  private Integer mDrinkPrice;
  private Integer mEntertainmentPrice;
  private Integer mCoupon;
  private Integer mPartyPrice;

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
    return mFoodPrice;
  }

  public Integer getDrinkPrice(int drinkIndex) {
    Integer drinkPrice = 0;
    String[] drinkOptions = {"coffee", "beer and wine", "cocktails"};
    for (int i=0; i <= drinkIndex; i++) {
      drinkPrice += mGuest * 5;
    }
    return drinkPrice;
  }

  public Integer getEntertainmentPrice(int entertainmentIndex) {
    Integer entertainmentPrice = 0;
    String[] entertainmentOptions = {"karaoke", "magician", "dj", "petting zoo"};

    for (int i = 0; i <= entertainmentIndex; i++) {
      entertainmentPrice += 150;
    }
    return entertainmentPrice;
  }

  public Integer getPartyPrice(int foodIndex, int drinkIndex, int entertainmentIndex){
    Integer partyPrice = 0;
    partyPrice = getFoodPrice(foodIndex) + getDrinkPrice(drinkIndex) + getEntertainmentPrice(entertainmentIndex);
    return partyPrice;
  }

  public Integer getCoupon(String couponCode) {
    mCoupon = 0;
    if ( couponCode.equals("iHaveACoupon") ) {
      mCoupon = -50;
    } else if ( couponCode.equals("letsgetthispartystarted") ) {
      if ( mGuest >= 75 ) {
        mCoupon = -150;
      }
      return mCoupon;
    }
    return mCoupon;
  }

  public Integer calculateDiscountedPrice(int foodIndex, int drinkIndex, int entertainmentIndex, String couponCode) {
    Integer partyPriceDiscounted = 0;
    partyPriceDiscounted = getFoodPrice(foodIndex) + getDrinkPrice(drinkIndex) + getEntertainmentPrice(entertainmentIndex) + getCoupon(couponCode);
    return partyPriceDiscounted;
  }
}
