import java.math.BigInteger;

public class StatsLib2 {

    // Needed method to Calculate the Factorial
    /**
     * Calculate the Factorial of N
     * @param n
     * @return
     */
    private static BigInteger fact(int n) {

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    // Method to Calculate Combinations (nCr)
    /**
     * Calculate the Combination of nCR (N Choose R)
     * @param n
     * @param r
     * @return
     */
    private static BigInteger combo(int n, int r) {
        return fact(n).divide(fact(r).multiply(fact(n - r)));
    }

    /**
     * Calculate the Negative Binomial Probability
     * @param y
     * @param r
     * @param p
     * @return
     */
    public static double negBinomialProb(int y, int r, double p) {

        if (y < r || p < 0 || p > 1) {
            throw new IllegalArgumentException("Invalid Inputs. Check if y is Greater than r and 0 is Less Than/Equal to p and that p is Less Than/Equal to 1.");
        }
        double q = 1-p; //The Probability of the Opposite happening.
        BigInteger combinations = combo(y-1, r-1); //Combination of y-1 and r-1.
        double result = combinations.doubleValue() * Math.pow(p,r) * Math.pow(q, y-r); //Using the Formula, input and solve using the values.
        return result;

    }

    /**
     * Calculate the Hypergeometric Probability Distribution.
     * Where Y is the number of Successes, r is the Total Number of
     * Successes, N is the Total Population Size, and n is the Sample Size.
     * @param y
     * @param r
     * @param N
     * @param n
     * @return
     */
    public static double hyperGeoProb(int y, int r, int N, int n) {
        if (y < 0 || y > r || n - y > N - r) {
            throw new IllegalArgumentException("Invalid Inputs. Check that y is Less Than/Equal to r && n-y Less Than/Equal to N-r.");
        }

        // Calculate the Combinations
        BigInteger top1 = combo(r, y); //The Combo of r and y.
        BigInteger top2 = combo(N - r, n - y); //The Combo of N-r and n-y.
        BigInteger bot = combo(N, n); //The Combo of N and n.

        
        return top1.multiply(top2).doubleValue() / bot.doubleValue(); //Calculate the Probability
    }

    /**
     * Calculation of the Poisson Probability Distribution. Where Y is
     * the Number of Events, and λ (Lambda) is the Average Rate of events.
     * 
     * @param y
     * @param λ
     * @return
     */
    public static double poissonProb(int y, double λ) {
        if (λ <= 0) {
            throw new IllegalArgumentException("λ must be greater than 0.");
        }
        if (y < 0) {
            throw new IllegalArgumentException("Y must be a non-negative integer.");
        }

        //Calculate the Probability
        double numer = Math.pow(λ, y) * Math.exp(-λ);
        double dener = fact(y).doubleValue();

        return numer / dener;
    }
}