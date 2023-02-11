public class Book {
    private String author;
    private String title;
    private int publishYear;
    private int bookInfoLength;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getBookInfoLength() {
        return bookInfoLength;
    }

    public void setBookInfoLength(int bookInfoLength) {
        this.bookInfoLength = bookInfoLength;
    }

    @Override
    public String toString() {
        return "Автор: " + author + ", Название: " + title + ", Год выпуска: " + publishYear;
    }
}
