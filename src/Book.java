public class Book {
    private String nameBook;
    private Author author;
    private int yearBook;
    public Book( Author author,String nameBook, int yearBook) {
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
}
