public class MainProcess {
    public static void main(String[] args){
        StudentDatabase studentDatabase = new StudentDatabase();

        Student student1 = new Student("Nikola", 20, "220/23",  50);
        Student student2 = new Student("Ana", 25, "180/18", 21);
        Student student3 = new Student("Marija", 23, "200/20", 33);

        studentDatabase.addStudent(student1);
        studentDatabase.addStudent(student2);
        studentDatabase.addStudent(student3);

        studentDatabase.printAllStudents();

        studentDatabase.removeStudent("220/23");

        studentDatabase.printAllStudents();

        System.out.println(studentDatabase.isEligibleForScholarship(student2));

        System.out.println("Print student name " + studentDatabase.findStudent("180/18").getName());

        studentDatabase.printStudentDetails("200/20");    }
}
