package src.day4.review;

public class Student {
    String name;
    int age;
    //difference between instance and static variables
    // use instance for data specific to each object
    // use static for data shared across all objects
    static String schoolName = "IU";
    static int studentCount = 0;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount++;
    }

    //Method to introduce the student
    public void introduce(String hobby){
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I love " + hobby +".");
    }

    //method to print school name
    static void printSchoolName() {
        System.out.println("School Name: " + schoolName);
    }
    
    //method to display student count
    static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);
    }
}
