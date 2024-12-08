package Project_1;
import java.util.ArrayList;

public class StatsLibraryTester{

    public static void main(String[] args){

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Project1.StatsLibrary tester = new StatsLibrary();

        

        for(int i = 1; i < 174; i++){
        listOfNumbers.add(i);
        }
        listOfNumbers.add(50); //One extra to test Mode.
        
        

        System.out.println("Mean: " + tester.computeMean(listOfNumbers));
        System.out.println("Median: " + tester.computeMedian(listOfNumbers));
        System.out.println("Mode: " + tester.computeMode(listOfNumbers));
        System.out.println("Standard Deviation: " + tester.computeStandardDeviation(listOfNumbers));
        System.out.println("Variance: " + tester.computeVariance(listOfNumbers));
        System.out.println("Factorial: " + tester.computeFactorial(50));
        System.out.println("Computing Bayes Theorem with 1/2000, .4 Probability: " + tester.computeBayesTheorem(1, 2000, .4));
    }

}