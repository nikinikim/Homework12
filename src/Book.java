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

}
