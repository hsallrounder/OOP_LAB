package LAB_17_11_2021;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyExp {
    public static void m1(){
        m2();
    }
    public static void m2(){
        System.out.println(10/0);;
    }
    public static void main(String[] args){
        /*
        try(Scanner s=new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            //s=new Scanner(System.in);
            //int a=s.nextInt();
            //System.out.println(a);
        }
        catch (IOException obj) {
        }

        try{
            m1();
        }
        catch (ArithmeticException obj){
            System.out.println(obj);
        }
        System.out.println("end of the main method ");
         */
    }
}
