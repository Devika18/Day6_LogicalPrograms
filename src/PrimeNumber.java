import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int i;
        boolean b = false;
        for(i=2;i<=num;i++) {
            if (num % i == 0)
                b = true;
            break;
        }
        if(!b) {
            System.out.println(num+": is a Prime Number");
        }
        else
            System.out.println(num+": is not a Prime Number");
    }
}
