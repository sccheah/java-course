import java.util.ArrayList;

// holds a set of books and provide various ways to search for books within the library

public class Library
{
    private ArrayList<Book> books;

    public Library()
    {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook)
    {
        books.add(newBook);
    }

    public void printBooks()
    {
        for (Book book : books)
            System.out.println(book);
    }

    public static void main(String[] args)
    {
        Library Library = new Library();

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Library.addBook(cheese);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);

        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        Library.printBooks();
    }

}