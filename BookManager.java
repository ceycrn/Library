public class BookManager {
    public void addBook(Book book) {
        System.out.println(book.getBookName() + " named book added.");
    }

    public void deleteBook(Book book) {
        System.out.println(book.getBookName() + " named book deleted.");
    }

    public void changebookName(Book book, String bookName) {
        book.setBookName(bookName);
    }

    public void changebookWriter(Book book, String bookWriter) {
        book.setWriterName(bookWriter);
    }

    public void changePublisher(Book book, String Publisher) {
        book.setPublisher(Publisher);
    }

    public void changeisbn(Book book, int isbn) {
        book.setISBN(isbn);
        ;
    }

    public void borrow(User user, Book book, int date) {
        System.out.println("-Name of the person: " + user.getName() + " " + user.getMidname() + " -"
                + "Borrowed this book: " + book.getBookName());
        System.out.println("Borrow date: " + date + ".04.2023");
        System.out.println("Return date: " + (date + 7) + ".04.2023");
    }
}
