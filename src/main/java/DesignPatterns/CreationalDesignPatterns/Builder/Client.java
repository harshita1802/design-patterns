package DesignPatterns.CreationalDesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student("Harsh",2021,7760124028l);
        Student st2 = new Student("Raksh",2024,7760124028l);

        System.out.println(st1);
        System.out.println(st2);


    }
}
