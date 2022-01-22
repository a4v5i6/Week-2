
public class ComicBookFactory {
	public ComicBook Order(String name) {
		ComicBook book=null;
		if(name.equals("The Spiderman")) {
			book = new SpiderMan();
		}else if(name.equals("The Flash")) {
			book =new Flash();
		}else if(name.equals("Avengers")) {
			book = new Avengers();
		}
		return book;
		
	}

}
