package DesignPatterns.CreationalDesignPatterns.Builder;

public class Student{
    String name;
    int gradYear;
    long phoneNum;

    Student(String name,int gradYear,long phoneNum){
//        this.name = name;
//        this.gradYear = gradYear;
//        this.phoneNum = phoneNum;
        try {
            if (gradYear <= 2023 && name != null) {
                this.name = name;
                this.gradYear = gradYear;
                this.phoneNum = phoneNum;
            }
            else {
                throw new Exception("Invalid attributes");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

//    public static Student getInstance(String name,int gradYear,long phoneNum) {
//        try{
//            if(gradYear <= 2023 && name != null){
//                return new Student(name,gradYear,phoneNum);
//            }
//            else{
//                throw new Exception("Invalid attributes");
//            }
//
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        return null;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradYear=" + gradYear +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
