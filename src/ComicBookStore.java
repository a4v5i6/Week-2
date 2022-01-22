
public class ComicBookStore {
	ComicBookFactory factory;
	
	public ComicBookStore(ComicBookFactory factory) {
		this.factory=factory;
	}
	
	public ComicBook Order(String name) {
		
		ComicBook book;
		
		book=factory.Order(name);
		book.Order();
		book.Pack();
		return book;
		
	}

}
