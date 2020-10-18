/**
 * This class defines comedy movies and calculates the late fee specific to comedy movies.
 *
 * Author: Nabiya Alam
 * Version: 1.0.0
 * Date: 10/17/2020
 */

package Problem3;

public class MovieComedy extends Movie {
    private final int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        super(rating, title);
    }

    // copy constructor
    public MovieComedy(MovieComedy anotherMovie) {
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    // returns the fees based on the numbers of days past due date and the fee
    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        if (numOfDaysPastDue <= 0) {
            return 0;
        }
        return lateFeePerDayInDollar * numOfDaysPastDue;
    }
}
