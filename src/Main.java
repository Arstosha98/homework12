public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book(new Author("Лев Николаевич","Толстой"),"Война и мир",1867);
        System.out.println(new Book(new Author("Лев Николаевич" ,"Толстой"), "Война и мир", 1867));

        System.out.println();
        Book crimeAndPunishment = new Book(new Author("Федор Михайлович","Достоевский"),"Преступление и наказание",1866);
        System.out.println(new Book(new Author("Федор Михайлович" ,"Достоевский"), "Преступление и наказание", 1866));

        System.out.println();
        crimeAndPunishment.setYearBook(1865);
        System.out.println("Преступление и наказание " + crimeAndPunishment.getYearBook());
        
        System.out.println();
        System.out.println("Сравнение книг - " + warAndPeace.equals(crimeAndPunishment));

        System.out.println();
        Author author = new Author("Лев Николаевич","Толстой");
        Author author1 = new Author("Федор Михайлович","Достоевский");
        System.out.println("Сравнение авторов - " + author.equals(author1));
    }
}