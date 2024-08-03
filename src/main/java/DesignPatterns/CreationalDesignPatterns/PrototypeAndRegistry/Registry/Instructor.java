package DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry.Registry;

public class Instructor implements Prototype<Instructor> {

    private String name;
    private String company;

    public Instructor(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Instructor(Instructor instructor){
        this.name = instructor.name;
        this.company = instructor.company;
    }

    @Override
    public Instructor clone() {
        return new Instructor(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
