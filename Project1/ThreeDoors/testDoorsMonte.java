package ThreeDoors;

public class testDoorsMonte {
    

    /*
     * This is the Monte Carlo problem. 
     * You are given the choice between three doors.
     * You are told to choose one. 
     * One of the three has a big prize. 
     * The other two have nothing.
     * After you choose one, they open one of the doors with nothing.
     * Then you are asked if you would like to swap to the other door.
     * This code checks what happens if:
     * 1) You decide to change, or
     * 2) You decide to stay.
     * 
     */
    public static void main(String[] args){
        doorsmonte Doors = new doorsmonte();

        Doors.monteDoors(10000, false);


    }
}
