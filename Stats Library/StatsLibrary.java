import java.util.ArrayList;
import java.util.*;

public class StatsLibrary{

    /*
     * Compute the Mean of the ListOfNumbers.
     */
    public double computeMean(ArrayList<Integer> listOfNumbers){
        int sum = 0;
        for(int singleNumber : listOfNumbers){
            sum = sum + singleNumber;
        }
        return sum / (double) listOfNumbers.size();
    }
 
    /*
     * Compute the Median of the ListOfNumbers.
     */
    public double computeMedian(ArrayList<Integer> listOfNumbers){
        int hold = 0;
        hold = listOfNumbers.size() / 2;
        return (double) listOfNumbers.indexOf(hold);
    }

    /*
     * Compute the Mode of the listOfNumbers.
     */
    public double computeMode(ArrayList<Integer> listOfNumbers){
        int count = 0;
        int hold = listOfNumbers.indexOf(0);
        int mode = 0;
        int modeCount = 1;
        for (int i = 0; i < listOfNumbers.size(); i++){          
            
            if(listOfNumbers.indexOf(i) == hold){
                count++;
            } else{

                if (count > modeCount){
                    modeCount = count;
                    mode = hold;
                }

            count = 0;
            hold = listOfNumbers.indexOf(i);

            }

            
        }
        
        return (double) mode;
    }

    /*
     * Compute the Standard Deviation of the ListOfNumbers.
     */
    public double computeStandardDeviation(ArrayList<Integer> listOfNumbers){
        double temp = 0;
        double total = 0;
        double fin = 0;
        for (int i = 0; i < listOfNumbers.size(); i++){
            temp += listOfNumbers.get(i) - computeMean(listOfNumbers);
            total += temp;
            
        }
        System.out.println("" + temp + " " + total);
        fin = Math.sqrt(temp/listOfNumbers.size());

        return fin;

    }
}
