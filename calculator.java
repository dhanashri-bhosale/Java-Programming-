import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        System.out.println("------Calculator-------");
        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Remainder");
        

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner( System.in );
        System.out.print("Choose your option : ");
        int num = scanner.nextInt();

        System.out.print("Enter first number : ");
        int num2 = scanner.nextInt();

        System.out.print("Enter second number : ");
        int num3 = scanner.nextInt();



        switch (num) {

            case 1 :
                int Addition = num2 + num3 ;
                System.out.println( " Answer : " + Addition );
                break;

            case 2 :
                int Subtraction = num2 - num3 ;
                System.out.println( " Answer : " + Subtraction );
                break;

            case 3 :
                double Multiplication = num2 * num3 ;
                System.out.println( " Answer : " + Multiplication );
                break;

            case 4 :
                double Division = num2 / num3 ;
                System.out.println( " Answer : " + Division );
                break;

            case 5 :
                double Remainder = num2 % num3 ;
                System.out.println(" Answer : " + Remainder );
                break;
        
            default:
                System.out.println(" Wrong Input ");
                break;
        }
    }
}
