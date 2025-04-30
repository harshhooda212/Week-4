import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }
}

class Teacher {
    private String name;
    private String teacherId;

    public Teacher(String name, String teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public String getTeacherId() {
        return teacherId;
    }
}

class Course {
    private String courseName;
    private Teacher instructor;
    private List<Student> enrolledStudents;

    public Course(String courseName, Teacher instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has been enrolled in " + courseName);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public String getCourseName() {
        return courseName;
    }
}

class School {
    private String schoolName;
    private List<Course> courses;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course " + course.getCourseName() + " has been added to " + schoolName);
    }

    public void showCourses() {
        System.out.println("Courses offered by " + schoolName + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName() + " (Instructor: " + course.getInstructor().getName() + ")");
        }
    }
}

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
