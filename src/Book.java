public class Book {
    private final String nameBook;
    public final Author author;
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
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameBook.equals(book.nameBook);
    }
}
