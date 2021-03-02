package inheritance;

class Student{
    int rollNumber;
    String name;
    public void getStudentData(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name= name;
    }
    public void setStudentData(){
        System.out.println("Roll Number :" +rollNumber);
        System.out.println("Name :" + name);
    }
}

class Student1 extends Student{
    int rollNumber;
    String name;
}
public class ThisOperator {
    public static void main(String[] args) {
        Student student = new Student();
        student.getStudentData(1,"Sam");
        student.setStudentData();

//        Student1 s = new Student1();
//        s.getStudentData(2,"SPD");
//        s.setStudentData();
    }
}
