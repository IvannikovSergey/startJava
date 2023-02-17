public class Book {
    private final String author;
    private final String title;
    private final int publishYear;
    private int bookInfoLength;

<<<<<<< HEAD
    public Book(String title, String author, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.bookInfoLength = 35;
    }

    public String getAuthor() {
        return author;
=======
    public Book(String title, String author, int publishYear, int bookInfoLength) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.bookInfoLength = bookInfoLength;
>>>>>>> fd9dd47 (исправления)
    }

    public String getTitle() {
        return title;
    }

<<<<<<< HEAD
    public int getPublishYear() {
        return publishYear;
    }

=======
>>>>>>> fd9dd47 (исправления)
    public int getBookInfoLength() {
        return bookInfoLength;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}