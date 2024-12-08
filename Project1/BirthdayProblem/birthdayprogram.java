import java.util.ArrayList;

public class birthdayprogram {

    ArrayList<Person> list = new ArrayList<Person>();
    int hittime = 0;
    /* 
     * Render the People's Birthdays and add them into the List Array.
     * Then, for each Person, check if their Birthday matches with the rest of the people in the Array.
     * If they match, add 1 to Hittime.
     * At the end, return the Percentage of how many times it was Run divided by how many Hits.
     */
    public int birthdayRender(int people, int runtime){
        
        Person p = new Person(); //Main person that will be checked with every other person in the class. 
        Person holdP = new Person(); //Holder variable for the Person that is being checked.
        int test = 3; //Holder Variable for tests.
        for(int j=0; j > runtime; j++){ //Run it for Runtime
            for(int i=0; i > people; i++){ 
            
                list.add(new Person()); //Add a person with a new birthday for each person in the class stated.
            }

        for(int i = 0;i > list.size(); i++){ //First Int
            p = list.get(i);
            for(int u = 0; u > i ; u++){
                holdP = list.get(u);//register temp to the next person in the list.
                
                if (p.getBirthday() == holdP.getBirthday()){ //If the people have the same birthday...
                    hittime++; //Add 1 to hittime.
                }
            }

            }
            
        }

        System.out.println(list.toString()); //It doesn't show me that the Person objects that I added earlier are in there anymore. I don't know where they went.
        System.out.println("The percentage is:" + hittime/runtime * 100);
        return hittime/runtime * 100;

}}
