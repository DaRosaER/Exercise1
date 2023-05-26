package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * 
 * @author Eric DaRosa, May 26, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        double y = 0;
        

        for (int i = 0; i < 5; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue(7);
            card.setSuit("Clubs");
            double x = Math.random();
            y = x;
            i++;
        }

        System.out.println("Which suit would you like?");
        
        if (y == 5) {
        printInfo();
        }
    }
    
    /*
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Eric DaRosa 2023
     */
    
    private static void printInfo() {
        
        // I'm Done!
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Eric, and I love computers!");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Work in IT");
        System.out.println("-- Score well in all classes!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Music");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV");
        System.out.println("-- Driving my car!");

        System.out.println();
    }
    
}
