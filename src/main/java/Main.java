import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Calculator myCalculator = new Calculator();

        System.out.println("Welcome to the calculator!");
        System.out.println("Please enter a command, or type 'quit' to exit:");

        String s = in.next();
        while(!s.equals("exit") && !s.equals("quit")) {
            if (s.equals("add")) {
                int first = in.nextInt();
                int second = in.nextInt();
                int res = myCalculator.add(first, second);
                System.out.println(res);
            } else if (s.equals("subtract")) {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(myCalculator.subtract(a, b));
            } else if (s.equals("multiply")) {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(myCalculator.multiply(a, b));
            } else if (s.equals("divide")) {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(myCalculator.divide(a, b));
            } else if (s.equals("fibonacci")) {
                int a = in.nextInt();
                System.out.println(myCalculator.fibonacciNumberFinder(a));
            } else if (s.equals("binary")) {
                int a = in.nextInt();
                System.out.println(myCalculator.intToBinaryNumber(a));
            } else {
                System.out.println("Invalid command. Try again, or type 'quit' to exit");
            }
            s = in.next();
        }



    }
}
