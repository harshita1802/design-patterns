package DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry.Prototype;

public class Main {
    public static void main(String[] args) {
       /* Object obj = new Integer(10);

        if(obj instanceof Integer){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        } */

        Instructor instructor = new Instructor("Sandeep Sinha","Atlassian");
        Batch batch = new Batch("Dec2023-Beginner",instructor,Modules.LLD);
        Student prototype = new Student(batch);

        Student cpy = prototype.clone();
        cpy.setName("Harshita B Maganur");
        cpy.setEmail("harshita18maganur@gmail.com");
        cpy.setGradYear(2021);

        System.out.println(prototype);
        System.out.println(cpy+"\n");

        System.out.println("---------After updating new instructor---------\n");

        Instructor instructor2 = new Instructor("Utkarsh Gupta","Scalar");
        cpy.getBatch().setInstructor(instructor2);

        System.out.println(prototype);
        System.out.println(cpy);

    }
}
