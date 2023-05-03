public class Book {

    int ISBN;
    String bookName;
    String writerName;
    String publisher;

    public Book() {

    }

    public Book(int iSBN, String bookName, String writerName, String publisher) {
        ISBN = iSBN;
        this.bookName = bookName;
        this.writerName = writerName;
        this.publisher = publisher;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
