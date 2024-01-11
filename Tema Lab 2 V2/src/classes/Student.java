package classes;

public class Student {

    String firstName;
    String lastName;
    int groupNumber;

    int courseLength = 1;


    //Ex4
    int[] courseGrades = new int[100];

    public Student(String firstName, String lastName, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;


    }

    @Override
    public String toString() {
        return "Students: " + firstName + " " + lastName + ", Group Number: " + groupNumber;
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


    //Ex1
    public String getFullName()
    {

        return firstName + " " + lastName;

    }

    //Ex4
    public void AddGrade(int grade)
    {

        courseGrades[courseLength] = grade;
        courseLength ++;

    }

}
