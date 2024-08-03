package DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry.Registry;

public class Student implements Prototype<Student> {

    private String name;
    private String email;
    private int gradYear;
    private Batch batch;

    public Student(Batch batch){
        this.batch = batch;
    }

    public Student(Student s) {
        this.batch = s.batch.clone();
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getGradYear() {
        return gradYear;
    }

    public Batch getBatch() {
        return batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gradYear=" + gradYear +
                ", batch=" + batch +
                '}';
    }
}
