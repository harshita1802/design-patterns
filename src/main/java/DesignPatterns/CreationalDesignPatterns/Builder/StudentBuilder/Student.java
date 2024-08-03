package DesignPatterns.CreationalDesignPatterns.Builder.StudentBuilder;


public class Student {
    private int id;
    private String name;
    private int gradYear;
    private String phoneNum;
    private int age;
    private double psp;

    private Student(Builder b){
        this.id = b.id;
        this.name = b.name;
        this.gradYear = b.gradYear;
        this.phoneNum = b.phoneNum;
        this.age = b.age;
        this.psp = b.psp;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gradYear=" + gradYear +
                ", phoneNum='" + phoneNum + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                '}';
    }

    public static class Builder{
        private int id;
        private String name;
        private int gradYear;
        private String phoneNum;
        private int age;
        private double psp;


        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder phoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder psp(double psp) {
            this.psp = psp;
            return this;
        }

        private void validate(){
            if(gradYear > 2023){
                throw new GradYearInvalidException();
            }
            if(name == null){
                throw new NameInvalidException();
            }
            if(age < 18){
                throw new InvalidAgeException();
            }
        }

        public Student build(){
            validate();
            return new Student(this);
        }
    }

}
