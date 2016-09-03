/* Name: Jordania Donaldson
 * BookSelf.java
 * Spec: Design and implement a class that contains instance data for the title, author, 
 * 		 publisher and copyright date. Define the Book constructor to accept and initialize
 * 		 this data. Include setter and getter methods for all instance data. Include a toString
 * 		 method that returns a nicely formatted, multi-line description of the book. Create a 
 * 		 driver, whose main method instantiates and updates several book objects
 */
public class BookSelf
{
  public static void main(String[]args)
  {
	 System.out.println("This program exercises several methods of the Book class. No user input is needed");
	 System.out.println("Welcome to the BookShlef");
	 System.out.println();
	 
	 Book book1 = new Book("The Faults Within Our Stars", "John Green", "Dutton Punguin", "01/10/2012");
	 Book book2 = new Book("Clockwork Angel", "Cassandra Clare", "Walker Books", "09/22/2010");
	 Book book3 = new Book("City of Bones", "Cassandra Clare", "Margaret McElderly", "03/27/2007");
	 Book book4 = new Book("The Perks of Being a Wallflower", "Stephen Chbosky", "Pocket Books", "02/01/1999");
	 Book book5 = new Book("Two Graves", "Preston and Child", "Grand Central Publishing", "12/11/2012");
	 
	 System.out.println(book2.getTitle()+book2.getAuthor());
	 System.out.println(book3.getPublisher()+book3.getCopyright());
	 System.out.println(book1.toString());
	 System.out.println(book4.toString());
	 System.out.println(book5.toString());
	 
	 book5.setTitle("If I Stay");
	 book5.setAuthor("Gayle Foreman");
	 book5.toString();
	 
	 System.out.println("This program has ended. Thank you");
	 

  }
}
