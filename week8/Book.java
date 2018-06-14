public class Book {
    private String name;
    private int publishingYear;

    public Book(String name, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.publishingYear + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Book compared = (Book) object;

        if (this.publishingYear != compared.getPublishingYear()) {
            return false;
        }

        if (this.name == null || !this.name.equals(compared.getName())) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Book objectBook = new Book("Objectbook", 2000);
        Book anotherObjectBook = new Book("Objectbook", 2000);

        if (objectBook.equals(anotherObjectBook)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are not the same");
        }
    }
}