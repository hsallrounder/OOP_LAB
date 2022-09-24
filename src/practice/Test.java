package practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int x = Integer.parseInt(sc.next());
        }
        catch(Exception exceptionObject){
            System.out.println(exceptionObject);
        }
        finally {
            sc.close();
        }
    }
}
