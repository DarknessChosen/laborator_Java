package courses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class CourseManager implements ISourceManager {

    List<Course> courses = new List<Course>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Course> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Course course) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Course> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Course> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Course get(int index) {
            return null;
        }

        @Override
        public Course set(int index, Course element) {
            return null;
        }

        @Override
        public void add(int index, Course element) {

        }

        @Override
        public Course remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Course> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Course> listIterator(int index) {
            return null;
        }

        @Override
        public List<Course> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public CourseManager()
    {

        Connection conn = null;
        courses = new ArrayList<Course>();


    }


    public void displayCoursesToConsole()
    {
        for(Course c : courses)
        {

            System.out.println(c);

        }

    }

    //Ex2
    public void DynamicCourseEnroll(Course course, Student student)
    {

        course.AddStudent(student);



    }


    //Studentii sunt sortati dupa grupe deja cand sunt adaugati in curs
    //Aici doar se afiseaza pe grupe
    public void GroupStudents(Course course)
    {
        int groupNumber = 0;

        for(Student s : course.students)
        {

            if(s.groupNumber != groupNumber)
                System.out.println("Group: " + s.groupNumber);
            System.out.println(s);
            groupNumber = s.groupNumber;

        }

    }


    //Ex4

    public int CalculateAverageGrade(Course course)
    {
        course.setAverageGrade(0);
        for(Student s : course.students)
        {
            course.AverageGrade += s.courseGrades[course.CourseNumber];
        }

        return course.AverageGrade /= course.students.size();

    }

    public int CalculateAverageProfessorGrade(Professor prof)
    {
        int contor=0;

        int ProfessorAverageGrade = 0;

            for(Course c : courses)
            {

                if(c.teacher == prof)
                {
                    ProfessorAverageGrade += CalculateAverageGrade(c);
                    contor++;
                }


            }

            return ProfessorAverageGrade/contor;
    }

    @Override
    public void AddCourse(Course course) {

        courses.add(course);
        SortCourses();


    }

    public Course SearchCourse(String courseName)
    {

        for(Course c : courses)
            if(c.name.equals(courseName)) return c;

        return null;
    }

    @Override
    public void UpdateCourse(Course course) {
 int contor = 0;
        for(Course c : courses) {
            if (c.name.equals(course.name)) {
                courses.add(course);
                courses.remove(c);

            }
                contor++;
        }
    }

    @Override
    public void DeleteCourse(Course course) {

        courses.remove(course);

    }

    //Functia De Sortare
    public void SortCourses()
    {

        Course[] sortedArray = new Course[courses.size()];
        Iterator<Course> iterator = courses.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            sortedArray[index] = iterator.next();
            index++;
        }



        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i].students.size() > sortedArray[j].students.size()) {

                    Course temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }


        courses.clear();
        for (Course num : sortedArray) {
            courses.add(num);
        }

    }


    @Override
    public List<Course> getCourses() {
        return null;
    }
}
