package BLC_ELC;

public class Book {
	private int bookid;
	private String title;
	private int availableCopies;
	public Book(int id,String Title,int copies)
	{
		bookid=id;
		title=Title;
		availableCopies=copies;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	public void borrowBook() {
        System.out.println("Attempting to borrow a book...");
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(
              "Book borrowed successfully! Updated Available Copies: "
              + availableCopies
            );
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }
public void returnBook() {
    System.out.println("Attempting to return a book...");
    availableCopies++;
    System.out.println(
      "Book returned successfully! Updated Available Copies: "
      + availableCopies
    );
	
}
}


