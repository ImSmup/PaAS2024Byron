import java.util.ArrayList;

public class StatsLibraryTester{

    public static void main(String[] args){

        StatsLibrary tester = new StatsLibrary();

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for( int i = 1; i < 174; i++){
        listOfNumbers.add(i);
        }
        
        

        System.out.println(tester.computeMean(listOfNumbers));
        System.out.println(tester.computeMedian(listOfNumbers));
        System.out.println(tester.computeMode(listOfNumbers));
        System.out.println(tester.computeStandardDeviation(listOfNumbers));
    }

}