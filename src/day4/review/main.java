package src.day4.review;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        student1.introduce("reading");
        student2.introduce("travelling");

        Student.printSchoolName();
        Student.displayStudentCount();

    }
}
