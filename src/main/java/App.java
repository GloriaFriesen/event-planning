import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    boolean programRunning = true;

    while(programRunning) {
      System.out.println("So I hear you are planning a party and need my services." + "\n" + "I'll need some details about your event, then I will give you an estimate" + "\n" + "First, how many guests are you anticipating?");
      int userGuest =  Integer.parseInt(myConsole.readLine());
      Event newEvent = new Event(userGuest);

      System.out.println("Got it. You will be having " + userGuest + " guests at your shindig." + "\n" + "Next, please choose from the following food options:" + "\n" + "1: Build Your Own Burrito Bar" + "\n" + "2: Let's Get This Pizza Party Started" + "\n" + "3: You Scream, I Scream for Ice Cream Sundaes");
      Integer foodChoice = Integer.parseInt(myConsole.readLine());
      int foodIndex = foodChoice - 1;
      Integer foodPrice = 0;
      if (foodChoice == 0) {
        foodPrice = newEvent.getFoodPrice(foodIndex);
      } else if (foodChoice == 1) {
        foodPrice = newEvent.getFoodPrice(foodIndex);
      } else if (foodChoice == 2) {
        foodPrice = newEvent.getFoodPrice(foodIndex);
      }

      System.out.println("Wise choice. Your food total: " + foodPrice + "\n" + "Now I need to know what kind of beverages you would like, choose from the following:" + "\n" + "1: Budget and Family Friendly with Coffee, Tea, and Juice" + "\n" + "2: Keep it Loose with Beer and Wine" + "\n" + "3: I Like to Party Hard so Bring on the Hard Alcohol");
      Integer drinkChoice = Integer.parseInt(myConsole.readLine());
      int drinkIndex = drinkChoice - 1;
      Integer drinkPrice = 0;
      if (drinkChoice == 0) {
        drinkPrice = newEvent.getDrinkPrice(drinkIndex);
      } else if (drinkChoice == 1) {
        drinkPrice = newEvent.getDrinkPrice(drinkIndex);
      } else if (drinkChoice == 2) {
        drinkPrice = newEvent.getDrinkPrice(drinkIndex);
      }

      System.out.println("This party is really coming together. Your total for drinks: " + drinkPrice + "\n" + "What's a party without kickass entertainment? It's lame, so pick an option:" + "\n" + "1: A Magician Named Gob" + "\n" + "2: DJ Jazzy Jeff" + "\n" + "3: Who Doesn't Love Karaoke?" + "\n" + "4: Mother Goose's Discount Petting Zoo");
      Integer entertainmentChoice = Integer.parseInt(myConsole.readLine());
      int entertainmentIndex = entertainmentChoice - 1;
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

      Integer partyPrice = newEvent.calculatePartyPrice(foodIndex, drinkIndex, entertainmentIndex);

      System.out.println("Here's the price for your priceless entertainment: " + entertainmentPrice + "\n" + "You are sure to impress with this party, but it's going to cost you. Here's your total: " + partyPrice);

    }
  }
}
