/**
 * Created by Paul on 10/18/2016.
 */
import java.util.Scanner;
import java.io.*;


public class Rational  {
    Scanner userEntry = new Scanner(System.in);

    public static void main(String [] args) {
        // . next int to read a value in
        // check constructor to pass with no arguments

        Scanner userEntry = new Scanner(System.in);
        System.out.println("Welcome to the fraction calculator.");
        System.out.println("Enter the first numerator");
        int n = userEntry.nextInt();
        System.out.println("Enter the first denominator");
        int d = userEntry.nextInt();
        System.out.println("Enter the second numerator");
        int nu = userEntry.nextInt();
        System.out.println("Enter the second denominator");
        int dn = userEntry.nextInt();
        System.out.println("Enter an operation: ADD, SUBTRACT, MULTIPLY or DIVIDE ");
        String choice = userEntry.next();
        String Str = new String("");
        System.out.println(Str.toUpperCase() );
        //int Entry = userEntry.nextInt();

        //while (choice != "Q") // not sure if "" is right syntax

            System.out.println("Enter an operation: ADD, SUBTRACT, MULTIPLY or DIVIDE ");


            System.out.println(Str.toUpperCase() );
            switch (choice) {
                case "ADD":
                    System.out.println("In add case");
                    add();
                    break;
                case "SUBTRACT":
                    subtract();
                    break;
                case "MULTIPLY":
                    multiply();
                    break;
                case "DIVIDE":
                    divide();
                    break;
                case "Q":
                    System.exit(0);
                    break;

                default: throw new IllegalArgumentException();
            }

    }


        //Fraction [] facks = new Fraction[2];
        //facks [0] = new Fraction(1,2);
        //facks [1] = new Fraction(2,3);//

    public static void add ()
    {
        int n = 1;
        int d = 1;
        int nu = 1;
        int dn = 1;
        int num = 1;
        int den = 1;
        Fraction a = new Fraction(n,d);
        Fraction b = new Fraction(nu,dn);
        Fraction c = new Fraction(num,den);
        c = b.add(a);
        System.out.println(a + " + " + b + " = " + c );

    }
    // I wanted to put all these initializer's into one methoed but it threw an error and im not sure why
    public static void subtract ()
    {
        int n = 1;
        int d = 1;
        int nu = 1;
        int dn = 1;
        int num = 1;
        int den = 1;
        Fraction a = new Fraction(n,d);
        Fraction b = new Fraction(nu,dn);
        Fraction c = new Fraction(num,den);
        c = a.subtract(b);
        System.out.println(a + " - " + b + " = " + c );
    }

    public static void multiply()
    {
        int n = 1;
        int d = 1;
        int nu = 1;
        int dn = 1;
        int num = 1;
        int den = 1;
        Fraction a = new Fraction(n,d);
        Fraction b = new Fraction(nu,dn);
        Fraction c = new Fraction(num,den);
        c = a.multiply(b);
        System.out.println(a + " * " + b + " = " + c );
    }

    public static void divide()
    {
        int n = 1;
        int d = 1;
        int nu = 1;
        int dn = 1;
        int num = 1;
        int den = 1;
        Fraction a = new Fraction(n,d);
        Fraction b = new Fraction(nu,dn);
        Fraction c = new Fraction(num,den);
        c = a.divide(b);
        System.out.println(a + " / " + b + " = " + c );
    }



}


