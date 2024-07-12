public class Student {
    public String name;
    public int age;
    public String studentId;
    public int espb;

    public Student(String name, int age, String studentId, int espb) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.espb = espb;
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        }
        return false;
    }

}