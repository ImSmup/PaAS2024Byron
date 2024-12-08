package cardgameohgod;
//import java.util.*;

public class TestCardGame {
    //private static ArrayList<Boolean> res = new ArrayList<>();
    public static void main(String[] args){
    //ArrayList<Boolean> hold = new ArrayList<>();
    CardGame testin = new CardGame();
        double count = 0;
    for(int i = 0; i < 10; i++){
        testin.startGame();
        //res.add(testin.lookForPoke());
        if(testin.lookForPoke() == true){
            count++;
            continue; 
        }
        continue;
    }

    System.out.println((count/10000)*100 + "%"); //Return the percentage of how many times out of 10000 a pokemon is drawn.
}
}
