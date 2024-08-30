import java.util.Scanner;

public class findBig3 {
    public static void main(String [] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int n1 = scanner.nextInt();

        System.out.print("Enter 2nd number : ");
        int n2 = scanner.nextInt();

        System.out.print("Enter 3rd number : ");
        int n3 = scanner.nextInt();


        if ( ( n1 >  n2 ) && ( n1 > n3 )) 
            System.out.print("First number is greater ");

        else if (( n2 > n1 ) && ( n2 > n3 )) 
            System.out.print("Second number is greater ");

        else if (( n3 > n1 ) && ( n3 > n2 )) 
            System.out.print("Third number is greater ");

        else if (( n1 == n2 ) && (( n1 > n3 ) || ( n2 > n3 ))) 
            System.out.print("First and Second numbers are greater thar third number ");

        else if (( n1 == n3 ) && (( n1 > n2 ) || ( n3 > n2 ))) 
            System.out.print("First and third numbers are greater thar second number ");

        else if (( n2 == n3 ) && (( n2 > n1 ) || ( n3 > n1 ))) 
            System.out.print("Second and third numbers are greater thar first number ");

        else 
            System.out.print("All numbers are same");
}
}