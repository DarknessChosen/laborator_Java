package classes;

public class Classes {

    public static void main(String[] args)
    {

        Student[] students = new Student[]{new Student("Mircea" , "Voda" , 69420), new Student("Nicolae" , "Antonescu", 42069)};
        Professor prof = new Professor("Vadim" , "Tudor");
        Course course = new Course("Material Resistance", " Calculations of reactions ,\n" + "effort diagrams , calculations of geometry characteristics of \n" + "flat surfaces and calculations of resistance elements to simple stresses \n" , prof , students, 1);
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);

        //courseManager.displayCoursesToConsole();

        //Ex1
        System.out.println(prof.getFullName());
        System.out.println(students[0].getFullName());
        Student stud1 = new Student("Adrian" , "Mutu" , 2024);
        stud1.AddGrade(5);
        students[0].AddGrade(8);
        students[1].AddGrade(9);
        //Ex2
        courseManager.DynamicCourseEnroll(course , stud1);
        System.out.println(course);

        //Ex3
        System.out.println(courseManager.listStudentsInCourse("Material Resistance"));

        //Ex4
        System.out.println(courseManager.CalculateAverageGrade(course));

        //Ex5
        Course course2 = new Course("Python", "Python is an interpreted, object-oriented, high-level programming language with dynamic semantics developed by Guido van Rossuma" , prof , students , 2);
        courseManager.addCourse(course2);
        students[0].AddGrade(4);
        students[1].AddGrade(2);
        System.out.println(courseManager.CalculateAverageProfessorGrade(prof));



    }

}
