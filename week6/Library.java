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

    public ArrayList<Book> searchByTitle(String title)
    {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : books)
            if (StringUtils.included(book.getTitle(), title))
                found.add(book);

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher)
    {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : books)
            if (StringUtils.included(book.getPublisher(), publisher))
                found.add(book);

        return found;
    }

    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book : books)
            if (book.getYear() == year)
                found.add(book);

        return found;
    }

    public static void main(String[] args)
    {
        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: Library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
    }

}