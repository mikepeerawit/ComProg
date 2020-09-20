package com.mike;
import java.util.Scanner;
import java.lang.Math;

public class Calculator1{
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            System.out.println("Quadratic Equation Solver");
            System.out.println("Enter value of a=");
            int a = kb.nextInt();
            System.out.println("Enter value of b=");
            int b = kb.nextInt();
            System.out.println("Enter value of c=");
            int c = kb.nextInt();
            System.out.println("Answer x=");
            double answer1 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            double answer2 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            System.out.print(answer1 + "," + answer2);
    }
}
