public class Student {
    String fisrtName;
    String lastName;
    int groupNumber;
    @Override
    public String toString{
        return "Student{"+"first name:"+fisrtName+",last name:"+lastName+"group number:"+groupNumber+"}";
    }
    public String getFisrtName(){
        return fisrtName;
    }
    public void setFisrtName(String fisrtName){
        this. fisrtName=fisrtName;
    }
    public String getLastName(){
        return lastName;
    }
    public  void setLastName(String lastName)
    {
        this .lastName=lastName;
    }
    public int getGroupNumber(){
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


    ///tema ex 1

    public String getFullName() {
        Student student = new Student("Iordache", "Maria", 1234); ///se declara un obiect de tipul student
        String fullName = student.getFullName();
        System.out.println( fullName);///se afiseaza numele complet
    }

    public double getGrade() { ///pt ex 3,4,5
        return 0;
    }
}
