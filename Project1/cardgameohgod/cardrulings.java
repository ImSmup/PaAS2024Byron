package cardgameohgod;
public class cardrulings {
    
}


//Both players need to have a 60 card deck.

//No more than 4 of a card, EXCEPT if it is an energy.
//There are 3 types of cards, Pokemon, Trainers and Energy cards.


//At the start of the game, both players draw 7 cards.

//If there is no Pokemon in your hand, you have to redraw a new hand and the opponent gets one card for free.

//After this, both players take 6 cards and puts them aside. These are called Prizes.

//Each time you knock out a Pokemon, you get one of your prizes to your hand.

//YOu win the game when you collect all 6 prizes.

//Each player takes a turn. On their turn, they can draw a card. Put a Pokemon into Play. Put an Energy on a Pokemon(Once per turn). Play Trainer Cards. And Attack (Which ends their turn).

//To attack, your pokemon must have energy. It deals damage to opponents HP.

//There are 6 spots on each persons field. One active spotm 5 are the bench spots. This means at most, you can have 6 pokemon in play, but only one in the front spot, called the active, can attack.

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//Start by writing a card class.
//Write a loop that can fill an array with 60 of these cards.
//Write a loop that can "draw" 7 cards from the deck.
//Write an evaluator that determines if there are any pokemon in the hand.

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//With those set, we can write a monte carlo experiment.

//What if the deck has only 1 pokemon, how many reshuffles do you have t take on avg to tke your first turn?

//What if the deck has 2... What if the deck has 3... Write an engine that generates 1-60 pokemon in the deck, output the odds of having a pokemon in your opening hand. Graph this in Excel.