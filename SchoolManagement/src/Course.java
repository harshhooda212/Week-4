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