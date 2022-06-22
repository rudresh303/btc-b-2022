public class Bookstore {
	private String bookStoreName;
	private String bookStoreId;
	private Book[] books;

    //Declare getter and setter methods
	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	public String getBookStoreId() {
		return bookStoreId;
	}

	public void setBookStoreId(String bookStoreId) {
		this.bookStoreId = bookStoreId;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	// Function to calculate the discount for a genre of books
    public void calculateDiscount(Book book,double discountPercentage)
    {
    	String gen=book.getGenre();
    	if(gen.equals("fiction"))
    	{
    		double dis=book.getPrice()-(book.getPrice()*(discountPercentage/100));
    		book.setPrice(dis);
            System.out.println("~BOOK DETAILS AFTER DISCOUNT~  \n" +book+"\n");
    	}

    }

} 

