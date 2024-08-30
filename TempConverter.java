import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fahrenheit : ");
        double Fahrenheit = scanner.nextDouble();

        double celcius = (Fahrenheit - 32) * ( 5.0 / 9.0 );
        System.out.print("Celcius : " + celcius + " C");
    }
}
