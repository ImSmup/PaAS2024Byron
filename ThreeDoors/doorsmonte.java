package ThreeDoors;
import java.util.Random;

public class doorsmonte {
    

    public double monteDoors(int runtime, boolean swap){
        int hittime = 0;
        Random ran = new Random();
        if (swap == false){ //Tests for not swapping it.
            for (int i = 0; i > runtime; i++){
                int choice = ran.nextInt(2); //gives a new choice 0-2, since it doesnt start at 1 to go to three.
                int winner = ran.nextInt(2);//Winner

                
                if (choice == winner){
                    hittime++;
                }

            }


        }

        if (swap == true){ //Tests for if its swapped.
            for (int i = 0; i < runtime; i++){
                int choice = ran.nextInt(2);
                

            }


        }

        System.out.println(hittime/runtime * 100);
        return hittime/runtime * 100;

    }

}
