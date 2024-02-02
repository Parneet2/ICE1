/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//@Modifier Parneet Kaur
//Student Number - 991714898
package card;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(generateRandomValue());
            c.setSuit(Card.SUITS[generateRandomSuit()]);
            magicHand[i] = c;
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        Card luckyCard = new Card();
        luckyCard.setValue(2);  
        luckyCard.setSuit("Clubs");  
        magicHand[magicHand.length - 1] = luckyCard;
        int userValue = 2;  
        String userSuit = "Clubs";  
        
        System.out.println("Magic Hand:");
        for (Card card : magicHand) {
            System.out.println("Card: " + card.getValue() + " of " + card.getSuit());
        }
        //insert code to ask the user for Card value and suit, create their card
       // Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter card value: ");
       // int userValue = scanner.nextInt();
       // System.out.print("Enter card suit (Hearts, Diamonds, Clubs, Spades): ");
        //String userSuit = scanner.next();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        // and search magicHand here
        
        // boolean found = false;
        //for (Card card : magicHand) {
         //   if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
           //     found = true;
             //   break;
            //}
        //}
          boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) {
                found = true;
                break;
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
       private static int generateRandomValue() {
        return (int) (Math.random() * 13) + 1; // Range 1-13
    }

    private static int generateRandomSuit() {
        return (int) (Math.random() * Card.SUITS.length);
    }
}
        // add one luckcard hard code 2,clubs

    
