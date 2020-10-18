/**
 * This class defines action movies and calculates the late fee specific to action movies.
 *
 * Author: Nabiya Alam
 * Version: 1.0.0
 * Date: 10/17/2020
 */
package Problem3;

public class MovieAction extends Movie {

    private final int lateFeePerDayInDollar = 5;


    public MovieAction(String rating, String title) {
        super(rating, title);
    }

    // copy constructor
    public MovieAction(MovieAction anotherMovie) {
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

        // if the movies is overdue more than 5 days then the fee is doubled
        if (numOfDaysPastDue < 5) {
            return lateFeePerDayInDollar * numOfDaysPastDue;
        }
        return 2 * lateFeePerDayInDollar * numOfDaysPastDue;
    }
}
