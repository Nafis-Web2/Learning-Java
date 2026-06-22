package university.main;
import university.Student;
import university.Course;
import university.Enrollment;


public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student();
        student1.studentId = 1;
        student1.name = "Alice";

        Student student2 = new Student();
        student2.studentId = 2;
        student2.name = "Bob";

        // Create courses
        Course course1 = new Course();
        course1.courseID = 101;
        course1.courseName = "Introduction to Computer Science";

        Course course2 = new Course();
        course2.courseID = 102;
        course2.courseName = "Data Structures";

        // Enroll students in courses
        Enrollment enrollment1 = new Enrollment();
        enrollment1.student = student1;
        enrollment1.course = course1;

        Enrollment enrollment2 = new Enrollment();
        enrollment2.student = student2;
        enrollment2.course = course2;

        // Print enrollment details
        System.out.println(student1.name + " is enrolled in " + enrollment1.course.courseName);
        System.out.println(student2.name + " is enrolled in " + enrollment2.course.courseName);
    }
}
