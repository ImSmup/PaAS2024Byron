import java.util.Random;

public class Person {
    private int birthday;
    Random ran = new Random();
    Person(){
    birthday = ran.nextInt(365);
    }

    /*
     * Return's the Person's Birthday in Day format. Out of 365 Days.
     */
    public int getBirthday(){
        return birthday;
    }

    /*
     * Set the Person's Birthday.
     */
    public void setBirthday(int userInputBirthday){
        birthday = userInputBirthday;
    }

    /*
     * This was a test for registering a Person's Birthday.
     */
    //public static void main(String[] args){
        //Person p = new Person();

        //System.out.println(p.getBirthday());
    //}
}
