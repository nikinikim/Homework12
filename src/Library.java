public class Library {

    private Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        for (int j = 0; j < books.length; j++) {
            if (books[j] == null) {
                books[j] = book;
                System.out.printf("%s %s: %s: %d", books[j].getAuthor().getName(), books[j].getAuthor().getLastName(),
                        books[j].getBookName(), books[j].getReleaseYear());
                System.out.println();
                return;
            }
        }

    }
    public void findBook(String bookName){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getBookName().equals(bookName)) {
                System.out.printf("%s by %s %s was published in %s", books[i].getBookName(),
                        books[i].getAuthor().getName(), books[i].getAuthor().getLastName(), books[i].getReleaseYear());
                System.out.println();
                return;
            }
        }
        System.out.println("Unknown book. Let's try again");
    }
    public void changeReleaseYear(String bookName, int year){
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null && bookName.equals(books[i].getBookName())){
                books[i].setReleaseYear(year);
                return;
            }
        }
    }
}
