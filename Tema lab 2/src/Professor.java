public class Professor {
    String first_name;
    String last_name;

    @Override
    public String toString{
        return "Professor{"+"first name:"+first_name+",last name:"+last_name+"}";
    }
    public Professor(String first_name, String last_name){
        this .first_name=first_name;
        this .last_name=last_name;
    }


    ///tema ex 1
    public String getFullName() {
        Professor professor = new Professor("Popa", "Ion"); ///se declara un nou obiect de tipul professor
        String fullName = professor.getFullName();
        System.out.println(fullName);///se afiseaza numele complet
    }


}
