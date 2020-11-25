
public class MainBook {

	
		 String title;
	    boolean borrowed;

	    // Creates a new Book
	    public MainBook(String bookTitle) {
	    	this.title = bookTitle;
	    	this.borrowed =false;
	        // Implement this method
	    }
	   
	    // Marks the book as rented
	    public void borrowed() {
	        this.borrowed =true;
	    }
	   
	    // Marks the book as not rented
	    public void returned() {
	        this.borrowed = false;
	    }
	   
	    // Returns true if the book is rented, false otherwise
	    public boolean isBorrowed() {
	        return this.borrowed;
	    }
	   
	    // Returns the title of the book
	    public String getTitle() {
	        return this.title;
	    }

}    
	 
	


