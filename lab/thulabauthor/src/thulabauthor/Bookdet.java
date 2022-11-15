package thulabauthor;

public class Bookdet {
	static void display(Book b) {
		System.out.println("Book name:"+b.getBook());
		System.out.println("Author:"+b.getauth());
		System.out.println("published year:"+b.getPublishedyear());
		System.out.println("price of book is:"+b.getPrice());
		
	}

	public static void main(String[] args) {
   Book b=new Book("rich dad poor dad",1997,299,new Author("Robert kiyosaki",97));
   display(b);
	}

}

