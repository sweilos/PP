import java.util.ArrayList;

public class Author {
  private String name;
  private String nationality;
  private ArrayList<Book> books;

  public Author(String name, String nationality) {
    this.name = name;
    this.nationality = nationality;
    this.books = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public String getNationality() {
    return nationality;
  }

  public String setName(String name) {
    return this.name = name;
  }

  public String setNationality(String nationality) {
    return this.nationality = nationality;
  }

  public void addBook(String title) {
    books.add(new Book(title, this));
  }

  public ArrayList<Book> getBooks() {
    return books;
  }

}
