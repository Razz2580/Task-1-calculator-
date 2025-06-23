import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a+b;
    }

    public static double subtract(double a, double b) {

        return a-b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
    public static double divide(double a, double b){
        if(b==0) {
            System.out.println("Error: Division by zero is Infinite");
            return Double.NaN;
        }
        return a/b;
    }



    public static void main(String[] args) {

        Scanner snr=new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== Console Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = snr.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = snr.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = snr.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result = " + add(num1, num2));
                    case 2 -> System.out.println("Result = " + subtract(num1, num2));
                    case 3 -> System.out.println("Result = " + multiply(num1, num2));
                    case 4 -> System.out.println("Result = " + divide(num1, num2));
                }
            } else if (choice != 5) {
                System.out.println("❌ Invalid choice, please select 1 to 5.");
            }

        } while (choice != 5);

        System.out.println("👋 Goodbye! Thanks for using the calculator.");
        snr.close();
    }

    }
