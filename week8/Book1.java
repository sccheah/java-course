public class Book1 implements ToBeStored {
    private String bookWriter;
    private String bookName;
    private double weight;

    public Book1(String bookWriter, String bookName, double weight) {
        this.bookWriter = bookWriter;
        this.bookName = bookName;
        this.weight = weight;
    }

    public double weight() { return this.weight; }

    public String toString() {
        return bookWriter + ": " + bookName;
    }
}