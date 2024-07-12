public class Student {
    private String name;
    private int age;
    private String studentId;
    private int espb;

    public Student(String name, int age, String studentId, int espb) {
        this.setName(name);
        this.setAge(age);
        this.setStudentId(studentId);
        this.setEspb(espb);
    }

    public boolean isAdult() {
        if (getAge() >= 18) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public boolean isEligibleForScholarship() {
        return getEspb() >= 48;
    }
}