public class Classes {
    public static void main(String[] args){
        Student[] students= new Student[]{
                new Student("Andrei", "Negoita", 2231), new Student("Ion", "Mateiescu",4221)};///pt definit studentii
        Professor prof= new Professor("Anton", "Panaitescu");///pt definit profesorii
        Course course= new Course("Material Resistance","Calculation of reactions,\n"+"effort diagrams, calculations od geometric characteristics of \n"
                +"flat surfaces and calculations of resistance elements to simple  stresses\n", prof, students);
        CourseManager courseManager=new CourseManager();
        courseManager. addCourse();
        courseManager.displayCoursesToConsole();
    }
}
}
