import java.util.ArrayList;

public class Book {
  private String title;
  private Author author;
  private ArrayList<Readers> readers;

  public Book(String title, Author author) {
    this.title = title;
    this.author = author;
    this.readers = new ArrayList<>();
  }

  public String getTitle() {
    return title;
  }

  public Author getAuthor() {
    return author;
  }

  public void addReader(Readers reader) {
    readers.add(reader);
    reader.getBooks().add(this);
  }

  public ArrayList<Readers> getReaders() {
    return readers;
  }
}