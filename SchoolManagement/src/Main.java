

public class Main {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Sunnyvale High School");

        // Create teachers
        Teacher teacher1 = new Teacher("Mr. Smith", "T001");
        Teacher teacher2 = new Teacher("Ms. Johnson", "T002");

        // Create courses
        Course mathCourse = new Course("Mathematics", teacher1);
        Course scienceCourse = new Course("Science", teacher2);

        // Add courses to the school
        school.addCourse(mathCourse);
        school.addCourse(scienceCourse);

        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Enroll students in courses
        mathCourse.enrollStudent(student1); // Alice enrolls in Mathematics
        mathCourse.enrollStudent(student2); // Bob enrolls in Mathematics
        scienceCourse.enrollStudent(student1); // Alice enrolls in Science

        // Show enrolled students for each course
        mathCourse.showEnrolledStudents(); // Show students in Mathematics
        scienceCourse.showEnrolledStudents(); // Show students in Science

        // Show all courses offered by the school
        school.showCourses();
    }
}
