/**
 * This class defines fiction books and calculates the late fee specific to fiction books.
 *
 * Author: Nabiya Alam
 * Version: 1.0.0
 * Date: 10/17/2020
 */
package Problem3;

public class BookFiction extends Book {

    private final int lateFeePerDayInDollar = 2;
    private final String genres;

    public BookFiction(String title, String author, String genres) {
        super(title, author);
        this.genres = genres;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        super(anotherBook);
        this.genres = anotherBook.genres;
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
