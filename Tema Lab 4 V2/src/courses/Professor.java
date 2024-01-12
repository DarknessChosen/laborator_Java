package courses;

public class Professor extends Person {

    @Override
    public String toString() {
        return "Professor: " + name + " " + surname;
    }



    public Professor() {

        this.name = " ";
        this.surname = " ";

    }

    public Professor(String name, String surname) {

        this.name = name;
        this.surname = surname;

    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
