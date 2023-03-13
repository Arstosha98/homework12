import java.util.Objects;
public class Book {
    private final String nameBook;
    private final Author author;
    private int yearBook;

    public Book(Author author, String nameBook, int yearBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearBook = yearBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getYearBook() {
        return this.yearBook;
    }
    public void setYearBook(int yearBook){
        this.yearBook = yearBook;
    }
    @Override
    public String toString() {
        String Author = author.toString();
        return Author + ", " + nameBook + ", " + yearBook;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook,book.nameBook) && Objects.equals(yearBook, book.yearBook) && Objects.equals(author,book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearBook, author);
    }
}
