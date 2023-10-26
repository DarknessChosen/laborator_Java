public class Student {
    String firstName;
    String lastName;
    int groupNumber;

    public Student(String firstName, String lastName, int groupNumber) { // Constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "first name:" + firstName + ", last name:" + lastName + ", group number:" + groupNumber + "}";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    // Exercise 1: Get Full Name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Exercise 4: Return Grade
    public double getGrade() {
        // Am implementat-o pentru a afisa nota studentului.
        return 0.0; // Placeholder value
    }
}