import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter x and y: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term: ");
        int x = sc.nextInt();
        System.out.println("Enter second term: ");
        int y = sc.nextInt();
        int term = 5;
        System.out.println("Fibonacci Series till " + term + " terms: ");

        for (int i = 1; i <= term; ++i) {
            System.out.print(x + ", ");

            // compute the next term
            int c = x + y;
            x = y;
            y = c;
        }
    }
}
