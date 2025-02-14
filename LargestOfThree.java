import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            System.out.print("Enter the third number: ");
            int num3 = input.nextInt();

            int largest = Math.max(Math.max(num1, num2), num3);

            System.out.println("The largest number is: " + largest);

        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
