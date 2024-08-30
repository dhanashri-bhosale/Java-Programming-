import java.util.Scanner;

public class addition{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st No : ");
        int no1 = scanner.nextInt();

        System.out.print("Enter 2nd No : ");
        int no2 = scanner.nextInt();

        int addition = no1 + no2;
        System.out.print("Output : " + addition);
        
    }
}