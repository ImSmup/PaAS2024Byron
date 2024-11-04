import java.util.ArrayList;

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

            
            hold = listOfNumbers.indexOf(i);

            }

            count = 0;
            
        }
        
        return (double) mode;
    }

    /*
     * Compute the Standard Deviation of the ListOfNumbers.
     */
    public double computeStandardDeviation(ArrayList<Integer> listOfNumbers){
        double fin = 0;
        fin = Math.sqrt(computeVariance(listOfNumbers));
        return (double)fin;

    }


    /*
     * Compute the Variance of the ListOfNUmbers
     */
    public double computeVariance(ArrayList<Integer> listOfNumbers){

        double temp = 0;
        double dividend = 1/(listOfNumbers.size() - 1);

        for (int i = 0; i < listOfNumbers.size(); i++){
            temp += listOfNumbers.get(i) - computeMean(listOfNumbers);
        }

        double fin = dividend*temp;

        return (double) fin;
    }


    /*
     * Compute the Contitional Probability of a List of Numbers.
     */
    public double compute(ArrayList<Integer> listOfNumbers){

        return 0;

    }


    /*
     * Compute the Binomial Distribution of a list of numbers.
     */

     public double computeBinomDistribution(ArrayList<Integer> listOfNumbers){
        return 0;
     }





}
