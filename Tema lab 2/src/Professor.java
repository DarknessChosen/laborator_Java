public class Professor extends Person {
    // Constructor implicit
    public Professor() {
        this.name = "";
        this.surname = "";
    }

    // Suprascrie metoda toString()
    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    // Tema ex 1: Get Full Name
    public String getFullName() {
        return name + " " + surname;
    }
}
