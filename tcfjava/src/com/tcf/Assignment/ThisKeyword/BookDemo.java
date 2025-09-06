package com.tcf.Assignment.ThisKeyword;

public class BookDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore store = new BookStore();

        // Default constructor
        Book b1 = new Book();
        b1.showDetails();
        b1.addToStore(store);

        // Parameterized constructor
        Book b2 = new Book(101, "We Were Never Meant To Be", "Palle Vasu", 299.99);
        b2.showDetails();
        b2.addToStore(store);

        Book b3 = new Book(102, "Shatter Me", "Tahereh Mafi", 299.99);
        b3.showDetails();
        b3.addToStore(store);

        // Returning current object
        Book returnedBook = b3.getBook();
        System.out.println("Returned Book Object: " + returnedBook);
	}

}
