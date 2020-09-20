import java.util.Scanner;
import java.lang.Math;

public class Calculator{
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            System.out.println("Quadratic Equation Solver");
            System.out.println("Enter value of a=");
            double a = kb.nextDouble();
            System.out.println("Enter value of b=");
            double b = kb.nextDouble();
            System.out.println("Enter value of c=");
            double c = kb.nextDouble();
            System.out.println("Answer x=");
            double answer1 = (-b + Math.sqrt(Math.pow(b, 2.0D) - 4.0D * a * c)) / (2.0D * a);
            double answer2 = (-b - Math.sqrt(Math.pow(b, 2.0D) - 4.0D * a * c)) / (2.0D * a);
            System.out.print(answer1 + "," + answer2);
    }
}
