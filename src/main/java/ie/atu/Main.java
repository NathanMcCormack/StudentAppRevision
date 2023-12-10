package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student();
        Student student2 = new Student("nathan");
        Student student3 = new Student("Nathan", "20", "Engineering");

        student1.getUserInfo();
        student2.getUserInfo();
        student3.getUserInfo();

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}