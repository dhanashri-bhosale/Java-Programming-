import java.util.Scanner;

public class findBig2 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")

        Scanner scanner = new Scanner ( System.in );
        System.out.print("Enter first Number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second Number : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) 
            System.out.println("First Number is greater than Second Number");
        else if (num1 < num2) 
            System.out.println("Second Number is greater than First Number");
        else 
            System.out.println("Both Numbers are Equal");
    }
}
