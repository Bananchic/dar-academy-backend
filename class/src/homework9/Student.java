package homework9;

public class Student {
    private int id;
    private String name;
    private int year = 1;

    public Student(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseYear() {
        this.year++;
    }

    public String toString() {
        return "id: " + id + "\n" +
                "name: " + name + "\n" +
                "Год обучения: " + year + "\n";
    }
}
