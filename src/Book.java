import java.util.Objects;

public class Book {

    private final String bookName;
    private final Author author;
    private int releaseYear;

    public Book(String bookName, Author author, int releaseYear) {
        this.bookName = bookName;
        this.author = author;
        this.releaseYear = releaseYear;
    }
    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
    @Override
    public String toString() {
        return String.format("%s: %s: %d", author.toString(), bookName, releaseYear);
    }
}
