
public class ComicBooks {
	public static void main(String [] args) {
		
	ComicBook book=ComicBook.getInstance();
	ComicBookFactory factory= new ComicBookFactory();
	
	ComicBookStore store= new ComicBookStore(factory);
	ComicBook book1=store.Order("The Spiderman");
	
	System.out.println(book1);
	// This will call the same instance without creating any other object
	ComicBook book2= ComicBook.getInstance();
	ComicBook book3= store.Order("The Flash");
	System.out.println(book3);
	

}
}