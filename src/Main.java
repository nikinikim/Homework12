public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Tolkien");
        Book book1 = new Book("Hobbit", author1, 1992);
        Author author2 = new Author("Robbin", "Hobb");
        Book book2 = new Book("Assassins quest", author2, 2020);
        Author author3 = new Author("Robbin", "Hobb");
        Book book3 = new Book("Fool's quest", author3, 1998);



        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;

        // addBook(books, book3); отключил, чтобы не мешал смотреть вывод Library

        Library library = new Library(3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.findBook("Fool's quest");
        library.changeReleaseYear("Fool's quest", 2021);
        library.findBook("Fool's quest");

    }
    // средняя сложность
    public static void addBook(Book[] books, Book book) {

        for (int i = 0; i < books.length; i++){
            if (books[i] == null) {
                books[i] = book;
                System.out.printf("%s %s: %s: %d", books[i].getAuthor().getName(), books[i].getAuthor().getLastName(),
                        books[i].getBookName(), books[i].getReleaseYear());
                System.out.println();
                return;
            }

        }

    }

}


