package practice;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Student {
    int Roll_no;
    String name;
    int marks;

    public Student( int roll_no,String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.Roll_no = roll_no;
    }
}



public class practical_hehe {
    
    
    public void insert(int rno, String name, int marks) throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Atest", "root", "")) {
            PreparedStatement s = con.prepareStatement("insert into student values (?,?,?)");
            s.setInt(1,rno);
            s.setString(2,name);
            s.setInt(3,marks);
            s.execute();
        }catch (Exception e){
        }
    }
    
    public void delete(int r) throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Atest", "root", "")) {
            PreparedStatement sel = con.prepareStatement("select * from student where Rollno = ?");
            sel.setInt(1,r);
            ResultSet tempset = sel.executeQuery();
            PreparedStatement d = con.prepareStatement("delete from student where Rollno = ?");
            d.setInt(1,r);
            d.execute();
            if(tempset.next()){
                System.out.println("Your record has been deleted.\n");
            }
            else {
                System.out.println("Error! There might be no data to be deleted.\n");
            }
        }catch (Exception e){
        }
    }
    
    public void select(int m) throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Atest","root","")) {
            PreparedStatement sel = con.prepareStatement("select * from student where Marks = ?");
            sel.setInt(1,m);
            ResultSet rst = sel.executeQuery();
            if(rst.next()){
                System.out.printf("%-10s %-10s %-10s\n", "Rollno", "Name", "Marks");
            }
            else {
                System.out.println("Sorry no records found.");
            }
            rst.close();
            ResultSet rs = sel.executeQuery();
            while(rs.next()){
                System.out.printf("%-10d %-10s %-10d\n",rs.getInt(1),rs.getString(2),rs.getInt(3));
            }
        }catch (Exception e){
        }
        System.out.println();
    }

    public boolean rgx(String name){
        Pattern p = Pattern.compile("[a-zA-Z]*[jJ]$");
        Matcher m = p.matcher(name);
        return m.find();
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        practical_hehe obj = new practical_hehe();
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<Student>();
        int f=1;
        while(f==1) {
            System.out.println("1 - To insert 10 records.");
            System.out.println("2 - To delete any record.");
            System.out.println("3 - To select any record.");
            System.out.println("0 - To exit.");
            switch (sc.nextInt()){
                case 1 -> {
                    for(int i=0;i<10;i++){
                        arr.add(new Student(sc.nextInt(),sc.next(),sc.nextInt()));
                        if(obj.rgx(arr.get(i).name)) {
                            obj.insert(arr.get(i).Roll_no, arr.get(i).name, arr.get(i).marks);
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Enter the roll number of student whose record you want to delete: ");
                    obj.delete(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter the marks of student whose record you want to select: ");
                    obj.select(sc.nextInt());
                }
                case 0 -> {
                    f=0;
                }
            }

        }
        sc.close();
    }
}