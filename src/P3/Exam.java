package P3;

public class Exam {
    public int rollno;
    public String course;
    public int marks;

    public Exam() { //non parameterized constructor
        rollno = 0;
        course = "Unknown";
        marks = 0;
    }

    public void setvalue(int rollno, String course, int marks){
        this.rollno = rollno;
        this.course = course;
        this.marks = marks;
    }

    public void setvalue(int rollno, int marks){
        this.rollno = rollno;
        this.marks = marks;
    }
    public void display(){
        System.out.println(rollno+" "+course+" "+marks);
    }
}
