package LAB_24_11_2021;

import java.sql.*;

public class emp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //oracle.jdbc.oracleDriver
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_24_11_2021","root","");
        Statement s = con.createStatement();
        ResultSet rs =s.executeQuery("select * from emp");
        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
        }
    }
}
