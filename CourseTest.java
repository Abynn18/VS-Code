class Course {
    static int totalStudents=0;
    static final String creatorName="CodeMentor Academy";
    String name;
    int duration;
    int students;
    Course(String name, int duration, int students) {
        this.name = name;
        this.duration = duration;
        this.students = students;
        totalStudents+=students;
    }
    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Duration: " + duration + " months");
        System.out.println("Enrolled Students: " + students);
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students in all courses: " + totalStudents);
    }
}
public class CourseTest {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 3,30);
        Course course2 = new Course("Web Development", 4,25);
        System.out.println("Course creator Name: "+Course.creatorName);
        System.out.println("Details of Course 1:");
        course1.displayInfo();
        System.out.println("Details of Course 2:");
        course2.displayInfo();
       

        Course.displayTotalStudents();
    }
}
