public class BookStoreImp1 {
	public static void main(String[] args) 
	{
		Book b=new Book();
		b.setIsbnNo(1254);
		b.setBookName("believe in yourself");
		b.setAuthor("joseph");
		b.setGenre("fiction");
		b.setPrice(500);
		System.out.println("~BOOK DETAILS BEFORE DISCOUNT~ \n"+b+"\n");
		Book[] bb=new Book[1];
		bb[0]=b;

		Bookstore b1=new Bookstore();
		b1.setBookStoreName("faizan store");
		b1.setBookStoreId("ID-bookstore");
		b1.setBooks(bb);
		b1.calculateDiscount(b, 25);

		System.out.println("---------------------------------------------------------------------------------");

		Book b3=new Book();
		b3.setIsbnNo(12);
		b3.setBookName("gggg.");
		b3.setAuthor("bb");
		b3.setGenre("cooking");
		b3.setPrice(350);
		System.out.println("~BOOK DETAILS BEFORE DISCOUNT~ \n"+b3);
		Book[] bb1=new Book[1];
		bb1[0]=b3;

		Bookstore b4=new Bookstore();
		b4.setBookStoreName("faizan store");
		b4.setBookStoreId("98-bookstore");
		b4.setBooks(bb1);
		b4.calculateDiscount(b3, 25);

	}

} 

