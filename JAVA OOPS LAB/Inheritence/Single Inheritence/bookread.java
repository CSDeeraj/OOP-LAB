class Book {

	void read() {
		System.out.println("Reading with the book in hand.");
	}
}

class Ebook extends Book {
	void download() {
		System.out.println("Downloading the book, then reading it in kindle tab");
	}
}

public class bookread {
	public static void main(String[] args) {
		Ebook ebook = new Ebook();
		System.out.println("From Books to Ebooks: The Difference;");
		ebook.read();    
		ebook.download(); 
	}
}
