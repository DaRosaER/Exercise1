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
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
    }
    
}
