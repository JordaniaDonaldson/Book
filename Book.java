/* Name: Jordania Donaldson
 * Book.java
 * Spec: Design and implement a class that contains instance data for the title, author, 
 * 		 publisher and copyright date. Define the Book constructor to accept and initialize
 * 		 this data. Include setter and getter methods for all instance data. Include a toString
 * 		 method that returns a nicely formatted, multi-line description of the book.
 */
public class Book 
{
 private String title, author, publisher, copyrightDate;
 public Book(String Title, String Author, String Publisher, String CopyRight)
 {
	 title=Title;
	 author=Author;
	 publisher=Publisher;
	 copyrightDate=CopyRight;
 }
 
 public void setTitle(String Title)
 {
	 title=Title;
	 System.out.println("New book title \'"+title+"\'");
 }
 
 public void setAuthor(String Author)
 {
	 author=Author;
	 System.out.println("Author has been changed to "+author);
 }
 
 public void setPublisher(String Publisher)
 {
	 publisher=Publisher;
	 System.out.println("Publisher has been changed to "+publisher);
 }
 
 public void setCopyRight(String Copyright)
 {
	 copyrightDate=Copyright;
	 System.out.println("Copy-Right date has been changed to "+copyrightDate);
 }
 
 public String getTitle()
 {
	 return title;
 }
 
 public String getAuthor()
 {
	 return author;
 }
 
 public String getPublisher()
 {
	 return publisher;
 }
 
 public String getCopyright()
 {
	 return copyrightDate;
 }
 
 public String toString()
 {
	 String description = ("\nThe book \'"+title+"\' written by "+author+"\nPublished by "+publisher+
			 " and copyrighted on "+copyrightDate+"\n");
	 return description;
 }
}
