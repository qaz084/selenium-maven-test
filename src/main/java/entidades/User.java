package entidades;

public class User {
    private String name;
    private Integer edad;

    public User() {
    }

    public User(String name, Integer edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
