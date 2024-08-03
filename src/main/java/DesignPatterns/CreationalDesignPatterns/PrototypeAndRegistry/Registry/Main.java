package DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry.Registry;

public class Main {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        Instructor instructor1 = new Instructor("Sandeep Sinha","Atlassian");
        Batch batch1 = new Batch("Dec2023-Beginner",instructor1,Modules.LLD);
        Student prototype1 = new Student(batch1);
        studentRegistry.add(prototype1);

        Instructor instructor2 = new Instructor("Utkarsh Gupta","Scalar");
        Batch batch2 = new Batch("Nov2022-Intermediate",instructor2,Modules.DSA);
        Student prototype2 = new Student(batch2);
        studentRegistry.add(prototype2);

        Instructor instructor3 = new Instructor("Prateek Narag","Flipkart");
        Batch batch3 = new Batch("Sep2022-Beginner",instructor3,Modules.SQL);
        Student prototype3 = new Student(batch3);
        studentRegistry.add(prototype3);

        System.out.println(studentRegistry.getStudentRegistry(batch1.getName()));
        System.out.println(studentRegistry.getStudentRegistry(batch2.getName()));
        System.out.println(studentRegistry.getStudentRegistry(batch3.getName()));
        System.out.println();

        Student stu1 = studentRegistry.getStudentRegistry(batch1.getName()).clone();
        stu1.setName("Harshita B Maganur");
        stu1.setEmail("harshita18maganur@gmail.com");
        stu1.setGradYear(2021);

        System.out.println(stu1);


    }
}
