public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book(new Author("Лев Николаевич","Толстой"),"Война и мир",1867);
        System.out.println(warAndPeace.getAuthor().getName() + " " + warAndPeace.getAuthor().getSurName());
        System.out.println(warAndPeace.getNameBook());
        System.out.println(warAndPeace.getYearBook());

        System.out.println();

        Book crimeAndPunishment = new Book(new Author("Федор Михайлович","Достоевский"),"Преступление и наказание",1866);
        System.out.println(crimeAndPunishment.getAuthor().getName() + " " + crimeAndPunishment.getAuthor().getSurName());
        System.out.println(crimeAndPunishment.getNameBook());
        System.out.println(crimeAndPunishment.getYearBook());

        crimeAndPunishment.setYearBook(1865);
        System.out.println(crimeAndPunishment.getYearBook());
    }
}