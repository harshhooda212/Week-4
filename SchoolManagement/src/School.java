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