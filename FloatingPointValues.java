import java.util.Scanner;

public class FloatingPointValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double total = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        
        while (counter < 5) {
            System.out.print("Enter floating-point value #" + (counter + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                counter++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next();  // Clear the invalid input
            }
        }

        double average = total / 5;
        double interest = total * 0.2;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on Total at 20%: " + interest);
    }
}
