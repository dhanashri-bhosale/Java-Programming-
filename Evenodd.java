import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner scanner = new Scanner ( System.in );
        System.out.print("Enter a Number : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) 
            System.out.println("Even");
        else 
            System.out.println("Odd");

    }
}
