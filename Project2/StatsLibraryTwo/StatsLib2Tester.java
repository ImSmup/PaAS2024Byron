public class StatsLib2Tester {
    public static void main(String[] args) {

        System.out.println("Negative Binomial Probability using Y=8, r=2, p=0.7: " + StatsLib2.negBinomialProb(8, 2, .7)); //Print out the result of Negative Binomial Probabilty.
        System.out.println("Calulation of Hypergeometric Probability using y=5, r=8, N=30, n=15: " + StatsLib2.hyperGeoProb(5, 8, 30, 15)); //Print out the result of the Hypergeometric Probability.
        System.out.println("Calculation using Poisson, Where 5 is Y and 8 is λ: " +  StatsLib2.poissonProb(5, 8)); //Print out the result of the Poisson Probability.

    }
}
