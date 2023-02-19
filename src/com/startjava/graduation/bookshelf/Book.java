public class Book {
    private final String author;
    private final String title;
    private final int publishYear;
    private int bookInfoLength;

    public Book(String title, String author, String publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = Integer.parseInt(publishYear);
        this.bookInfoLength = author.length() + title.length() + publishYear.length();
    }

    public String getTitle() {
        return title;
    }

    public int getBookInfoLength() {
        return bookInfoLength;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}