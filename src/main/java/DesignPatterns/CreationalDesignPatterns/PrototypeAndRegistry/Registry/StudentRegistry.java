package DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry.Registry;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String,Student> studentRegistry;

    public StudentRegistry() {
        this.studentRegistry = new HashMap<>();
    }

    public void add(Student studentPrototype){
        this.studentRegistry.put(studentPrototype.getBatch().getName(),studentPrototype);
    }

    public Student getStudentRegistry(String batch) {
        return studentRegistry.get(batch);
    }
}
