import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Distance : ");
        double number = scanner.nextDouble();

        double meter = number * 1000 ;
        System.out.print("Meter " + meter);
    }
}

