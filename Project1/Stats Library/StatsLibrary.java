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
        int hold = listOfNumbers.indexOf(0);
        int mode = listOfNumbers.get(0);
        int modeCount = 0;
        for (int i = 0; i < listOfNumbers.size(); i++){          
            int curNum = listOfNumbers.get(i);
            int count = 0;

            for (int j = 0; j < listOfNumbers.size(); j++){

                if (listOfNumbers.get(j) == curNum){
                    count++;
                }

            }

            if (count > modeCount){
                modeCount = count;
                mode = curNum;
            }

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

        double mean = computeMean(listOfNumbers);
        double temp = 0;
        double dividend = 1.0/(listOfNumbers.size() - 1);

        for (int i = 0; i < listOfNumbers.size(); i++){
            double hold = listOfNumbers.get(i) - mean;
            temp += hold * hold;
        }

        return dividend * temp;
    }


    /*
     * Compute the Contitional Probability of a List of Numbers.
     */
    public double computeConditionalProb(ArrayList<Integer> listOfNumbers){

        return 0;

    }


    /*
     * Compute the Binomial Distribution of a list of numbers.
     */

     public double computeBinomDistribution(ArrayList<Integer> listOfNumbers){
        return 0;
     }
     
     public double computeGeoDistribution(int numberOfTrials, double probability, int size){
        return 0;
     }


     /*
      * Compute the Factorial of a list of numbers.
      */
     public double computeFactorial(int input){
        double fin = 1;
        

        for (int i = 2; i <= input; i++){
            fin *= i;
        }
        
        return fin;
     }

     /*
      * Compute the Intersection in a given String.
      */
     public String computeIntersection(String input){


        return "";
     }

     /*
      * COmpute the Union of a given String.
      */
     public String computeUnion(String input){

        return "";
     }

     /*
      * Compute the Compliment of a given String.
      */
     public String computeCompliment(String input){

        return "";
     }

     /*
     * Compute Bayes Theorem with the given input. 
     * Probability must be the positive probability.
     */
    public double computeBayesTheorem(double topInput, double bottomInput, double prob){
        double topHold = prob * (topInput / bottomInput);
        double fin = topHold / (1 - prob);
        return fin;
    }

    

    //I still need to also add Binomial & Geometric Distirbution.


}
