public class Book {
    private final String author;
    private final String title;
    private final int publishYear;
    private int bookInfoLength;

    public Book(String title, String author, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.bookInfoLength = 35;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getBookInfoLength() {
        return bookInfoLength;
    }

    @Override
    public String toString() {
        return "Автор: " + author + ", Название: " + title + ", Год выпуска: " + publishYear;
    }
}