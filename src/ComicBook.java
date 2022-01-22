
 public  class ComicBook {
	String name;
	String price;
	private static ComicBook uniqueInstance;
//Implementing the Singleton pattern 
	
	public static ComicBook getInstance() {
		if(uniqueInstance==null) {
			System.out.println("Unique Instance of Comic Books\n");
			uniqueInstance= new ComicBook();
		}
		return uniqueInstance;
	}
	public String getName() {
		return name;
	}

	public void Order() {
		System.out.println("You have Ordered "+ name);
	}
	public void Pack() {
		System.out.println("Started packing your Order "+name);
	}
	
	
	public String toString() {
		StringBuffer display=new StringBuffer();
		display.append(name+"\n");
		display.append(price +"\n");
		return display.toString();
		
	}
}
