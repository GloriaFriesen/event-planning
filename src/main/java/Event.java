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
    String[] foodOptions = {"ice cream sundaes", "pizza party", "burrito bar"};
    for (int i=0; i <= foodIndex; i++) {
      foodPrice += mGuest * 5;
    }
    return foodPrice;
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
    Integer discountPartyPrice = 0;
    discountPartyPrice = getFoodPrice(foodIndex) + getDrinkPrice(drinkIndex) + getEntertainmentPrice(entertainmentIndex) + getCoupon(couponCode);
    return discountPartyPrice;
  }
}
