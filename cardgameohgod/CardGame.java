package cardgameohgod;
import java.util.ArrayList;
import java.util.*;
public class CardGame {

    /*
     * Initializers for the Array Lists for all of the different attributes.
     */
    private ArrayList<Card> deck; 
    private ArrayList<Card> hand; 
    private ArrayList<Card> prize;
    private ArrayList<Card> active;
    private ArrayList<Card> bench;
    private ArrayList<Card> oppDeck;
    private ArrayList<Card> oppHand;
    private ArrayList<Card> oppPrize;
    private ArrayList<Card> oppActive;
    private ArrayList<Card> oppBench;

    /*
     * Constructor for the game.
     */
    public CardGame(){
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        oppHand = new ArrayList<>();
        prize = new ArrayList<>();
        active = new ArrayList<>();
        bench = new ArrayList<>();
    }


    /*
     * Fills and Initializes the Deck with 41 Trainers, 15 Energies and 4 Pokemon for both the Opponent and the Player.
     */
    public void fillDeck(){ //Fill your deck and the Opponents deck with 60 cards at the start of the game.
        for(int i = 0; i < 41; i++){
            deck.add(new Trainer() );
            oppDeck.add(new Trainer() );
        }

        for(int i = 0; i < 15; i++){
            deck.add(new Energy());
            oppDeck.add(new Energy());
        }

        deck.add(new Charmander());
        deck.add(new Bulbasaur());
        deck.add(new Scraggy());
        deck.add(new Squirtle());
        oppDeck.add(new Charmander());
        oppDeck.add(new Bulbasaur());
        oppDeck.add(new Scraggy());
        oppDeck.add(new Squirtle());
    }

    /*
     * Return the Hand as a String.
     */
    public String sayHand(){
        String r = "";
        for(int i = 0; i < hand.size(); i++){
            r = r + " " + hand.get(i);
        }
        return r;
    }
    
    /*
     * Draw 7 Cards for the Hands of both the Opponent and the Player.
     */
    public void drawHand(){ 
        Random rng = new Random();
        for(int i = 0; i<7; i++){
            int cardToTakeIndex = rng.nextInt(deck.size());
            hand.add(deck.get(cardToTakeIndex));
            deck.remove(cardToTakeIndex);
        }

        for(int i = 0; i<7; i++){
            int cardToTakeIndex = rng.nextInt(oppDeck.size());
            oppHand.add(deck.get(cardToTakeIndex));
            oppDeck.remove(cardToTakeIndex);
        }
    }


    /*
     * Play a card from your hand to the active position and remove it from your hand.
     */
    public void playCard(Card userChoice){

        if(userChoice instanceof Pokemon){
            active.add(userChoice);
        }
        hand.remove(userChoice);

    }

    /*
     * Set the Prize Pool with 6 cards from the deck and remove them from the deck.
     */
    public void setPrizePool(){
        Random rng = new Random();
        for(int i = 0; i < 6; i++){ 
            int cardToTakeIndex = rng.nextInt(deck.size()); // Take a random int from whatever is left from the Deck.
            prize.add(deck.get(cardToTakeIndex)); //Add that random int at the index of the deck to the Prizes.
            deck.remove(cardToTakeIndex); //Remove it from the deck after it was added.
        }


    }

    /*
     * Look for a Pokemon Instance in the cards in the hand. Mainly for testing and an output for probability.
     * Returns Boolean results.
     */
    public boolean lookForPoke(){
        
        for(Card singleCard : hand){
            if(singleCard instanceof Pokemon){
                return true;
                
            }}
            return false;
        }

    /*
     * Searches your hand for a Pokemon, then plays that Pokemon from your hand.
     */
    public Card playPoke(){ 
        Card holder = new Card(); 
        for(Card singleCard : hand){ 
            if(singleCard instanceof Pokemon){ 
                holder = singleCard; 
                active.add(singleCard);
                hand.remove(singleCard);
                continue;
            }
        }

        return holder;
    }

    /*
     * Start the game and initalize the Decks, Hands, Prize Pools, and fill the Hands with playable cards. 
     * Checks for Pokemon, Outputs the hand, Then goes to play the game.
     */
    public void startGame(){
        hand.clear(); //Clear the hands to start the game.
        oppDeck.clear();
        deck.clear(); //Clear the Decks to start the game.
        oppDeck.clear();
        prize.clear(); //Clear the Prize's to start the game.
        oppPrize.clear();
        fillDeck(); //Fills Both Decks.
        drawHand(); //Draws hands for both players.
        lookForPoke(); //Looks for a Pokemon for the Testing Game probabilities.
        playPoke(); //Plays a pokemon into the Active Position for the start of the game.
        setPrizePool(); //Add 6 cards to the prize pool before the game can begin.
        System.out.println("" + prize); //Says the prizes for testing.
        System.out.println("Your hand is: " + (sayHand() + "")); //Outputs the hand for viewing.
        playGame(); //Shift to playing the game.

        
    }
    /*
     * Where the game is played after it is initialized.
     * A Scanner class asks for inputs.
     */
    public void playGame(){ 
        //Coin flip at start.
        //Heads means the User will go first. Tails means the Opponent will go first.
        //First player goes. Depending on their choice, they can either Play a Card, Pass their Turn, Damage their Opponent, Shift from Active to Bench or Vice Versa
        //Depending on the stage of their turn, they can Draw a Card from their Deck or from their Prize Pool if they deal damage(?). I am not too sure how Pokemon TCG works.
        //When someone runs out of Prize's, the game then ends and the Winner is stated. It will then ask if the User wishes to play again.
    }

}
