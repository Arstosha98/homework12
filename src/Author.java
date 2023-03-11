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
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return name.equals(author.name);
    }
    @Override
    public String toString() {
        return name + " " + surName;
    }
}
