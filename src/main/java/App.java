import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    boolean programRunning = true;

    while(programRunning) {
      System.out.println("So I hear you are planning a party and need my services." + "\n" + "I'll need some details about your event, then I will give you an estimate" + "\n" + "First, how many guests are you anticipating?");

      Event newEvent = new Event(Integer.parseInt(myConsole.readLine()));

      System.out.println("Got it. You will be having " + newEvent.getGuest() + " guests at your shindig." + "\n" + "Next, please choose from the following food options:" + "\n" + "1: Build Your Own Burrito Bar" + "\n" + "2: Let's Get This Pizza Party Started" + "\n" + "3: You Scream, I Scream for Ice Cream Sundaes");
      int foodIndex = Integer.parseInt(myConsole.readLine()) - 1;
      Integer foodPrice = 0;
      if (foodIndex == 0) {
        foodPrice = newEvent.getFoodPrice(foodIndex);
      } else if (foodIndex == 1) {
        foodPrice = newEvent.getFoodPrice(foodIndex);
      } else if (foodIndex == 2) {
        foodPrice = newEvent.getFoodPrice(foodIndex);
      }

      System.out.println("Wise choice. Your food total: " + foodPrice + "\n" + "Now I need to know what kind of beverages you would like, choose from the following:" + "\n" + "1: Budget and Family Friendly with Coffee, Tea, and Juice" + "\n" + "2: Keep it Loose with Beer and Wine" + "\n" + "3: I Like to Party Hard so Bring on the Hard Alcohol");
      int drinkIndex = Integer.parseInt(myConsole.readLine()) - 1;
      Integer drinkPrice = 0;
      if (drinkIndex == 0) {
        drinkPrice = newEvent.getDrinkPrice(drinkIndex);
      } else if (drinkIndex == 1) {
        drinkPrice = newEvent.getDrinkPrice(drinkIndex);
      } else if (drinkIndex == 2) {
        drinkPrice = newEvent.getDrinkPrice(drinkIndex);
      }

      System.out.println("This party is really coming together. Your total for drinks: " + drinkPrice + "\n" + "What's a party without kickass entertainment? It's lame, so pick an option:" + "\n" + "1: A Magician Named Gob" + "\n" + "2: DJ Jazzy Jeff" + "\n" + "3: Who Doesn't Love Karaoke?" + "\n" + "4: Mother Goose's Discount Petting Zoo");
      int entertainmentIndex = Integer.parseInt(myConsole.readLine()) - 1;
      Integer entertainmentPrice = 0;
      if (entertainmentIndex == 0) {
        entertainmentPrice = newEvent.getEntertainmentPrice(entertainmentIndex);
      } else if (entertainmentIndex == 1) {
        entertainmentPrice = newEvent.getEntertainmentPrice(entertainmentIndex);
      } else if (entertainmentIndex == 2) {
        entertainmentPrice = newEvent.getEntertainmentPrice(entertainmentIndex);
      } else if (entertainmentIndex == 3) {
        entertainmentPrice = newEvent.getEntertainmentPrice(entertainmentIndex);
      }

      Integer partyPrice = newEvent.getPartyPrice(foodIndex, drinkIndex, entertainmentIndex);

      System.out.println("Here's the price for your priceless entertainment: " + entertainmentPrice + "\n" + "You are sure to impress with this party, but it's going to cost you. Here's your total: " + partyPrice + "\n" + "Do you have any coupon codes you would like to apply?" + "\n" + "Y or N");

      String hasCoupon = myConsole.readLine();
      if ( hasCoupon.equals("Y") ) {
        System.out.println("Enter coupon code: ");
        String userCouponCode = myConsole.readLine();
        Integer discountPartyPrice = newEvent.calculateDiscountedPrice(foodIndex, drinkIndex, entertainmentIndex, userCouponCode);
        if ( newEvent.getCoupon(userCouponCode) == 0 ) {
          System.out.println("Looks like we were not able to apply your coupon. " + "Your total remains: " + partyPrice);
        } else {
          System.out.println("Perfect, we deducted your coupon." + "\n" + "Your new total: " + discountPartyPrice);
        }
      }
      System.out.println("OK, then your total price for this fabulous party is: " + partyPrice + "\n" + "Would you like to book another party?" + "\n" + "Y or N");
      if ( myConsole.readLine().equals("N") ) {
        programRunning = false;
      }
    }
  }
}
