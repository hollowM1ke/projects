import java.util.*;

public class SimpleCalculator {
    public static boolean closed = false;

    public static void  close() {
        closed = true;
    }


    public static void main(String[] args) {
        System.out.println("Calculator is on!");
        System.out.println();
        while(!closed) {
            Scanner scanner = new Scanner(System.in);
            System.out.println (
                    """
                    Choose function:
                    [1] Add/Subtract
                    [2] Multiplication
                    [3] Division
                    [4] Exponential Calculation
                    [5] Logarithm

                    [6] Exit
                    """
            );
            System.out.print("Input: ");
            int input = Integer.valueOf(scanner.nextLine());
            switch(input) {
                case 1:
                    add();
                    break;
                case 2:
                    mult();
                    break;
                case 3:
                    div();
                    break;
                case 4:
                    exp();
                    break;
                case 5:
                    log();
                    break;
                case 6:
                    close();
                    System.out.println("Calculator is off!");
                    break;
            }
        }
    }


    public static void add(){
        System.out.print("- Operand 1: ");
        Scanner scanner = new Scanner(System.in);
        double operand1 = Integer.valueOf(scanner.nextLine());
        System.out.print("- Operand 2: ");
        double operand2 = Integer.valueOf(scanner.nextLine());
        double result = operand1 + operand2;
        System.out.println("==> " + operand1 + " + "+ operand2 + " = " + result);
        System.out.println();
    };
    public static void mult(){
        System.out.print("- Operand 1: ");
        Scanner scanner = new Scanner(System.in);
        double operand1 = Integer.valueOf(scanner.nextLine());
        System.out.print("- Operand 2: ");
        double operand2 = Integer.valueOf(scanner.nextLine());
        double result = operand1 * operand2;
        System.out.println("==> " + operand1 + " * "+ operand2 + " = " + result);
        System.out.println();
    };
    public static void div(){
        System.out.print("- Operand 1: ");
        Scanner scanner = new Scanner(System.in);
        double operand1 = Integer.valueOf(scanner.nextLine());
        System.out.print("- Operand 2: ");
        double operand2 = Integer.valueOf(scanner.nextLine());
        double result = operand1 / operand2;
        System.out.println("==> " + operand1 + " / "+ operand2 + " = " + result);
        System.out.println();
    };
    public static void exp(){
        System.out.print("- Basis: ");
        Scanner scanner = new Scanner(System.in);
        double basis = Integer.valueOf(scanner.nextLine());
        System.out.print("- Exponent: ");
        double exponent = Integer.valueOf(scanner.nextLine());
        double result = Math.pow(basis, exponent);
        System.out.println("==> " + basis + " ^ "+ exponent + " = " + result);
        System.out.println();
    };
    public static void log(){
        System.out.print("- Value: ");
        Scanner scanner = new Scanner(System.in);
        double value = Integer.valueOf(scanner.nextLine());
        System.out.print("- Basis: ");
        double basis = Integer.valueOf(scanner.nextLine());
        double result = Math.log(value) / Math.log(basis);
        System.out.println("==> " + "log_" + value + " (" + basis + ") = " + result);
        System.out.println();
    };
}