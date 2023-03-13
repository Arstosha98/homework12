import java.util.Objects;
public class Author {
    private final String name;
    private final String surName;

    public Author(String name, String surName){
        this.name = name;
        this.surName = surName;
    }
    public String getName(){
        return this.name;
    }
    public String getSurName(){
        return this.surName;
    }
    @Override
    public String toString() {
        return name + " " + surName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(name,author.name) && Objects.equals(surName,author.surName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,surName);
    }
}