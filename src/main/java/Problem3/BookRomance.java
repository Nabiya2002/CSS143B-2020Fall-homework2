/**
 * This class defines romance books and calculates the late fee specific to romance books.
 *
 * Author: Nabiya Alam
 * Version: 1.0.0
 * Date: 10/17/2020
 */
package Problem3;

public class BookRomance extends Book {

    private final int lateFeePerDayInDollar = 4;


    public BookRomance(String title, String author) {
        super(title, author);
    }

    public BookRomance(BookRomance anotherBook) {
        super(anotherBook);
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
