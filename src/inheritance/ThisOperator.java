package inheritance;

class Student{
    int rollNumber;
    String name;
    public void setStudentData(int rollNumber, String name){
        rollNumber = rollNumber;
        name= name;
    }
    public void showStudentData(){
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
        student.setStudentData(1,"Sam");
        student.showStudentData();

        Student1 s = new Student1();
        s.setStudentData(2,"SPD");
        s.showStudentData();
    }
}
