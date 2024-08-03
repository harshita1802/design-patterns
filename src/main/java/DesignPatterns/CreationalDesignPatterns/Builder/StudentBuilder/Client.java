package DesignPatterns.CreationalDesignPatterns.Builder.StudentBuilder;

public class Client {
    public static void main(String[] args) {
        Student st = Student.builder().age(26)
                .psp(92.66)
                .phoneNum("7760124028")
                .gradYear(2021)
                .id(1)
                .name("Harshita")
                .build();

        System.out.println(st);


    }
}
