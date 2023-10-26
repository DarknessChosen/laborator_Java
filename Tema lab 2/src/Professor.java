public class Professor {
    String first_name;
    String last_name;

    public Professor(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Professor{" + "first name:" + first_name + ", last name:" + last_name + "}";
    }

    // Tema ex 1: Get Full Name
    public String getFullName() {
        return first_name + " " + last_name;
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Popa", "Ion");
        String fullName = professor.getFullName();
        System.out.println(fullName);
    }
}
