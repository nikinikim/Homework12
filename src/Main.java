public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John", "Tolkien");
        Book book1 = new Book("Hobbit", author1, 1992);
        Author author2 = new Author("Robbin", "Hobb");
        Book book2 = new Book("Assassins quest", author2, 2020);
        Author author3 = new Author("Robbin", "Hobb");
        Book book3 = new Book("Fool's quest", author3, 1998);
        System.out.println(author1);
        System.out.println(book1);


        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;

        // addBook(books, book3); отключил, чтобы не мешал смотреть вывод Library



        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);


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


