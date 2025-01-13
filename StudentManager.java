import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, int age, double grade) {
        Student student = new Student(name, age, grade);
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Grade: " + student.getGrade());
        }
    }

    public double calculateAverageGrade() {
        double total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }
        return students.size() > 0 ? total / students.size() : 0;
    }
}