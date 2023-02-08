package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
       
       /* for (Card hand1 : hand) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }*/
       
            hand[0]= new Card();
            hand[0].setValue(1);
            hand[0].setSuit("Hearts");        
            hand[1]= new Card();
            hand[1].setValue(2);
            hand[1].setSuit("Clubs");        
            hand[2]= new Card();
            hand[2].setValue(3);
            hand[2].setSuit("Diomonds");
            hand[3]= new Card();
            hand[3].setValue(4);
            hand[3].setSuit("Spades");
            hand[4]= new Card();
            hand[4].setValue(5);
            hand[4].setSuit("Clubs");
            hand[5]= new Card();
            hand[5].setValue(12);
            hand[5].setSuit("Hearts");
            hand[6]= new Card();
            hand[6].setValue(11);
            hand[6].setSuit("Hearts");
            
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        int userValue =input.nextInt();
        System.out.println("Enter suit: ");
        String userSuit= input.nextLine();
        for (Card hand1 : hand) {
            if (hand1.getValue() == userValue && hand1.getSuit().equals(userSuit)) {
                printInfo();
            } //end of if
        } //end of for
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
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
