package LAB_24_11_2021;

import java.util.Locale;
import java.util.Scanner;

public class Exception_Menu extends Exception{
    public static Integer i1;
    public static void main(String[] args) {
        int flag=1;
        while(flag==1) {
            System.out.println("Menu Driven Exception: \n");
            System.out.println("For ArithmeticException enter '1'");
            System.out.println("For ArrayIndexOutOfBoundsException '2'");
            System.out.println("For StringIndexOutOfBoundsException enter '3'");
            System.out.println("For NullPointerException enter '4'");
            System.out.println("For NumberFormatException enter '5'");
            System.out.println("To Exit enter '0'");
            System.out.print("\nEnter your value: ");
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.next());
            try {
                switch (n) {
                    case 1 -> {
                        System.out.println(10/0);
                        throw new ArithmeticException();
                    }
                    case 2 -> {
                        System.out.println(args[5]);
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    case 3 -> {
                        System.out.println("GLA".charAt(5));
                        throw new StringIndexOutOfBoundsException();
                    }
                    case 4 -> {
                        int i2;
                        i2=i1;
                        System.out.println(i2);
                        throw new NullPointerException();
                    }
                    case 5 -> {
                        int a = Integer.parseInt(null);
                        throw new NumberFormatException();
                    }
                    case 0 -> {
                        System.out.println("You are entering the Menu....");
                        flag=0;
                    }
                    default -> System.out.println("Enter a valid Number.\n");
                }
            } catch (Exception e) {
                System.out.print("Exception generated: ");
                System.out.println(e);
                System.out.println();
            }
        }
    }
}
