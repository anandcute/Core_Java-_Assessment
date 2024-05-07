public class Student {
    String name;
    int rollNO;
    int mark;

    Student(String student_name,int rollno,int marks){
        name=student_name;
        rollNO=rollno;
        mark=marks;
    }
    public void getDetails(){
        System.out.println("name: " + name + "\nRoll num : " + rollNO + "\ntotal marks : " + mark);

    }
    public static void main(String[] args) {
        Student s = new Student("Anand",123,450);
        s.getDetails();
        Student s1 = new Student("Anandkumar",1234,420);
        s1.getDetails();
    }
}
