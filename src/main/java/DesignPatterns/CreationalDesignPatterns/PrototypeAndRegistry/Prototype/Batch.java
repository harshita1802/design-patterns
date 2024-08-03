package DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry.Prototype;

public class Batch implements Prototype<Batch>{
    private String name;
    private Instructor instructor;
    private Modules module;

    public Batch(String name, Instructor instructor, Modules module) {
        this.name = name;
        this.instructor = instructor;
        this.module = module;
    }

    public Batch(Batch batch){
        this.name = batch.name;
        this.instructor = batch.instructor.clone();
        this.module = batch.module;
    }

    @Override
    public Batch clone() {
        return new Batch(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setModule(Modules module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "name='" + name + '\'' +
                ", instructor=" + instructor +
                ", module=" + module +
                '}';
    }
}
