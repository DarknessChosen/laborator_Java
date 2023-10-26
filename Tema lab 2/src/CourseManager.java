import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CourseManager {
    Course[] courses;
    public CourseManager{
        Connection conn=null;
        courses=new Course[0];
    }
    public void addCourse(Course course){
        int newLength= courses.length +1;
        Course[] aux=new Course[newLength];
        int index=0;
        for(Course c:courses){
            aux[index++]=c;
        }
        aux[index]=course;
        this.courses=new Course[newLength];
        System.arraycopy(aux,0,courses,0,newLength);

    }
    public void displayCoursesToConsole(){
        for(Course c:courses){
            System.out.println(c);
        }
    }


    ///TEMA EX 2
    public void enrollStudent(String courseName, Student student) {
        for (Course course : courses) { ///se parcurge element cu element din lista clasei courses
            if (course.getName().equals(courseName)) { /// se verifica daca se indeplineste conditia(numele cursului este acelasi cu numele cursului specifica)
                course.addStudent(student);///daca da se adauga studenti
                return;///pt a iesi din metoda
            }
        }
        System.out.println(courseName); /// nu s a gasit cursul specificat
    }




    ///TEMA EX 3
    public List<Student> listStudents(String courseName) { ///se initializeaza o lista goala
        List<Student> studentsInCourse = new ArrayList<>();

        for (Course course : courses) { ///se parcurge tot "sirul de nume" din courses
            if (course.getName().equals(courseName)) { ///daca se gaseste un nume potrivit se cauta elemente de tip student care fac parte din cursul respectiv
                Student[] students = course.getStudents();]
                for (Student student : students) { ///se parcurge tot sirul din obiectul studenti
                    studentsInCourse.add(student);///daca se potriveste se adauga in lista
                }
                break;///se opreste bucla dupa finalizarea for-ului pt studenti
            }
        }

        if (studentsInCourse.isEmpty()) { ///se verifica daca dupa parcurgerea tuturor elementelor lista este goala
            System.out.println("CURSUL " + courseName + " nu are studenti"); ///se afiseaza mesaj
        }

        return studentsInCourse; ///se afiseaza lista
    }






    ///TEMA EX 4

    public double getAverageGrade(String courseName) {
        double totalGrade = 0.0; ///se initializeaza nota totala
        int totalStudents = 0; ///se initializeaza nr de studenti

        for (Course course : courses) { ///se parcurge fiecare element din clasa courses
            if (course.getName().equals(courseName)) { ///daca se indeplineste conditia(numele cursului este la fel cu numele cursului specificat)
                Student[] students = course.getStudents();///se obtine o lista cu toti studentii inscrisi la acel curs
                for (Student student : students) { ///se parcurge fiecare element din lista
                    totalGrade += student.getGrade(); ///se calculeaza nota
                    totalStudents++; ///se numara studentii
                }
                break; ///dupa finalizarea buclelor se opreste
            }
        }

        if (totalStudents == 0) { ///daca nr de studenti ramane 0
            System.out.println("Cursul" + courseName + "nu are studenti");
            return 0.0; ///nota finala ramane 0
        }

        return totalGrade / totalStudents;///daca nr de studenti e diferit de 0 se afiseaza media
    }

    ///TEMA EX 5
    public double getAverageGrade(Professor professor) {
        double totalGrade = 0.0; ///initializare nota totala
        int numberCourses= 0; ///initializare nr cursuri

        for (Course course : courses) { ///parcurgerea tuturor elementelor din clasa courses
            if (course.getTeacher().equals(professor)) { ///verificare daca indeplineste conditia(profesorul care preda cursul este acelasi cu prof din lista)
                Student[] students = course.getStudents();///daca da
                for (Student student : students) { ///se parcurge lista cu toti elevii inscrisi la curs
                    totalGrade += student.getGrade(); ///se aduna nota(suma notelor)
                }
                numberCourses++;///daca se indeplineste conditia nr de cursuri creste
            }
        }

        if (numberCourses == 0) {
            System.out.println("Profesorul nu preda niciun curs.");
            return 0.0;
        }

        return totalGrade / numberCourses; ///se returneaza media notelor
    }


}
