import java.util.ArrayList;

class Readers {
  private String name;
  private ArrayList<Book> books;

  public Readers(String name) {
    this.name = name;
    this.books = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void addBooks(Book book) {
    books.add(book);
    book.getReaders().add(this);

  }

  public ArrayList<Book> getBooks() {
    return books;
  }
}