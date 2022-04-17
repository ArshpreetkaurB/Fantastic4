/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectf4;

/**
 *
 * @author Arshpal Singh
 * @author Navjeet Kaur
 * @author Arshpreet Kaur
 * @author Arunpal Singh
 */
public class CardGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //cards in hand for player 1

        Value[] cardValues = Value.values();

        Suit[] cardSuits = Suit.values();
        
        Card[] hand = CardHandGenerator.generateHand(26, cardValues, cardSuits);

        int scores_player1 = 0;
        int scores_player2 = 0;


        // print them out for debugging purposes
        
        System.out.println("Here are the cards in the hand for player 1:");
        for (Card card : hand) {
            System.out.printf("%s of %s\n", card.getValue(), card.getSuit());
        }

        System.out.println("\n\n");
        //cards in hand for player2

        Value[] cardValues2 = Value.values();

        Suit[] cardSuits2 = Suit.values();
        
        Card[] hand2 = CardHandGenerator.generateHand(26, cardValues2, cardSuits2);

        System.out.println("Here are the cards in the hand for player 2:");
        for (Card card : hand2) {
            System.out.printf("%s of %s\n", card.getValue(), card.getSuit());
        }





        // Now ask the user for a card

        //Player1
        for(int j=0; j<5; j++)
        {System.out.println("\nPick a suit for your card: Player1");
        for (int i = 0; i < cardSuits.length; i++) {
            System.out.println((i + 1) + ": " + cardSuits[i]);
        }
        int suitPosition = input.nextInt() - 1;

        System.out.println("\nEnter a value");
        for (int i = 0; i < cardValues.length; i++) {
            System.out.println((i + 1) + ": " + cardValues[i]);
        }

        int valuePosition = input.nextInt() - 1;

        Card userGuess = new Card(cardValues[valuePosition], 
                cardSuits[suitPosition]);
         
                boolean match = false;
                for (Card card : hand) {
                    if (card.getValue() == userGuess.getValue()
                            && card.getSuit()== userGuess.getSuit()) {
                        match = true;
                        break;
                    }
                }        

                ///Player2 turn
                System.out.println("\nPick a suit for your card: Player2");
                for (int i = 0; i < cardSuits2.length; i++) {
                    System.out.println((i + 1) + ": " + cardSuits2[i]);
                }
                int suitPosition2 = input.nextInt() - 1;
        
                System.out.println("\nEnter a value");
                for (int i = 0; i < cardValues.length; i++) {
                    System.out.println((i + 1) + ": " + cardValues2[i]);
                }
        
                int valuePosition2 = input.nextInt() - 1;
        
                Card userGuess2 = new Card(cardValues2[valuePosition2], 
                        cardSuits[suitPosition2]);
                

       
                        
        if(suitPosition==suitPosition2){
            System.out.println("Player1 wins!\n\n");
            scores_player1 += 1;
        }
        else{
            System.out.println("Player2 wins!\n\n");
            scores_player2 += 1;
        }
    }
       if(scores_player1>scores_player2){
           System.out.println("Player1 wins this round!");
       }
       else{
           System.out.println("Player2 wins this round!");
       }
    }
    
}
