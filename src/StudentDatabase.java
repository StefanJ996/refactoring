import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private List<Student> students;

    public StudentDatabase() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentId)) {
                students.remove(i);
                break;
            }
        }
    }

    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void printAllStudents() {
        for (Student student : students) {
            printStudentDetails(student.getStudentId());
        }
    }

    public void printStudentDetails(String studentId)
    {
        if (findStudent(studentId) != null)
            printStudentInfo(findStudent(studentId));
        else {
            System.out.println("Student not found");
        }
    }

    private void printStudentInfo(Student student) {
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
    }

    public boolean isEligibleForScholarship(Student student) {
        return student.getEspb() >= 48;
    }
}
