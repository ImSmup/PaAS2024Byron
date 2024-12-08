package Project2.StatsLibraryTwo;

public class statsLibraryTwoTester {
    

      public static void main(String[] args){
        Project2.StatsLibraryTwo Lib = new Project2.StatsLibraryTwo();

        double result = Lib.negBinomialProb(7, 5, 0.5);
        System.out.println("Negative Binomial Probability = " + result);
    }


}
