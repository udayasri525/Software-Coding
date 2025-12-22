package BLC_ELC;

public class LibrarySystem {

    public static void main(String[] args) {

        Book obj = new Book(101, "Harry Potter", 2);

        System.out.println("Book Details:");
        System.out.println("Book ID: " + obj.getBookid());
        System.out.println("Title: " + obj.getTitle());
        System.out.println("Available Copies: " + obj.getAvailableCopies());
        System.out.println();

        // Fixed number of transactions
        for (int i = 1; i <= 5; i++) {

            if (i <= 3) {
                obj.borrowBook();   // first 3 operations → borrow
            } else {
                obj.returnBook();   // next operations → return
            }
        }

        System.out.println("Library system transactions completed.");
    }
}
