package ie.atu;
import java.util.Scanner;

public class Student {
    private String name;
    private String email;
    private String course;

    Scanner scanner = new Scanner(System.in);

    public Student() {
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public Student(String name) {
        this.name = name;
        this.email = "";
        this.course = "";
    }

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void getUserInfo(){
        System.out.println("Enter student name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter student email: ");
        this.email = scanner.nextLine();

        System.out.println("Enter student course: ");
        this.course = scanner.nextLine();
    }


    @Override
    public String toString() {
        return "Student: " +
                "name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", course: '" + course + '\'';
    }
}
