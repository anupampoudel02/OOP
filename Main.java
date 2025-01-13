public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent("Alice", 20, 85.5);
        studentManager.addStudent("Bob", 22, 90.0);
        studentManager.addStudent("Charlie", 21, 78.0);

        System.out.println("Student Records:");
        studentManager.displayStudents();

        double average = studentManager.calculateAverageGrade();
        System.out.println("Average Grade: " + average);
    }
}