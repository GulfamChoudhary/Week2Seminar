package Com.Tuturiol.Main;

public class Main {

    public static void main(String[] args) {
        Book[] myBooks = new Book[1];

        myBooks[0] = new Book("CIS5003","Gulfam");

        myBooks[0].setTitle("head first java");
        myBooks[0].setAuthor("Kathy Sierra");

        for(int i=0; i<myBooks.length; i++) {
            System.out.println("The book " + myBooks[i].getTitle() + " is written by " +myBooks[i].getAuthor());
        }
    }
}